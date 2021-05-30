import java.util.Scanner;
public class JPA04 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        String s; 
        System.out.print("Input a string: ");
        s = keyboard.nextLine();
        System.out.printf("%s\n", reverse(s));
        System.out.print("Input a string: ");
        s = keyboard.nextLine();
        System.out.printf("%s\n", reverse(s));
    }
    static String reverse(String ss) {
    	if (ss.length()==1) { // 可替代原本的ss.equals("")????????可以！！！！
    		return ss;
    	}
    	else {
        	return reverse(ss.substring(1,ss.length())) + ss.substring(0,1); // 使用s.substring(1)即可

    	}
    }
    
}