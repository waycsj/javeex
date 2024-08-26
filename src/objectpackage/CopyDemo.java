package objectpackage;

public class CopyDemo {
  public static void main(String[] args) {
    int ten = 10;
    System.out.println("ten의 값을 수정하는 메소드 호출 전 " + ten);
    copybyValue(ten);
    System.out.println("ten의 값을 수정하는 메소드 호출 후 " + ten);

    Circle c1 = new Circle(1);
    System.out.println("Circle1의 반지름을 수정하는 메소드 호출 전" + c1.getRadius());
    copyByReference(c1);
    System.out.println("Circle1의 반지름을 수정하는 메소드 호출 후" + c1.getRadius());
  }

  public static void copybyValue(int val) {
    int copyTen = val;

    System.out.println("ten : " + val);
    System.out.println("copyten : " + copyTen);


    val = 20;
    System.out.println("매소드 안에서 ten : " + val);
    System.out.println("copyten : " + copyTen);
  }

  public static void copyByReference(Circle c1) {
    Circle c2 = new Circle(1);

    System.out.println("인스턴스 생성 후 ");
    System.out.println("c1의 반지름 : " + c1.getRadius());
    System.out.println("c2의 반지름 : " + c2.getRadius());


    c2 = c1;
    System.out.println("주소 복사 후 ");
    System.out.println("c1의 반지름 : " + c1.getRadius());
    System.out.println("c2의 반지름 : " + c2.getRadius());


    c1.setRadius(10);
    System.out.println("c1의 반지름을 메소드 안에서 변경 후");
    System.out.println("c1의 반지름 : " + c1.getRadius());
    System.out.println("c2의 반지름 : " + c2.getRadius());
  }
}






