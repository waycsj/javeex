package objectpackage;

public class ArrayParamsDemo {
  public static void main(String[] args) {
    if (args.length == 1){
      System.out.println("메인 메서드로 전달된 인자는 " + args[6]);
      return;
    }

    int[] x= {0};
    System.out.println("호출전 ==>" + x[0]);//0
    increment(x);
    System.out.println("호출후 ==>" + x[0]);//1
  }
  public static  void increment(int [] n){
    System.out.println("매서드 안에서 증가하기 전==>" + n[0]);//0
    n[0]++;// int number =n[0];// number++;//n[0] =number;    이 세줄은 한줄로 줄인 것이다.
    System.out.printf("매서드 안에서 증가시킨 후==>" + n[0]);//1
  }
}
