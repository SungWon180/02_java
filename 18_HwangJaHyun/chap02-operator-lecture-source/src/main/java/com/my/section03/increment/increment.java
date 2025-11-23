package com.my.section03.increment;

public class increment {
  public static void main(String[] args) {
    /* 증가 / 감소 연산자
    * ++, --
    * 1씩 증가/감소
    * 전위 / 후위 연산이 존재
    * 전위연산: 모든 연산 중 제일 먼저 연산을 수행
    * 후위연산: 모든 연산 중 제일 마지막에 연산을 수행
    * */
    int num = 20;
    System.out.println("num = " + num); // 20

    num++;  // 1 증가
    System.out.println("num = " + num); // 21

    num++; // 1 증가
    System.out.println("num = " + num); //  22

    num += 1; // 1증가 (복합대입연산자)
    System.out.println("num = " + num); // 23

    num--;  // 1 감소
    System.out.println("num = " + num); // 22

    num--; // 1 감소
    System.out.println("num = " + num); //  21

    num -= 1; // 1감소 (복합대입연산자)
    System.out.println("num = " + num); // 20


    System.out.println("===== 전위 / 후위 연산 =====");

    int num2 = 10;
    int num3 = ++num2 + 5; // ++변수명 -> 전위 연산, 먼저 변수 값 1 더하기
    System.out.println("num2 = " + num2);
    System.out.println("num3 = " + num3);

    int num4 = 50;
    int num5 = num4-- + 10; // 후위 연산, 제일 마지막에 연산 수행 (많이 씀....)
    System.out.println("num4 = " + num4);
    System.out.println("num5 = " + num5);

    int a = 3;  // 3++ 4                        // a=4, b=9
    int b = ++a + 5;  // 9-- 8-- 7              // a=4, b=8, c=14
    int c = b-- + a + 1;  // 13-- 12            // a=4, b=8, c=14, result = -1
    int result = a++ + b-- - --c; //4+8-13 = -1 //
    System.out.println("result = " + result);

    int page = 1;
    System.out.println("현재페이지는 " + page++ +"입니다.");
    System.out.println("현재페이지는 " + page++ +"입니다.");
  }
}
