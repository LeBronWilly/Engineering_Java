import java.util.Scanner;
public class JPA05 {
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] argv) {
        search();
        search();
    }
    
    public static void search() {
        int[] data = {5, 9, 13, 15, 17, 19, 25, 30, 45}; // �w�ƧǸ��

        System.out.print("請輸入要找尋的資料：");

        int target = keyboard.nextInt();
        binary_search(data,target);
    }
    static void binary_search(int[] d, int t) {
    	int left,middle,right,c=0;
    	left=0;
    	right=d.length-1;
    	middle = (left+right)/2;
    	
    	do {
    		c++;
    		System.out.printf("尋找區間: %d(%d)..%d(%d),中間： %d(%d)\n",left,d[left],right,d[right],middle,d[middle]);
    		if(d[middle]==t) {
    			System.out.printf("經過 %d 次的尋找\n您要的資料在陣列中的第%d個位置\n", c,middle);
    			break;
    		}
    		else if(left==right) {
    			System.out.printf("經過 %d 次的尋找\n%d不在陣列中\n", c,t);
    			break;
    		}
    		else if(d[middle]>t) {
    			right = middle-1;
    			middle = (left+right)/2;
//    			continue;
    		}
    		else if(d[middle]<t) {
    			left = middle+1;
    			middle = (left+right)/2;
//    			continue;
    		}
    		
    		
    	}while(true);
    	
    	
    	
    	
    }
}