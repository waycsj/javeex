package intermediateJava;

public class InheritamceDemo2 {
  public static void main(String[] args) {

    Animal animal = new Animal();
    animal.eat();
    animal.sleep();

    Tiger tiger = new Tiger();
    tiger.eat();
    tiger.run();

    Eagle eagle = new Eagle();
    eagle.eat();
    eagle.fly();

    Goldfigh goldfigh = new Goldfigh();
    goldfigh.eat();
    goldfigh.swim();
  }
}

  class Animal{
    String eye;
    String mouth;
    void eat(){}
    void sleep(){}
    void run(){}
  }


  class Tiger extends Animal{
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

  class Eagle extends Animal{
    String eye;
    String mouth;
    String wing;
    void eat(){
      System.out.println("먹다");
    }
    void sleep(){}
    void fly(){System.out.println("날다");}
  }

  class Goldfigh extends Animal{
    String eye;
    String mouth;
    String fin;
    void eat(){System.out.println("먹다");}
    void sleep(){}
    void swim(){System.out.println("수영하다");}
  }

