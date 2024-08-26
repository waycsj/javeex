package objectpackage;

import java.util.Arrays;
import java.util.Scanner;

public class RockCigersPaper {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] name = {"가위", "바위", "보"};
    System.out.println(name);
    System.out.printf(Arrays.toString(name));
    System.out.println((int) (Math.random() * 3));



//    double random ;
//    for (int i = 0; i < 10; i++) {
//      random = Math.random();
//      System.out.println(name[(int) (Math.random() * 3)]);
//    }이걸 써도 된다.
    for (int i = 0; i < 10; i++) {
      int index =(int)(Math.random()*3);
      System.out.println(name[index]);
    }
  }
}