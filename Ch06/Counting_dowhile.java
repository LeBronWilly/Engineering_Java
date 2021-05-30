public class Counting_dowhile {

  public static void main(String args[]) {

    int i=0;          // 宣告用來記錄迴圈執行次數的變數 i
    do {
      System.out.println("這是第" + i + "次執行迴圈");
    } while (i++<3);
  }
}