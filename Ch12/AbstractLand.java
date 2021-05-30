abstract class Land {     // 父類別
  abstract double area(); // 計算面積
}

class Circle extends Land { // 圓形的土地
  int r; // 半徑（單位：公尺）

  Circle(int  r) { // 建構方法
    this.r = r;
  }

  double area() {  // 多重定義的版本
    return 2 * 3.14 * r * r;
  }
}

class Square extends Land { // 正方形的土地
  int side; // 邊長（單位：公尺）

  Square(int side) { // 建構方法
    this.side = side;
  }

  double area() {     // 多重定義的版本
    return side * side;
  }
}

class Calculator {
  double price; // 每平方公尺的價格（元）

  Calculator(double price) { // 建構方法
    this.price = price;
  }

  double calculatePrice(Land l) {
    return calculatePrice(price,l);
  }

  double calculatePrice(double price,Land l) {
    return l.area() * price; // 透過多形呼叫正確的 area() 方法
  }

  double calculateAllPrices(Land... Lands) {
          // 使用多重定義的版本
          return calculateAllPrices(price,Lands);
  }

  double calculateAllPrices(Object... Lands) {
    // 使用多重定義的版本
    int times; // 重複次數
    Land l;
    double total = 0; // 計算加總
    int i = 0;
    while(i < Lands.length) {
      times = 1;
      if(Lands[i] instanceof Land) {
        l = (Land) Lands[i++]; // 取得形狀
        if(i < Lands.length    // 有下一個元素
          && Lands[i] instanceof Integer) // 是整數
          times = (Integer) Lands[i++];   // 取得重複次數
        total += times * calculatePrice(l);
      }
    }
    return total;
  }

  double calculateAllPrices(double price,
    Land... Lands) { // 多重定義的版本
    double total = 0; // 計算加總

    for(Land l : Lands) { // 一一取出各個物件
      total += calculatePrice(price,l); // 個別計算並累加
    }

    return total;
  }
}

public class AbstractLand {
  public static void main(String[] argv) {
    Circle c = new Circle(5); // 一塊圓形的地
    Square s = new Square(5); // 一塊正方形的地

    Calculator ca = new Calculator(3000.0); // 每平方公尺3000元

    System.out.println("總價值：" + // 使用匿名陣列
      ca.calculateAllPrices(s,2,c));
  }
}
