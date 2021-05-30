import java.util.Scanner;
public class JPA302 {
    public static void main(String[] args) {
        int i = 1, j = 1, count = 0;
        for (i = 1; i <= 3; i++)//第一個迴圈，i從1到3，執行三圈 
        {        
        	for (j = 1; j <= 9; j++)//第一個迴圈，j從1到9，執行九圈
        		count++;//每跑一次，便+1
            }
        System.out.printf("count = %d\n", count);    
    } 
}
