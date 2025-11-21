package com.mins.section01.literal;

public class Application3 {
  public static void main(String[] args) {
    /* 문자열 합치기(+) 테스트*/
    /* 두 개의문자열 합치기(+) 합치기*/
    /* 세 개의문자열 합치기(+) 합치기*/

    System.out.println(9 + 9); // 18
    System.out.println('9' + 9); // 99
    System.out.println(9 + '9'); // 99
    System.out.println('9' + '9'); // 99

    System.out.println(9 + 9 + "9"); // 189
    System.out.println(9 + "9" + 9);  // 999
    System.out.println("9" + 9 + 9); // 999
    System.out.println("9" + (9 + 9)); // 918

    /* 3. 문자열 합치기 응용*/
    System.out.println("===== 10과 20의 산술 연산 결과");
    System.out.println(10 + 20);
    System.out.println(10 - 20);
    System.out.println(10 * 20);
    System.out.println(10 / 20);
    System.out.println(10 % 20);

    System.out.println(" ===== 보기 좋게 출력 =====");
    System.out.println("10 + 20 = " + (10 + 20));
    System.out.println("10 - 20 = " + (10 - 20));
    System.out.println("10 * 20 = " + (10 * 20));
    System.out.println("10 / 20 = " + (10 / 20));
    System.out.println("10 % 20 = " + (10 % 20));

    /* 4. */

    int age;
    age = 20;
    int point = 100;
  }
}
