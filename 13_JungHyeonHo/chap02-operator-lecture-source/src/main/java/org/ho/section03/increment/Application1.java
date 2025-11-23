package org.ho.section03.increment;

import java.sql.SQLOutput;

public class Application1 {
  public static void main(String[] args) {
    /* 증가/감소 연산자
     * - ++,-- 단항 연산자
     * - 1씩 증가/감소
     * - 전위/후위 연산이 존재
     * - 전위 연산 : 모든 연산 중 제일 먼저 연산을 수행
     * - 후위 연산 : 모든 연산 중 제일 나중에 연산을 수행
     */
    int num = 20;
    System.out.println("num = " + num);//20

    num++;
    System.out.println("num = " + num);//21

    ++num;
    System.out.println("num = " + num);//22

    num += 1; //num=num+1 (복합 대입 연산자)
    System.out.println("num = " + num);//23

    num--; //num=num-1
    System.out.println("num = " + num);//22

    --num; //num=num-1
    System.out.println("num = " + num);//21

    /*전위/후위연산*/
    System.out.println("==============전위/후위 연산==============");

    int num2 = 10;
    int num3 = ++num2 + 5; //++변수명 -> 전위 연산 == 먼저 변수 값 1 증가

    System.out.println("num2 = " + num2);
    System.out.println("num3 = " + num3);

    int num4 = 50;
    int num5 = num4-- + 10;

    System.out.println("num4 = " + num4);
    System.out.println("num5 = " + num5);

    int a = 3;//a3
    int b = ++a + 5;//a4 b9
    int c = b-- + a + 1;//a4 b8 c14
    int result = a++ + b-- - -- c;//a5 b7 c13

    System.out.println("a = " + a);//5
    System.out.println("b = " + b);//7
    System.out.println("c = " + c);//13
    System.out.println("result = " + result);//-1

    int page=1;
    System.out.println("현재 페이지는 "+page++ +"p입니다.");
    System.out.println("현재 페이지는 "+page++ +"p입니다.");
    System.out.println("현재 페이지는 "+page++ +"p입니다.");
    System.out.println("현재 페이지는 "+page++ +"p입니다.");

  }

}
