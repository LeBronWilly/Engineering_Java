import java.util.Scanner;
public class JPA04_2 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        String s, c , k; 
        System.out.print("Input a string: ");
        s = keyboard.nextLine();
        System.out.printf("Input a char: ");
        c = keyboard.nextLine();
        System.out.print("Input another char: ");
        k = keyboard.nextLine();
        System.out.printf("%s\n", replace(s,c,k));
    }
    static String replace(String ss,String cc,String kk) {
    	if(ss.length()!=0) {
    		if (ss.substring(0,1).equals(cc)) {
    			return kk + replace(ss.substring(1),cc,kk);
    		}
    		else {
    			return ss.substring(0,1) + replace(ss.substring(1),cc,kk);
    		}
    	}
    	else {
    		return "";
    	}
    		


    }
    	
    	

    
}