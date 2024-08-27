package intermediateJava;

import java.awt.*;

public class FigureInheritDemo {
  public static void main(String[] args) {
    Triangle triangle = new Triangle(3, 3,3);
    double area = triangle.getArea();
    System.out.println(area);


    Rectangle rectangle = new Rectangle(4, 3, 4);
    area = rectangle.getArea();
    System.out.println(area);
  }
  }

  class Figure {
    int poly;

    public double getArea() {
      return 0.0;
    }
  }

    class Triangle extends Figure {
      private int height;
      private int width;

      public Triangle(int poly, int height, int width) {
        this.height = height;
        this.width = width;
      }

//        @Override
//    public double getArea() {
//      return super.getArea();
//    }
    @Override
    public double getArea() {
      return (width * height) / (double) 2;
    }
    }


    class Rectangle extends Figure {
      private int height;
      private int width;

      public Rectangle(int poly, int height, int width) {
        this.height = height;
        this.width = width;
      }

      @Override
      public double getArea() {
        return width * height;
      }

//      @Override
//      public boolean equals(Object obj) {
//        if (obj instanceof intermediateJava.Triangle) {
//          Triangle t = (Triangle) obj;
//          return getArea() == t.getArea();
        }