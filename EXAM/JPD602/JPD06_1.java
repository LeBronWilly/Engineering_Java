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

abstract class Note{
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


class JPD06_1 {
    public static void main(String args[]){
        MiniNote mininote = new MiniNote();
        System.out.println("MiniNote cost:"+mininote.getCost()+", price:"+(int)mininote.getPrice());
        Note15 note15 = new Note15();
        System.out.println("Note15 cost:"+note15.getCost()+", price:"+(int)note15.getPrice());        
    }
}