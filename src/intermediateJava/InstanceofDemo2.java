package intermediateJava;



public class InstanceofDemo2 {
  public static void main(String[] args) {
    Circle2 c1 = new Circle2(5);
    Circle2 c2 = new Circle2(5);
    Circle2 c3 = new Circle2(3);
    Person p = new Person();


    System.out.println(c1.equals(c2));
    System.out.println(c2.equals(c3));
    System.out.println(c1.equals(p));
  }
}

class Circle2 {
  int radius;

  public Circle2(int radius) {
    this.radius = radius;
  }
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Circle) {
      Circle2 c = (Circle2) obj;
      return this.radius == c.radius;
    }
    return false;
  }
}


