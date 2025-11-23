package com.mycompany.section5.logical;

public class Application1 {
  public static void main(String[] args) {

    System.out.println("true와 true의 논리 and 연산 : " + (true && true));
    System.out.println("true와 false의 논리 and 연산 : " + (true && false));
    System.out.println("false와 true의 논리 and 연산 : " + (false && true));
    System.out.println("false와 false의 논리 and 연산 : " + (false && false));

    System.out.println("true와 true의 논리 or 연산 : " + (true || true));
    System.out.println("true와 false의 논리 or 연산 : " + (true || false));
    System.out.println("false와 true의 논리 or 연산 : " + (false || true));
    System.out.println("false와 false의 논리 or 연산 : " + (false || false));

    System.out.println("true의 논리 not 연산 : " + (!true));
    System.out.println("false의 논리 not 연산 : " + (!false));

    /* 비교 연산 + 논리 연산 */

    int a = 10;
    int b = 20;
    int c = 30;
    int d = 40;

    System.out.println(a < b && c < d); // 괄호 없이 < , < 부터 계산 true && true -> true
    System.out.println(a < b && c > d); // 괄호 없이 < , >  부터 계산 true && false -> false
    System.out.println(a > b && c < d); // 괄호 없이 > , <  부터 계산 false && ? -> false
    System.out.println(a > b && c > d); // 괄호 없이 > , >  부터 계산 false && ? -> false

    System.out.println(a < b || c < d); // t || ? -> true
    System.out.println(a < b || c > d); // t || > -> true
    System.out.println(a > b || c < d); // f || t -> true
    System.out.println(a > b || c > d); // f || f -> false

    int min = 0;
    int max = 100;
    int input = 50;
    System.out.println();

    // input은 min 이상, max 이하가 맞는가 ? true
    System.out.println(input >= min && input <= max);

  }
}
