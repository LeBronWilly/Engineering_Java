public class PartOf9x9 {
  public static void main(String args[]) {
    // 宣告九九乘法表的 (x*y) 變數 x 及 y
    int x, y, p = 0;

    // 從 x=1 開始執行的 for 迴圈
    outloop:for (x=1;x<=9;x++) {  // 加上標籤名稱
      // 從 y=1 開始執行的 for 迴圈
      for (y=1;y<=9;y++) {
        p = x*y;                  // 計算 x*y 的乘積
        if (p > 25) {             // 若乘積大於 25
          System.out.print("\n"); // 換行
          continue outloop;       // 中止這一輪的 outloop 迴圈
        }
        System.out.print( x + "*" + y + "=" + p + "\t");
      }
      System.out.println();
    }
  }
}
