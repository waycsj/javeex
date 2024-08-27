package intermediateJava;

public class TypeCastingDemo {
  public static void main(String[] args) {
    Vehicle v = new Car();//=자동변환이 되어 있는 상태 = upcasting 이 되어있는 상태
    System.out.println(v.name);
    v.whoami();
    v.move();

    Car c = new Car();
    System.out.println(c.name);
    c.whoami();
    c.move();

    Sportscar s = new Sportscar();
    System.out.println(s.name);
    s.whoami();
    s.move();
    Sportscar.move();
  }
}

class  Vehicle{
  String name = "탈 것 ";
  void whoami(){
    System.out.println("나는 탈 것이다.");
  }
  static void move(){
    System.out.println("이동한다.");
  }
}
class Car extends Vehicle {
  String name = "자동차";

  @Override
  void whoami() {
    System.out.println("나는 자동차이다.");
  }
  static void move() {
    System.out.println("달린다.");
  }
}
class Sportscar extends Vehicle{
  String name =  "스포츠카";
  void equals(){
    System.out.println("나의 이름 : " + this.name);
    System.out.println("부모의 이름 : " + super.name);
  }

  @Override
  void whoami() {
    System.out.println("나는 스포츠카이다.");
  }
  }