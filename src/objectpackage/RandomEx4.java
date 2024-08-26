package objectpackage;

public class RandomEx4 {
  public static void main(String[] args) {
    double random;
    for (int i = 0; i < 10; i++) {
      random = Math.random();
      System.out.printf("%f, %f, %f\n", random, random*2, random*3);
    }
  }
}
