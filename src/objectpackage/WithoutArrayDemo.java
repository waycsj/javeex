package objectpackage;

import java.sql.Array;

public class WithoutArrayDemo {
  public static void main(String[] args) {
//    int score1 = 90;
//    String grade1 = "";
//    if (score1 >= 90) grade1 = "A";
//    else if(score1 >= 80) grade1 = "B";
//    else grade1 = "C";
//
//    int score2 = 75;
//    String grade2 = "";
//    if(score2 >= 90) grade2 ="A";
//    else if(score2 >= 80) grade2 = "B";
//    else grade2 = "C";
//
//    int score3 = 85;
//    String grade3 = "";
//    if(score3 >= 90) grade3 ="A";
//    else if(score3 >= 80) grade3 = "B";
//    else grade3 = "C";
//
//    int score4 = 75;
//    String grade4 = "";
//    if (score4 >= 90) grade4 = "A";
//    else if(score4 >= 80) grade4 = "B";
//    else grade4 = "C";
//
//    System.out.println(grade1);
//    System.out.println(grade2);
//    System.out.println(grade3);
//    System.out.println(grade4);
    String s1 = "";

    int[] scores = {90, 75, 85, 75, 80,90, 100, 60, 99, 88};
    System.out.println(scores.length);

    for(int i =0 ; i < 4; i++){
      System.out.println(scores[i]);
    }

    int sum =0;
    for (int i = 0; i < scores.length ; i++){
      System.out.println(scores[i]);
      sum += scores[i];
    }System.out.println(sum);

    double avg = sum/(double)scores.length;
    System.out.printf("평균은 %.2f 입니다.", avg);


    System.out.println(scores[0]);
    System.out.println(scores[1]);
    System.out.println(scores[2]);
    System.out.println(scores[3]);
  }
}
