package com.kang.section05.logical;

public class Application2 {
  public static void main(String[] args) {


    /* 1. num이 1 초과 100 이하의 값이 맞는가? */

    int num = 150;

    System.out.println(num > 1 && num <= 100);

    /* 2. ch가 영어 대문자가 맞는지 ?

     */
    char ch = 'G';
    System.out.println(ch > 65 && ch < 90);
    /* 3. ch2가 대소문자 구분 없이 'y'가 맞는가
     */
    char ch2 = 'y';
    System.out.println(ch == 'y' || ch2 == 'Y');
    /* 4. ch3가 대소문자 구분 없이 영어 알파벳이 맞는가?
     */
    char ch3 = 'o';
    System.out.println(ch3 >= 'A' && ch3 <= 'Z') || (ch3 >= 'a' && ch3 <= 'z');





  }
}
