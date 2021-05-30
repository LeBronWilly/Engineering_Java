class JPA01 {
  public static void main (String[] args) {
    int i = add(10, -3);
    double d = add(-7.8, 4.3);
    String s = add("I love ", "Java!!");
    System.out.printf("%d %f %s %n", i, d, s);
  }
  public static int add(int x,int y) {
	  System.out.printf("Add 2 int:%d,%d\n", x, y);
	  return x+y;
  }
  public static double add(double x,double y) {
	  System.out.printf("Add 2 dou:%.1f,%.1f\n", x, y);
	  return x+y;
  }
  public static String add(String x,String y) {
	  System.out.printf("Add 2 str:%s,%s\n", x, y);
	  return x+y;
  }
}