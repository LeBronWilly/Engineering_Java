import java.util.Scanner;
public class JPA01_2 {
    static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.printf("f(-3.2) = %.4f\n", f(-3.2));
		System.out.printf("f(-2.1) = %.4f\n", f(-2.1));
		System.out.printf("f(0.0) = %.4f\n", f(0.0));
		System.out.printf("f(2.1) = %.4f\n", f(2.1));

	}
	static double f(double x) {
		return 3*Math.pow(x, 3)+2*x-1;
	}



}

