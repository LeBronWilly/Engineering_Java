import java.util.Scanner;
public class JPA03_2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int a=0,c=0,s=0;
        double avg=0.0;
    	while(true) {
        	System.out.print("Please enter meal dollars or enter -1 to stop:"); // println則會跑到下一列
        	a = sc.nextInt();
        	// 是在下一行輸入是否正確???????不正確！使用println則會跑到下一列！因此要使用print！
        	if (a!=-1) {
        		s+=a;
        		c++;
        	}
        	else {
        		avg = (double)s/c;
        		break;
        	}
        }
    	System.out.printf("Total:%.1f\n", (double)s);
    	System.out.printf(c+" meals avg price: %.2f", avg);

        
    }
}