import java.util.Scanner;
public class JPA03 {
    static Scanner keyboard = new Scanner(System.in); // keyboard為Scanner建構的物件
    public static void main(String[] args) {
    	int a,i=2, s=0;
    	do {
			System.out.println("請輸入n的值(n > 0，且為偶數):");
    		a = keyboard.nextInt();
    	}while(a%2!=0 || a<=0);
    	
    	do {
    		s+=i;
    		i+=2;
		} while (i<=a);
//    	for(i=2;i<=a;i+=2) {
//    		s+=i;
//    		
//    	}
    	
    	if(a==2) {
    		System.out.printf("2=%d",s);
    	}
    	else if(a==4){
    		System.out.printf("2+4=%d",s);
    	}
    	else if(a==6){
    		System.out.printf("2+4+6=%d",s);
    	}
    	else {
    		System.out.printf("2+4+...+%d=%d",a,s);
    	}






    }
}