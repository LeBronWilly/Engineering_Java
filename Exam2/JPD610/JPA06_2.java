
abstract class Worker{
	String n;
	Worker(String num) {
		n=num;
		// TODO Auto-generated constructor stub
	}
	abstract double monthPay();
	double monthTaxes() {
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



public class JPA06_2 {
    public static void main(String argv[]) {
        
    	SalaryWorker sw1 = new SalaryWorker("96001",180000);
        System.out.println("SalaryWorker：" + sw1.monthPay());
        HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);
        System.out.println("HourlyWorker：" + hw1.monthPay());
        Manager ma1 = new Manager("97001", 240000, 5000);
        System.out.println("Manager：" + ma1.monthPay());
        
        sw1.compareS(hw1);
        hw1.compareS(ma1);


        System.out.println("SalaryWorker稅額：" + sw1.monthTaxes());
        System.out.println("HourlyWorker稅額：" + hw1.monthTaxes());
        System.out.println("Manager稅額：" + ma1.monthTaxes());    
    }
//    static compareS()
}