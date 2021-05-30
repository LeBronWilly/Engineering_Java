import java.util.*;
public class JPA02 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
		test();
        test();
    }
    
    public static void test() {
    	int a,b;
    	System.out.println("Input:");
    	a = keyboard.nextInt();
    	b = keyboard.nextInt();
    	if (a>b)
    		System.out.println(a+">"+b);
    	else
    		System.out.println(b+">"+a);
    }
}
