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
			cost=2000;
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

//建立公用的方法，以供繼承
abstract class PCandMultiPC {
  double  cost;
  CPU c;
  HD dd;
 	PCandMultiPC(){
		c = new CPU(2.4);
		dd = new HD("160G");
 	}
	abstract public double getCost();
	abstract public double getPrice();
}

class PC extends PCandMultiPC {
  public double getCost(){  
    	return (c.getcost()+dd.getcost()+500);    
  }
  public double getPrice(){   	
  	return (c.getcost()+dd.getcost())*1.8;    
  }   	
}

class MultiPC extends PCandMultiPC {
	double toa;
	MultiPC(int a,int b) {
		toa = a*c.getcost()+b*dd.getcost();
	}

	public double getCost() {  
	  	return (toa*1.2);    
	}
  public double getPrice() {   	
  	return (toa*1.8);    
  }  	
}

//建立一個AllPC的方法
class AllPC{
  //設計一個比較方法，回傳布林值
	public boolean isExpensive(PC a, Note15 b){
		if(a.getCost()>b.getCost())
			return true;
		else
			return false;
	}
}

class JPD06_3 {
    public static void main(String args[]) {
        PC pc = new PC();
        Note15 note15 = new Note15();
        AllPC test = new AllPC();
        if(test.isExpensive(pc, note15))
        	System.out.println("PC is more expensive then Note15 ");
        else
        	System.out.println("Note15 is more expensive then PC ");
        	
    }
}