package intermediateJava;

public class AbstractClassDemo {
  Circle c = new Circle();
}

abstract class Shape{
  abstract void method1();
  abstract void getArea();
}

class Circle extends Shape{
  @Override
  void getArea() {
  }

  @Override
  void method1() {
  }
}
