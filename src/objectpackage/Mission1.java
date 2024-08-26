package objectpackage;

import java.util.Arrays;
import java.util.Scanner;

public class Mission1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long[] prices = new long[5];

    for (int i = 0; i < prices.length; i++) {
      System.out.println("가격을 입력하세요 :");
      prices[i] = in.nextLong();
    }

    long sum = 0L;
    for (int i = 0; i < prices.length; i++) {
     sum +=prices[i];
    }


    double avg = sum/(double)prices.length;
    System.out.println(Arrays.toString(prices));
    System.out.printf("%d 개의 가격의 합은 %d이고, 평균가격은 %.2f 입니다.",prices.length,sum,avg);


    //git 파일 꼭봐라
    sum = 0L;
    for (long price : prices) {
      sum += price;
    }

    avg = sum / (double)prices.length;
    System.out.println(Arrays.toString(prices));
    System.out.printf("%d 개의 가격의 합은 %d 이고, 평균가격은 %.2f 입니다.", prices.length, sum, avg);
  }
}
