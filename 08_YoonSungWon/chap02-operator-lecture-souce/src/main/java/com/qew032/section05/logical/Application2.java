package com.qew032.section05.logical;

public class Application2 {

  public static void main(String[] args) {

    /* 1. num이 1초과 100이하의 값이 맞는가? */
    int num = 150;
    System.out.println(1 < num && num <= 100);

    /* 2.  ch가 영어 대문자가 맞는지 확인*/
    char ch = 'G';
    System.out.println('A'<= ch && 'Z' >= ch);

    /* 3.  ch2가 대소문자 구분 없이 'y'가 맞는가?*/
    char ch2 = 'Y';
    System.out.println(ch2 == 'Y' || ch2 == 'y');

    /* 4. ch3가 대소문자 구분 없이 영어 알파벳이 맞는가? */
    char ch3 = 'o';
    System.out.println(('A'<= ch3 || 'Z' >= ch3) || ('a'<= ch3 || 'z' >= ch3));



  }

}
