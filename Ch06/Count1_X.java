import java.io.*;

public class Count1_X {

  public static void main(String args[]) throws IOException {

    // 宣告累加值 sum 及計算範圍 range
    int sum = 0, range;

    System.out.println("請輸入指定數值範圍：");
    System.out.print("→");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    range = Integer.parseInt(str);

    int i=1;           // 宣告迴圈變數 i
    while (i<=range) { // 若 i 小於 range, 則執行迴圈內的動作
      sum += i;
      System.out.println((sum-i) + "+" + i + "=" +sum);
      // 正確寫法應在此處加上 i++; 的敘述
    }
  }
}
