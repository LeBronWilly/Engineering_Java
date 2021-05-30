public class Count9x9 {

  public static void main(String args[]) {

    // 宣告九九乘法表的 (x*y) 變數 x 及 y
    int x, y;

    // 從 x=1 開始執行的 for 迴圈
    for (x=1;x<=9;x++) {
      // 從 y=1 開始執行的 for 迴圈
      for (y=1;y<=9;y++)
        System.out.print( x + "*" + y + "=" + x*y + "\t");
      System.out.println();
    }
  }
}
