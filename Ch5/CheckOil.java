import java.util.*; // 為輸入資料加上的程式

public class CheckOil {

  public static void main(String[] argv) {

    System.out.print("請輸入目前所剩油量 (單位：公升)：");

    Scanner sc = new Scanner(System.in); // 為輸入資料加上的程式
    int liter = sc.nextInt();  // 將輸入資料轉成整數

    if (liter < 2)   // 當 liter 小於 2, 條件成立
      System.out.println("油量已經不足, 該加油了！");

    System.out.println("祝您行車愉快。");
  }
}