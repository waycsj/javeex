package intermediateJava;

public class UpcastingDowncastingDemo {
  public static void main(String[] args) {
//    Person p = new Person();
//    Student s = (Student) p; 강제타입변환을 하면 오류발생
 Student s = new Student();
 Person p = s;
 String name = p.name;
 p.whoami();
// p.number();
// p.work();

    Student s2 = (Student) p;
    s2.number = s2.number;
    s2.work();
  }
}
