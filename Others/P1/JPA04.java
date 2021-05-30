import java.util.Scanner;
public class JPA04 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        String s, c, d; 
        System.out.print("Input a string: ");
        s = keyboard.next();
        System.out.print("Input a character: ");
        c = keyboard.next();
        System.out.print("Input another character: ");
        d = keyboard.next();
        System.out.println(replace(s,c,d));
    }
    static String replace(String s, String c, String d) {
    	if(s.equals("")) {
    		return "";
    	}
    	else if(s.substring(0,1).equals(c)) {
    		return d+replace(s.substring(1), c, d);
    	}
    	else {
    		return s.substring(0,1)+replace(s.substring(1), c, d);
    	}
    }
    
}