import java.util.Scanner;
public class JPD104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x1,y1,x2,y2;
		System.out.print("Please key in (x1,y1): ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		
		System.out.print("Please key in (x2,y2): ");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		System.out.printf("介於(%4.2f,%4.2f)和(%4.2f,%4.2f)之間的距離是%4.2f", x1,y1,x2,y2,(Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2))));
	}

}
