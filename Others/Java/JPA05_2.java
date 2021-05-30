import java.util.Scanner;
public class JPA05_2 {
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] argv) {
        search();
        search();
    }
    
    public static void search() {
        int[] data = {5, 9, 13, 15, 17, 19, 25, 30, 45};
        System.out.print("請輸入要找尋的資料：");
        int target = keyboard.nextInt();
        binary_search(data,target);
        
    
        
    }
    static void binary_search(int[] d,int t) { // 相當不同的寫法????????????????
    	int middle,left,right,c=0;
    	left = 0;
    	right = d.length-1;
    	middle=(right+left)/2;
    	while(true) {
    		System.out.printf("尋找區間：%d(%d)..%d(%d),中間：%d(%d)\n",left,d[left],right,d[right],middle,d[middle]);
    		c++;
    		if (t==d[middle]) {
    			System.out.printf("經過 %d 次的尋找\n",c);
    			System.out.printf("您要的資料在array中第%d個\n",middle);
    			break;
    		}else if (right == left) {
    			System.out.printf("經過 %d次的尋找\n",c);
    			System.out.printf("%d不在陣列中\n",t);
    			break;
    		}
    		else if(t>d[middle]) {
    			left=middle+1;
    			middle=(right+left)/2;
    			
    		}
    		else if(t<d[middle]) {
    			right=middle-1;
    			middle=(right+left)/2;
    		}
    	}
    			
    }
}