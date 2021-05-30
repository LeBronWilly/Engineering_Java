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

abstract class PCandMPC{
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

class JPD06_2 {
    public static void main(String args[]){
        PC pc = new PC();
        System.out.println("PC cost:"+pc.getCost()+", price:"+pc.getPrice());
        MultiPC multipc1 = new MultiPC(2, 4);
        System.out.println("MultiPC: 2CPU, 4HD, cost:"+multipc1.getCost()+", price:"+multipc1.getPrice());
        MultiPC multipc2 = new MultiPC(4, 8);
        System.out.println("MultiPC: 4CPU, 8HD, cost:"+multipc2.getCost()+", price:"+multipc2.getPrice());
    }
}