package objectpackage;

public class BallDemo {
  public static void main(String[] args) {
    Ball b1 = new Ball();
    System.out.println("공의 반지름은 : " + b1.getRadius());
    System.out.printf("공의 부피는 %.5f : " + b1.getVolume());
  }
}

class Ball{
    private int radius = 1;
    public int getRadius() {return radius;}

    public void setRadius(int radius) {
      this.radius = radius;
      if (radius <= 0) {
        System.out.println("원의 반지름은 0보다 커야 합니다.");
      } else {
        this.radius = radius;
      }
    }

    public double getVolume() {
      //final double PI = 3.14;
      double volume = 4 / (double) 3 * Math.PI * radius * radius * radius;
      return volume;
    }
    }
