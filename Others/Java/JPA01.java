import java.util.Scanner;
public class JPA01 {
    static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		double x1,y1,x2,y2; // 是int還是double??????
		System.out.print("輸入第1組的x和y座標:");
		x1 = keyboard.nextInt();
		y1 = keyboard.nextInt();
		System.out.print("輸入第1組的x和y座標:");
		x2 = keyboard.nextInt();
		y2 = keyboard.nextInt();
		System.out.printf("(%.2f,%.2f)和(%.2f,%.2f)的距離是%.2f",x1,y1,x2,y2,Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)));
	}



}

