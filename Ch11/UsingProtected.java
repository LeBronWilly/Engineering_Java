class Circle {          // 圓
  // 使用 protected 宣告成員變數
  protected double x,y; // 圓心
  protected double r;   // 半徑

  public void setCenter(double x,double y) {
    this.x = x;
    this.y = y;
  }

  public void setRadius(double r) {
    this.r = r;
  }

  public String toString() {     // 顯示資訊
    return "圓心：(" + x + "," + y + "), 半徑：" + r;
  }
}

class Cylinder extends Circle {
  private double h;              // 高度

  Cylinder(double x,double y,double r,double h) {
    this.x = x;    // 初始化繼承來的成員變數
    this.y = y;
    this.r = r;
    this.h = h;
  }
}

public class UsingProtected {
  public static void main(String[] argv) {
    Cylinder cr = new Cylinder(1,2,3,4);
    System.out.println(cr.toString());
  }
}
