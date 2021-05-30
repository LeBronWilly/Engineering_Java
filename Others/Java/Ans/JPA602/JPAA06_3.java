class Unit{
	int cost;
	int getCost() {
		return cost;
	}
}

class LCD extends Unit{
	LCD(int l){
		if(l==10) {
			cost = 2000;
		}
		else if(l==15) {
			cost = 2500;
		}
		else if(l==17) {
			cost = 3000;
		}
	}
}

class CPU extends Unit{
	CPU(double s){
		if(s==1.66) {
			cost = 6000;
		}
		else if(s==2.2) {
			cost = 8000;
		}
		else if(s==2.4) {
			cost = 11000;
		}
	}
}

class HD extends Unit{
	HD(String g){
		if(g=="120G") {
			cost = 2400;
		}
		else if(g=="160G") {
			cost = 2800;
		}
	}
}

class Note extends AllPC{
	double cost;
	LCD l;
	CPU c;
	HD h;
	Note(int ll, double cc, String hh) {
		l=new LCD(ll);
		c=new CPU(cc);
		h=new HD(hh);
		// TODO Auto-generated constructor stub
	}
	double getCost() {
		return cost*1.4;
	}
	double getPrice() {
		return cost*2.0;
	}
}

class MiniNote extends Note{
	public MiniNote() {
		super(10, 1.66, "120G");
		cost = l.getCost()+c.getCost()+h.getCost();
		// TODO Auto-generated constructor stub
	}
}

class Note15 extends Note{
	public Note15() {
		super(15, 2.2, "160G");
		cost = l.getCost()+c.getCost()+h.getCost();
		// TODO Auto-generated constructor stub
	}
}

abstract class PCandMultiPC extends AllPC{
	double cost;
	CPU c;
	HD h;
	PCandMultiPC() {
		c=new CPU(2.4);
		h=new HD("160G");
		// TODO Auto-generated constructor stub
	}
	abstract double getCost();
	double getPrice() {
		return cost*1.8;
	}
}

class PC extends PCandMultiPC{
	PC(){
//		super();
		cost = c.getCost()+h.getCost();
	}
	double getCost() {
		return cost+500;
	}
}

class MultiPC extends PCandMultiPC{
	MultiPC(int a,int b){
//		super();
		cost = a*c.getCost()+b*h.getCost();
	}
	double getCost() {
		return cost*1.2;
	}
}

class AllPC{
	boolean isExpensive(PC yy, Note15 xx) {
		if(xx.getPrice()>yy.getPrice()) {
			return true;
		}
		else {
			return false;
		}
	}
}





public class JPAA06_3 {
    public static void main(String args[]) {
        PC pc = new PC();
        Note15 note15 = new Note15();
        AllPC allpc= new AllPC();
        if(allpc.isExpensive(pc,note15)==true) {
        	System.out.println("Note15 is more expensive then PC");
        }
        else {
        	System.out.println("PC is more expensive then Note15");
		}
    }
}