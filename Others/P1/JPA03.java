import java.util.Scanner;
public class JPA03 {
    

	static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int total = 0;
        int s = 0;
        int count = 0;
        double average;
        do {
        	System.out.print("Please enter meal dollars or enter -1 to stop: ");
        	s = keyboard.nextInt();
        	if(s!=-1) {
        		count++;
        		total+=s;
        	}
		} while (s!=-1);
        average=(double)total/count;
        System.out.println("餐點總費用:"+(double)total);
        System.out.printf(" %d 道餐點平均費用為: %.2f",count,average);
        
	

        
        
    }
}