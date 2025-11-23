package com.my.section05.logical;

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


    /* 비교연산 + 논리연산 */
    int a = 10;
    int b = 20;
    int c = 30;
    int d = 40;

    System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인 : " + (a < b && c < d));
    System.out.println("a가 b보다 작으면서 c가 d보다 큰지 확인 : " + (a < b && c > d));
    System.out.println("a가 b보다 크면서 c가 d보다 작은 확인 : " + (a > b && c < d));
    System.out.println("a가 b보다 크면서 c가 d보다 큰지 확인 : " + (a > b && c > d));

    System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인 : " + (a < b || c < d));
    System.out.println("a가 b보다 작거나 c가 d보다 큰지 확인 : " + (a < b || c > d));
    System.out.println("a가 b보다 크거나 c가 d보다 작은 확인 : " + (a > b || c < d));
    System.out.println("a가 b보다 크거나 c가 d보다 큰지 확인 : " + (a > b || c > d));


    int min = 0;
    int max = 100;
    int input = 50;

    // input은 min 이상 max이하가 맞는가?
    System.out.println(input >= min && input <= max);
  }
}
