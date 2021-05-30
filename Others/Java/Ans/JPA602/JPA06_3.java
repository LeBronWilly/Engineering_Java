//�إߤ@�Ӧ@������k�A�H�Ѩ�L��k�~�ӥ�
class Unit{	
	int cost;
	Unit(){
		cost = 0;
	}
	public int getcost(){
		return cost;
	}
}

//�إ�LCD����k�A������l��cost
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

//�إ�CPU����k�A������l��cost
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

//�إ�HD����k�A������l��cost
class HD extends Unit{
	HD(String s) {
		if(s=="120G")
			cost = 2400;
		else
			cost = 2800;
	}
}

//�إߤ@��Note��H���O
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

//�إߤ@�Ӥp���q����k
class MiniNote extends Note{
	//�غc�l�A�N�ȶǻ�������
	MiniNote(){
		super(10,1.66,"120G");
		//�p��cost�ȡA�䤤�ϥΪ�����Ѥ����~�ӤU��
		cost = l.getcost()+c.getcost()+dd.getcost();
	}
	
	public double getCost(){return cost*1.4;}
	public double getPrice(){return cost*2.0;}
}

//�إߤ@��15�T���q����k
class Note15 extends Note{
	Note15(){
		super(15,2.2,"160G");
		cost = l.getcost()+c.getcost()+dd.getcost();
	}
	
	public double getCost(){return cost*1.4;}
	public double getPrice(){return cost*2.0;}
}

//�إߤ��Ϊ���k�A�H���~��
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

//�إߤ@��AllPC����k
class AllPC{
  //�]�p�@�Ӥ����k�A�^�ǥ��L��
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