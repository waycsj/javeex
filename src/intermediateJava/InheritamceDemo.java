package intermediateJava;

public class InheritamceDemo {
  public static void main(String[] args) {
//    Tiger tiger = new tiger();
//    tiger.eat();
//    tiger.run();
//
//    Eagle eagle = new eagle();
//    eagle.eat();
//    eagle.fly();
//
//    Goldfigh goldfigh = new goldfigh();
//    goldfigh.eat();
//    goldfigh.swim();
  }
  class Tiger{
    String eye;
    String mouth;
    String legs;

    void eat(){
      System.out.println("먹다");
    }
    void sleep(){}
    void run(){
      System.out.println("달리다");
    }
  }

  class Eagle{
    String eye;
    String mouth;
    String wing;
    void eat(){
      System.out.println("먹다");
    }
    void sleep(){}
    void fly(){
      System.out.println("날다");
    }
  }

  class Goldfigh{
    String eye;
    String mouth;
    String fin;
    void eat(){
      System.out.println("먹다");
    }
    void sleep(){}
    void swim(){System.out.println("수영하다");}
  }
}
