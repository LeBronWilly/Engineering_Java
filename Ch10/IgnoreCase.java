public class IgnoreCase {
        
  public static void main(String[] argv) {
    String a = "This is a TEST String";
    String b = "This is a test string";

    System.out.println("分大小寫時, a 與 b 相同? " + a.equals(b));
    System.out.println("不分大小寫, a 與 b 相同? "
                       + a.equalsIgnoreCase(b));
  }
}
