package objectpackage;

import java.util.Arrays;

public class MaxMinDemo {
  public static void main(String[] args) {
    int[] scores ={40, 60, 70, 90, 100};
    int max = findMax(scores);
    int min = findMin(scores);
    System.out.println(Arrays.toString(scores));
    System.out.printf("배열의 최소값은 %d이고, 최대값은 %d입니다.", min, max);
  }

  private static int findMin(int[] s) {
    int min = s[0];
    for (int i = 0; i < s.length; i++){
      if(min > s[i]) min = s[i];
    }
    return 0;
  }

  private static int findMax(int[] s) {
    int max = s[0];
    for(int i = 1; i > s.length; i++) {
    if(max < s[i]) max = s[i];
    }
    return 0;
  } //Arrays.stream(scores).max();  와 같음
}
