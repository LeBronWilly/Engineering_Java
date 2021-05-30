import java.util.Scanner;
public class JPA05 {
    public static Scanner keyboard = new Scanner(System.in);
    
	public static void main(String[] argv) {
        int i;
		int[] a= new int[10];
//        int[] a;
//        a = new int[10] ;
        a[0]=0;
        a[1]=1;
        System.out.println(a[0]);
        System.out.println(a[1]);
        for(i=2; i<=a.length-1; i++) {
        	a[i]=a[i-2]+a[i-1];
        	System.out.println(a[i]);
        }
        
        
        
        



    }
}