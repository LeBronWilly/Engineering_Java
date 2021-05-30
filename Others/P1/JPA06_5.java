import java.util.Iterator;
import java.util.LinkedList;

class Unit {
	int cost;
	int getCost(){
		return cost;
	}
}

class LCD extends Unit{
	public LCD(int size) {
		if(size==10) {
			cost=2000;
		}
		else if(size==15) {
			cost=2500;
		}
		else if(size==17) {
			cost=3000;
		}

		// TODO Auto-generated constructor stub
	}
}

class CPU extends Unit{
	public CPU(double speed) {
		if(speed==1.66) {
			cost=6000;
		}
		else if(speed==2.2) {
			cost=8000;
		}
		else if(speed==2.4) {
			cost=11000;
		}

		// TODO Auto-generated constructor stub
	}
}

class HD extends Unit{
	public HD(String g) {
		if(g=="120G") {
			cost=2400;
		}
		else if(g=="160G") {
			cost=2800;
		}

		// TODO Auto-generated constructor stub
	}
}

class Note extends AllPC{
	LCD lcd;
	CPU cpu;
	HD hd;
	double cost;
	Note(int a, double b, String c){
		lcd = new LCD(a);
		cpu = new CPU(b);
		hd = new HD(c);
		cost=lcd.getCost()+cpu.getCost()+hd.getCost();
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
		
		// TODO Auto-generated constructor stub
	}
}

class Note15 extends Note{
	public Note15() {
		super(15, 2.2, "160G");
		
		// TODO Auto-generated constructor stub
	}
}


abstract class PCandMultiPC extends AllPC{
	CPU cpu;
	HD hd;
	double cost;
	PCandMultiPC(){
		cpu = new CPU(2.4);
		hd = new HD("160G");
		cost=cpu.getCost()+hd.getCost();
	}
	abstract double getCost();
	double getPrice() {
		return cost*1.8;
	}
}

class PC extends PCandMultiPC{
	PC(){
		
	}
	double getCost() {
		return cost+500;
	}
}

class MultiPC extends PCandMultiPC{
	MultiPC(int x,int y){
		cost=cpu.getCost()*x+hd.getCost()*y;
	}
	double getCost() {
		return cost*1.2;
	}
}


abstract class AllPC {
	static boolean isExpensive(Note15 note15, PC pc) {
		if(note15.getPrice()>pc.getPrice()) {
			return true;
		}
		else {
			return false;
		}
	}
	abstract double getCost();
	abstract double getPrice();
}

class Order{
//	double total = 0.0; // 不能訪這裡欸??為何會變2倍
	LinkedList order;
	Order(){
		order = new LinkedList();
	}
	void in(AllPC allpc) {
		order.add(allpc);
	}
	double revenue() {
		double total = 0.0; // 為何呢?????
		for(Iterator iii=order.iterator(); iii.hasNext();) {
			AllPC a;
			a=(AllPC)iii.next();
			total+= (a.getPrice()-a.getCost());
		}
		return total;
	}
}

public class JPA06_5 {
    public static void main(String args[]){
        Order ord = new Order();
        ord.in(new MiniNote());
        ord.in(new Note15());
        ord.in(new PC());
       if(ord.revenue()>20000) {
    	   	System.out.println("This order exceeds 20000:"+ord.revenue());
        }
        else{
        	System.out.println(ord.revenue());
        }
    }
}