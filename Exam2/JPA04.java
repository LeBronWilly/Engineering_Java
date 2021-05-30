import java.util.Scanner;
public class JPA04 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        String s;
        System.out.print("Input a string: ");
        s = keyboard.nextLine();
        System.out.printf("%s has %d As \n",s,findA(s));
        System.out.print("Input a string: ");
        s = keyboard.nextLine();
        System.out.printf("%s has %d As \n",s,findA(s));
    }
    public static int findA(String s) {
    	if(s.equals("")) {
    		return 0;
    	}
    	if(s.substring(0,1).equals("A")) {
    		return findA(s.substring(1))+1;
    	}
    	else {
    		return findA(s.substring(1));
		}
    	
    }
    
    
}