import java.util.Scanner;

public class JPA104{
public static void main (String[] args)
{
Scanner sc = new Scanner(System.in);
double x1,x2,y1,y2;
System.out.print("請輸入第1組的x和y座標:");
x1 = sc.nextDouble();
y1 = sc.nextDouble();

System.out.print("請輸入第2組的x和y座標:");
x2 = sc.nextDouble();
y2 = sc.nextDouble();
//printf的用法是是顯示出一串字串，而字串中會有一些變數可帶入，例如%d 就是帶入整數，%f就是帶入浮點數，而%4.2f是指全部的位數有四位(包含小數點)，而小數點後面佔兩位
//不過如果輸出的為數大於使用者輸出的，則會忽略使用者所輸入的位數限制
//Math.sqrt(X) = X開根號
//Math.pow(2.0,3.0) = 二的三次方，其中兩個變數皆是double形式
System.out.printf("介於(%4.2f,%4.2f)和(%4.2f,%4.2f)之間的距離是%4.2f", x1,y1,x2,y2,(Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2))));
}
}
