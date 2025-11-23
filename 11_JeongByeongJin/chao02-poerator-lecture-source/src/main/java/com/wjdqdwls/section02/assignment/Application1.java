package com.wjdqdwls.section02.assignment;

public class Application1 {
  public static void main(String[] args) {

    /* 대입 연산자 ( A = B )
    *  - B를 A에 대입하는 연산자
    *
    * 산술 복합 대입 연산자 (A += | -= | *= | /= | %= B)
    *  - A의 이전 값에
    *    B 값을 산술 연산한 후
    *    결과를 다시 A에 대입
    * */

    int num = 12;
    System.out.println("num = " + num);

    num += 3; // num = num + 3;
    System.out.println("num = " + num); // 15

    num -= 5; // num = num - 5;
    System.out.println("num = " + num); // 10

    num *= 2; // num = num * 2;
    System.out.println("num = " + num); // 20

    num /= 6; // num = num / 6;
    System.out.println("num = " + num); // 3

    num %= 2;
    System.out.println("num = " + num); // 1
  }
}
