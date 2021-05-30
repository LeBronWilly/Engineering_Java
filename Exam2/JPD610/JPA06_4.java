import java.util.HashMap;
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
	Management() {
		wk = new HashMap(); // 建立新物件
	}
	void put(String n, Worker worker) {
		wk.put(n, worker);
	}
	double afterTax(String n) {
		Worker wAT = (Worker)wk.get(n); // 使用(Worker)將子類別轉成父類別。PS.父類別可以轉成子類別但通常沒意義
		return wAT.monthPay()-wAT.monthTaxes();
	}
}


public class JPA06_4 {
    public static void main(String argv[]) {
        SalaryWorker sw1 = new SalaryWorker("96001",180000);
        HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);        
        Manager ma1 = new Manager("97001", 240000, 5000);
        Management m = new Management();
        
        m.put("96001", sw1);
        m.put("96002", hw1);
        m.put("97001", ma1);
        System.out.println("97001 的稅後薪資：" + m.afterTax("97001"));
    }
}