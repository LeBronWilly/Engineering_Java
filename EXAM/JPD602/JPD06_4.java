import java.util.Iterator;
import java.util.LinkedList;

class Unit{
	int cost;
	Unit(){
		cost=0;
	} // 建構子，初始化使用，這裡可加可不加，因為會有預設建構子
	public int getcost() {
		return cost;
	}
}

class LCD extends Unit{
	LCD(int i){
		if(i==10)
			cost=2000;
		else if(i==15)
			cost=2500;
		else
			cost=3000;
	}
}

class CPU extends Unit{
	CPU(double d){
		if(d==1.66)
			cost=6000;
		else if(d==2.2)
			cost=8000;
		else
			cost=11000;
	}
}

class HD extends Unit{
	HD(String s){
		if(s=="120G")
			cost=2400;
		else
			cost=2800;
	}
}

abstract class Note extends AllPC{
	double cost;
	LCD l; CPU c; HD dd;
	Note(int i, double d, String s){
		l = new LCD(i);
		c = new CPU(d);
		dd = new HD(s);
	}
	abstract public double getCost();
	abstract public double getPrice();
}

class MiniNote extends Note{
	MiniNote(){
		super(10,1.66,"120G");
		cost = l.getcost()+c.getcost()+dd.getcost();
	}
	public double getCost() {
		return cost*1.4;
	}
	public double getPrice() {
		return cost*2.0;
	}
}

class Note15 extends Note{
	Note15(){
		super(15,2.2,"160G");
		cost = l.getcost()+c.getcost()+dd.getcost();
	}
	public double getCost() {
		return cost*1.4;
	}
	public double getPrice() {
		return cost*2.0;
	}
}

abstract class PCandMPC extends AllPC{
	double cost;
	CPU c; HD dd;
	PCandMPC(double d, String s){
		c = new CPU(d);
		dd = new HD(s);
	}
	abstract public double getCost();
	abstract public double getPrice();
}

class PC extends PCandMPC{
	PC(){
		super(2.4,"160G");
		cost = c.getcost()+dd.getcost();
	}
	public double getCost() {
		return cost+500;
	}
	public double getPrice() {
		return cost*1.8;
	}
}

class MultiPC extends PCandMPC{
	MultiPC(int x,int y){
		super(2.4,"160G");
		cost = x*c.getcost() + y*dd.getcost();
	}
	public double getCost() {
		return cost*1.2;
	}
	public double getPrice() {
		return cost*1.8;
	}
}

abstract class AllPC{
	AllPC(){}
	abstract public double getCost();	
	abstract public double getPrice();	

}

class Order{
	LinkedList pcs;
	Order(){
		pcs = new LinkedList();
	}
	void in(AllPC allpc){
		pcs.add(allpc);
	}
	public double revenue() {
		double d = 0.0;
		for(Iterator iterator = pcs.iterator(); iterator.hasNext();) {
			AllPC allpc = (AllPC)iterator.next();
			d=d+allpc.getPrice();
			}
		return d;
	}
}

class JPD06_4 {
    public static void main(String args[]){
        Order ord = new Order();
        ord.in(new MiniNote());
        ord.in(new Note15());
        ord.in(new PC());
        System.out.println(ord.revenue());
    }
}