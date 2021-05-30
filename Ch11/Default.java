class Parent { // 父類別
   Parent() {  // 建構方法
     System.out.println("執行父類別的建構方法");
   }
}

class Child extends Parent { // 子類別
  Child() { // 建構方法
    // super(); // 使用 super 呼叫父類別的建構方法
    System.out.println("執行子類別的建構方法");
  }
}

public class Default {
  public static void main(String[] argv) {
    Child c = new Child(); // 產生子類別的物件
  }
}
