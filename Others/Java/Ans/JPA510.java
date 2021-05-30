import java.util.Scanner;
public class JPA510 {
    public static Scanner targetboard = new Scanner(System.in);
    static int time = 0;
    public static void main(String[] argv) {
    	time = 0;
    	search();
        search();
    }
    //搜尋方法，主要是在做排版的工作
    public static void search() {
        int[] data = {5, 9, 13, 15, 17, 19, 25, 30, 45}; // 已排序資料

        System.out.print("請輸入要找尋的資料：");

        int target = targetboard.nextInt();
        int ans = binary_search(data,target,data.length);
        if(ans==-1)
            System.out.println("經過 "+time+" 次的尋找\n"+target+"不在陣列中");
        else
        	System.out.println("經過 "+time+" 次的尋找\n您要的資料在陣列中的第"+ans+"個位置");
     }
    //二分法搜尋方法，真正在搜尋的地方
    //傳入值有三個，陣列，目標值，陣列長度
    static int binary_search(int[] data,int target, int max)    {
	    int middle, left, right;
	    left = 0; right = max-1; // 設定啟始搜尋範圍: 左邊界及右邊界(右邊界由最大值減1得到)
	    time=0;
	    while (left <= right) {
	    	time++;
	    	middle = (left + right) / 2;// 找出中間位置
	    	System.out.printf("尋找區間: %d(%d)..%d(%d),中間： %d(%d)\n", 
	    		left,data[left],
	    		right,data[right],
	    		middle,data[middle]);
	    	
	    	if (target == data[middle]) 
	    		return middle; // 找到資料, 傳回找到之位置
	    	
	    	// 調整搜尋範圍
	    	else if (target < data[middle]) // 往左半邊找 (調整右邊界)
	    		right = middle - 1;
	    	
	    	else // 往右半邊找 (調整左邊界)
	    		left = middle + 1;
	    }
	    return -1; // 沒找到資料, 傳回 -1
    }
}