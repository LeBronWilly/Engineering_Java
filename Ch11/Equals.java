class Child extends Object { // 沒有定義 equals() 方法的物件
}

public class Equals {
        
  public static void main(String[] argv) {
    Child c1 = new Child(); // 產生Child物件
    Child c2 = new Child(); // 產生Child物件
    Child c3 =  c1;

    // 呼叫 Object.equals()
    System.out.println("c1 equals c2：" + c1.equals(c2));
    System.out.println("c1 equals c3：" + c1.equals(c3));
    System.out.println("c3 equals c2：" + c3.equals(c2));
  }
}
