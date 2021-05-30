class Point {   // 點
  private double x,y;

  public void setx(double x) {
    this.x = x;
  }

  public void sety(double y) {
    this.y = y;
  }

  public String toString() {
    return "(" + x + "," + y + ")";
  }

  public Point(double x,double y) {
    this.x = x;
    this.y = y;
  }

  public Point() {
    x = y = 0;
  }

  public Point(Point p) { // 用複製另一物件的建構方法
    x = p.x;
    y = p.y;
  }
}

class Circle {       // 圓
  private Point p;   // 圓心
  private double r;  // 半徑

  public Point getp() {
    return new Point(p);
  }

  Circle(double x,double y,double r) {
    p = new Point(x,y);
    this.r = r;
  }

  Circle() {
    this(0,0,1);
  }

  public String toString() {
    return "圓心：" + p.toString() + " 半徑：" + r;
  }
}

public class HidePrivateMember {
  public static void main(String[] argv) {
    Circle c = new Circle(3,4,5);

    Point p = c.getp(); // 取得代表圓心的點物件
    p.setx(6);          // 變更圓心的 x 座標
    System.out.println(c.toString());
  }
}
