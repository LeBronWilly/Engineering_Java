import java.util.Scanner;

public class JPA01 {
	public static void main(String[] args) {
//        double a;
        System.out.printf("f(-3.2) = %.4f\n", f(-3.2));
        System.out.printf("f(-2.1) = %.4f\n", f(-2.1));
        System.out.printf("f(0.0) = %.4f\n", f(0.0));
        System.out.printf("f(2.1) = %.4f\n", f(2.1));
    }
	
	static double f(double b) {
        	return 3*Math.pow(b, 3)+2*b-1;
	}
    




}
