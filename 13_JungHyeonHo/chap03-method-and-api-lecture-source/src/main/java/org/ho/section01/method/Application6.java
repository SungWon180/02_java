package org.ho.section01.method;
// 컴파일 시 컴파일러가 자동으로 추가
import java.lang.*; // java.lang 패키지 내 모든 클래스 가져오기

public class Application6 {
  public static void main(String[] args) {
    Application6 application6 = new Application6();
    int num1=100;
    int num2=7;

    System.out.println("num1+num2="+application6.plusTwoNumber(num1, num2));
    System.out.println("num1-num2="+application6.minusTwoNumber(num1, num2));
    System.out.println("num1*num2="+application6.multiplyTwoNumber(num1, num2));
    System.out.println("num1/num2="+application6.divideTwoNumber(num1, num2));
    System.out.println("num1%num2="+application6.modTwoNumber(num1, num2));

  }
   public int plusTwoNumber(int num1, int num2) {
    return num1 + num2;
   }
   public int minusTwoNumber(int num1, int num2) {
    return num1 - num2;
   }
   public int multiplyTwoNumber(int num1, int num2) {
    return num1 * num2;
   }
   public int divideTwoNumber(int num1, int num2) {
    return num1 / num2;
   }
   public int modTwoNumber(int num1, int num2) {
    return num1 % num2;
   }
}
