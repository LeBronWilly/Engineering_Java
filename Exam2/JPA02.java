import java.util.*;
class JPA02 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
		test();
        test();
        test();
        test();
        test();
    }
    
    public static void test() {
    	String x;
    	System.out.println("Input a character:");
    	x = keyboard.next();
    	switch (x) {
    		case "a":
    			System.out.println("You entered a or b");
    			break;
    		case "b":
    			System.out.println("You entered a or b");
    			break;
    		case "x":
    			System.out.println("You entered x");
    			break;
    		case "y":
    			System.out.println("You entered y");
    			break;
    		default:
    			System.out.println("You entered something else.");
    			break;
    	}

    }
}
