package objectpackage;

public class EnumDemo {
  public static void main(String[] args) {
    System.out.println(Poeple.Gender.FEMALE);
    System.out.println(Poeple.Num.TWO);
    int a = 2;
    if(Poeple.Num.TWO == Poeple.Num.ONE){
      System.out.println("서로 다른 숫자입니다.");
    }
  }
}
 class Poeple{//상수값을 묶어놓은 클래스
//   static final int MALE =1;
//   static final int FEMALE =2;
//   static  final int ONE =1;
//   static  final int TWO =2;
   enum Gender{MALE, FEMALE}
   enum Num{ONE, TWO}
 }