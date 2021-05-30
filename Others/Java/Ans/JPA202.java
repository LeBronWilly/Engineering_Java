import java.util.*;
public class JPA202 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
    }
    
    public static void test() {
    	System.out.println("Input:");
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        if(num1 > num2)
        	System.out.println(num1 + " is larger than " + num2);
        else if(num1 < num2)
        	System.out.println(num2 + " is larger than " + num1);
        else
        	System.out.println(num1 + " is equal to " + num2);
    }
}

