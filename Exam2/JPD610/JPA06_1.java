abstract class Worker{
	String n;
	Worker(String num) {
		n=num;
		// TODO Auto-generated constructor stub
	}
	abstract double monthPay();
}

class SalaryWorker extends Worker{
	int s;
	SalaryWorker(String num,int salary){ // super是用來呼叫父類別的建構子
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





public class JPA06_1 {
   public static void main(String argv[]) {
        SalaryWorker sw1 = new SalaryWorker("96001",180000);
        System.out.println("SalaryWorker：" + sw1.monthPay());
        HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);
        System.out.println("HourlyWorker：" + hw1.monthPay());
        Manager ma1 = new Manager("97001", 240000, 5000);
        System.out.println("Manager：" + ma1.monthPay());
    }
}