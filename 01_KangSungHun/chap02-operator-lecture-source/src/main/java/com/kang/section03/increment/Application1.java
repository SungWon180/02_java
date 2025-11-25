package com.kang.section03.increment;

public class Application1 {

  public static void main(String[] args) {

    /* 증가/감소 연산자
    * ++, -- 단항 연산자
    * 1씩 증가 / 감소
    * - 전위 / 후위 연산이 존재
    * 전위 연산 : 모든 연산 중 제일 먼저 연산을 수행
    * 후위 연산 : 모든 연산 중 제일 맞미ㅏㄱ에 연산을 수행  */

    int num = 20;
    System.out.println("num = " + num); // 20

    num++; // 1증가
    System.out.println("num = " + num); // 21

    ++num; // 1증가
    System.out.println("num = " + num); // 22

    num += 1; // num = num + 1; // 1증가 (복합 대입 연산자)
    System.out.println("num = " + num); // 23

    num--; // 1 감소
    System.out.println("num = " + num);

    --num; // 1 감소
    System.out.println("num = " + num);

    /* 전위 / 후위 연산 */
    System.out.println(" ======= 전위 / 후위 연산 =======");

    int num2 = 10;
    int num3 = ++num2 + 5; // ++변수명 -> 전위 연산 == 먼저 변수 값 1 증가
    System.out.println("num3 = " + num2);

    int num4 = 50;
    int num5 = num4-- + 10; // ++변수명 -> 전위 연산 == 먼저 변수 값 1 증가
    System.out.println("num4 = " + num4);
    System.out.println("num5 = " + num5);

    int a = 3;
    System.out.println("a = " + a);
    int b = ++a + 5; // 9
    System.out.println("b = " + b);
    int c = b-- + a + 1; // 14
    System.out.println("c = " + c);
    int result = a++ + b-- - --c; // - 1
    System.out.println("result = " + result);

    int page = 1;
    System.out.println("현재 페이지는 " + page++ + "p 입니다.");
    System.out.println("현재 페이지는 " + page++ + "p 입니다.");
    System.out.println("현재 페이지는 " + page++ + "p 입니다.");
    System.out.println("현재 페이지는 " + page++ + "p 입니다.");



  }
}
