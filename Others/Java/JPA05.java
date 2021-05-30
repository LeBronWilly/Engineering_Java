import java.util.Scanner;
public class JPA05 {
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String args[]) {
        int c;
        double s=0.0; // 可以替代float????????
    	System.out.print("請輸入學生人數：");
        c = keyboard.nextInt();
        double[] a = new double[c];
//        double[] a;
//        a = new double[c];
    	for(int i=1; i<=c; i++) {
            System.out.printf("第%d個學生成績:",i);
            a[i-1] = keyboard.nextDouble();
            s+=a[i-1];
    	}
        System.out.printf("人數：%d\n",c);
        System.out.printf("Total：%.2f\n",s);
        System.out.printf("Avg：%f\n",s/c);




        }
       
        

    }