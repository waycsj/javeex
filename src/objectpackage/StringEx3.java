package objectpackage;

import java.util.Scanner;

public class StringEx3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = "";

    while (true) {
//      String s ="www.Java.com";
      System.out.println("URL을 입력하세요 : ");
      s =in.nextLine();
      String sLow = s.toLowerCase();
      if(sLow.equals("Bye"))break;
      if(sLow.contains("java")){
        System.out.println(sLow.contains("java 를 포함합니다."));
      }
      if(sLow.endsWith("com")){
        System.out.println(sLow.endsWith("com으로 끝납니다."));
      }
    }
  }
}

