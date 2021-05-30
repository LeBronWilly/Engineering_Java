class Test {
  public String toString() {
    return "這是一個測試物件";
  }
}

public class Conversion {       
        
  public static void main(String[] argv) {
    Test t = new Test();
    String a = "這是一個測試字串";
    String b = a + t;

    System.out.println("a：" + a);
    System.out.println("b：" + b);
  }
}
