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
}

class Circle {       // 圓
  private Point p;   // 圓心
  private double r;  // 半徑

  public Point getp() {
    return p;        // 直接傳回成員物件
  }

  Circle(double x,double y,double r) {
    p = new Point(x,y);
    this.r = r;
  }

  Circle() {
    this(0,0,1);
  }

  public String toString() {  // 將物件資訊轉成字串的方法
    return "圓心：" + p.toString() + " 半徑：" + r;
  }
}

public class SettingPrivateMember {
  public static void main(String[] argv) {
    Circle c = new Circle(3,4,5);  // 圓心 (3,4), 半徑 5

    Point p = c.getp();            // 取得圓心
    p.setx(6);                     // 變更圓心座標
    System.out.println(c.toString());
  }
}