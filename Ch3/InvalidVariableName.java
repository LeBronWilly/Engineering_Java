public class InvalidVariableName {
  public static void main(String[] argv) {
    int 3age;   // ????H??r?}?Y
    int #AGE;   // ?????? "#"  ?r?? 
    int A#GE;   // ?????? "#"  ?r??
    int while;  // ??????????r
    int true;   // ?????????O?d???r???`??
    3age = 19;
    System.out.println("number is:" + 3age);
  }
}
