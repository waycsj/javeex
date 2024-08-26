package objectpackage;

import java.util.Arrays;

public class VarArgsMemo {
  public static void main(String[] args) {
    printSum(1);
    printSum(1,10);
    printSum(1,10,20);
    printSum(1,10,20,30);
    printSum(1,10,20,30,40, 50, 60, 70);
  }
  private  static void printSum(int n,int... numbers){
for (int number : numbers){
  int sum = 0;
  sum += number;
  System.out.println();


}
    System.out.println(Arrays.toString(numbers));
    System.out.println();
  }
//  private  static void printSum(int i, int j){
//
//  }
//  private  static void printSum(int i,int j,int k ){
//
//  }
//  private  static void printSum(int i,int j,int k,int l){
//
//  }
}
