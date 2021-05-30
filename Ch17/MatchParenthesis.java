import java.util.*;

public class MatchParenthesis {

  public static void main(String args[]) {
    System.out.println("請輸入一段算式或程式");
    System.out.print("->");
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    LinkedList<Character> match = new LinkedList<>();
    try {
      for (int i=0;i<str.length();i++) { // 用迴圈讀每個字元
        if (str.charAt(i)=='(')          // 若是左括號
          match.addFirst(new Character('(')); // 加入集合物件中
        else if (str.charAt(i)==')')     // 若是右括號
          match.removeFirst();           // 移除集合中第 1 個左括號
      }

      if(match.isEmpty())
        System.out.print("左右括號數量相符");
      else
        System.out.print("左右括號數量不符, 右括號太少");

    } catch (NoSuchElementException e) {
        System.out.print("左右括號數量不符, 左括號太少");
    }
  }
}
