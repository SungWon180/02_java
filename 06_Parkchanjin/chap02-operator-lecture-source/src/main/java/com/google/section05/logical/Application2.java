package com.google.section05.logical;

public class Application2 {
  public static void main(String[] args) {

    /*  1. num이 1초과 100이하의 값이 맞는감 */
    int num = 150;
    System.out.println(num > 1 && 100 >= num);


    /* 2. ch가 영어 대문자가 맞는가? */
    char ch = 'G';
    System.out.println(ch >= 'A' && ch <= 'Z' );
    System.out.println(ch >= 65 && ch <= 90 );
    System.out.println(ch >= 'A' && ch <= 'Z' );


    /* 3. ch2가 대소문자 구분 없이 영어 알파벳이 맞는감 */
    char ch2 = 'y';
    System.out.println(ch2 == 'y' || ch2 == 'Y');



    /* 4. ch2가 대소문자 구분 없이 영어 알파벳이 맞는감 */
    char ch3 = 'a';
    System.out.println((ch3 >= 'A' && ch3 <= 'Z' ) || (ch3 >= 'a' && ch3 <= 'z' ) );

  }
}
