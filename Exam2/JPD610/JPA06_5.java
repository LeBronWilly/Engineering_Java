import java.util.HashMap;
import java.util.Iterator;

abstract class Worker{
	String n;
	static int count;
	static double totaltax;
	
	Worker(String num) {
		n=num;
		count += 1;
	}
	
	abstract double monthPay();
	double monthTaxes() {
		totaltax += this.monthPay()*0.15;
		return monthPay()*0.15;
	};
	
	void compareS(Worker worker) {
		if(this.monthPay()>worker.monthPay()) {
			System.out.println(this.n+"較高");
		}
		else {
			System.out.println(worker.n+"較高");
		}
	}
	
	static double getAverageTax() {
		return totaltax/count;
	}
	
}


class SalaryWorker extends Worker{
	int s;
	SalaryWorker(String num,int salary){ // super是用來呼叫父類別的建構子！！！！！
		super(num);
		s=salary;
	}
	double monthPay() {
		return s/12;
	}
}


class HourlyWorker extends Worker{
	int w;
	int h;
	HourlyWorker(String num,int wage, int hr){
		super(num);
		w=wage;
		h=hr;
	}
	double monthPay() {
		return w*h;
	}
}


class Manager extends SalaryWorker{
	int b;
	Manager(String num,int salary,int bonus){
		super(num, salary);
		b=bonus;
	}
	double monthPay() {
		return s/12+b;
	}
}


class Management{
	HashMap wk; // 宣告wk為HashMap類別
	double total;
	Management() {
		wk = new HashMap();
	}
	void put(String n, Worker worker) {
		wk.put(n, worker);
	}
	double afterTax(String n) {
		Worker wAT = (Worker)wk.get(n); // 使用(Worker)將子類別轉成父類別。PS.父類別可以轉成子類別但通常沒意義
		return wAT.monthPay()-wAT.monthTaxes();
	}
	double totalSalary() throws limex{
		for(Iterator iterator = wk.values().iterator(); iterator.hasNext(); ) { // 一筆筆抓資料出來處理
			Worker wTS = (Worker)iterator.next();
			total += wTS.monthPay();
			if(total>50000) {
				throw new limex(total); // 拋出Exception(new為建構)，會往上丟，直到被catch到
			}
		}
		return total;
	}
}


class limex extends Exception{ // 新增一個exception的類別(自定義的例外類別)
	double dd;
	public limex(double d) {
		dd=d;
		// TODO Auto-generated constructor stub
	}
	double getAm() {
		return dd;
	}
}


public class JPA06_5 {
    public static void main(String argv[]) {
        SalaryWorker sw1 = new SalaryWorker("96001",180000);
        HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);        
        Manager ma1 = new Manager("97001", 240000, 5000);        
        Management m = new Management();
        
        m.put("96001", sw1);
        m.put("96002", hw1);
        m.put("97001", ma1);
        
        try {
			m.totalSalary(); // 要監控的程式碼
		} catch (limex e) {
			System.out.print("Total salary exceed limit: " + e.getAm());
			// TODO: handle exception
		}
    }
}