package objectpackage;

import java.awt.geom.Area;
import java.sql.SQLOutput;

class Circle {
  static final double PI = Math.PI;
  private int radius = 1;  //필드- 캡슐화 전


  public Circle(int radius) {
    if (radius <= 0) {
      System.out.println("원의 반지름은 0보다 커야 합니다.");
    } else {
      this.radius = radius;
    }
  }

  public void printRadius() {
    System.out.println("원의 반지름 : " + radius);
  }

  /**
   * 원의 넓이를 구하여 반환하는 메서드
   * 매개변수 X 리턴값 O (double)
   */
  public double getArea() {
    double area = PI * radius * radius;
    return area;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    if (radius <= 0) {
      System.out.println("원의 반지름은 0보다 커야 합니다.");
    } else {
      this.radius = radius;
    }
  }
}

