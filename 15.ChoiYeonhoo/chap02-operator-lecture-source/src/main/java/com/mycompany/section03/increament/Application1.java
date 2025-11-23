package com.mycompany.section03.increament;

public class Application1 {
  public static void main(String[] args) {
  /* 증가 / 감소 연산자
  * ++, -- 단항 연산자
  * - 1씩 증가/감소
  * - 전위/후위 연산이 존재
  * - 전위 연산 : 모든 연산 중 제일 먼저 연산을 수행
  * - 후위 연산 : 모든 연산 중 제일 마지막에 연산을 수행
  *
  * */

    int num = 20;
    System.out.println("num = " + num); // 20

    num++; // 1 증가
    System.out.println("num = " + num); //21

    ++num; // 1 증가
    System.out.println("num = " + num); // 22
    
    num += 1; // num = num + 1 // 1 증가
    System.out.println("num = " + num); // 23

    num--; // 1감소
    System.out.println("num = " + num); // 22

    --num; // 1감소
    System.out.println("num = " + num); // 21

    /* 전위/후위 연산 */
    System.out.println("========= 전위 / 후위 연산 ============");

    int num2 = 10;
    int num3 = ++num2 + 5; //16 ++변수명 -> 전위 연산 == 먼저 변수 값 1 증가

    System.out.println("num2 = " + num2); // 11
    System.out.println("num3 = " + num3); // 16

    int num4 = 50;
    int num5 = num4-- + 10; // 500 변수명-- -> 후위 연산 == 계산 후 대입 한 후, 변수 1감소

    System.out.println("num4 = " + num4); // 49
    System.out.println("num5 = " + num5); // 60

    int a = 3;     // a = 3
    int b = ++a +5;  // a=4, b.9
    int c = b-- + a + 1; // a =4, b= 8, c = 14
    int result = a++ + b-- - --c; // a = 5, b =7, c= 13, result = -1

    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("result = " + result);

    int page = 1;
    System.out.println("현재 페이지는 " + page++ + "p 입니다");
    System.out.println("현재 페이지는 " + page++ + "p 입니다");
    System.out.println("현재 페이지는 " + page++ + "p 입니다");
    System.out.println("현재 페이지는 " + page++ + "p 입니다");
    System.out.println("현재 페이지는 " + page++ + "p 입니다");
    System.out.println("현재 페이지는 " + page++ + "p 입니다");



  }
}
