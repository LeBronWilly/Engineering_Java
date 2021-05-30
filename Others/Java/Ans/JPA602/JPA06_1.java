//建立一個共有的方法，以供其他方法繼承用
class Unit{	
	int cost;
	Unit(){
		cost = 0;
	}
	public int getcost(){
		return cost;
	}
}

//建立LCD的方法，內有初始化cost
class LCD extends Unit{
	 LCD(int i){
		if(i==10)
			cost=2000; // cost為繼承Unit而來的
		else if(i==15)
			cost=2500;
		else
			cost=3000;
	}
}

//建立CPU的方法，內有初始化cost
class CPU extends Unit{
	CPU(double d ){
		if(d==1.66)
	 		cost=6000;
	 	if(d==2.2)
		 	cost=8000;
	 	if(d==2.4)
		 	cost=11000;
 	}
}

//建立HD的方法，內有初始化cost
class HD extends Unit{
	HD(String s) {
		if(s=="120G")
			cost = 2400;
		else
			cost = 2800;
	}
}

//建立一個Note抽象類別
abstract class Note{
	double cost;
	LCD l;
	CPU c;
	HD dd;
	Note(int i, double d, String s){
		l = new LCD(i);
		c = new CPU(d);
		dd = new HD(s);
	}
	abstract public double getCost();
	abstract public double getPrice();
}

//建立一個小筆電的方法
class MiniNote extends Note{
	//建構子，將值傳遞給父親
	MiniNote(){
		super(10,1.66,"120G");
		//計算cost值，其中使用的物件由父親繼承下來
		cost = l.getcost()+c.getcost()+dd.getcost();
	}
	
	public double getCost(){return cost*1.4;}
	public double getPrice(){return cost*2.0;}
}

//建立一個15吋筆電的方法
class Note15 extends Note{
	Note15(){
		super(15,2.2,"160G");
		cost = l.getcost()+c.getcost()+dd.getcost();
	}
	
	public double getCost(){return cost*1.4;}
	public double getPrice(){return cost*2.0;}
}

class JPA06_1 {
    public static void main(String args[]){
        //產生小筆電的物件
    	MiniNote mininote = new MiniNote();
        System.out.println("MiniNote cost:"+mininote.getCost()+", price:"+(int)mininote.getPrice());
        //產生15吋筆電的物件
        Note15 note15 = new Note15();
        System.out.println("Note15 cost:"+note15.getCost()+", price:"+(int)note15.getPrice());        
    }
}