package com.work.section05.logical;

public class Application2 {
  public static void main(String[] args) {
    /*1. num이 1초과 100 이하의 값이 맞는가 확인*/
     int num = 150;
    System.out.println(num > 1 && num <= 100);

    /*2. ch가 영어 대문자가 맞는지 확인*/
    char ch = 'G'; //65 < ch <90
    System.out.println(ch >= 65 && ch <= 90);

    /*3. ch2가 대소문자 구분 없이 'y'가 맞는지 확인*/
    char ch2 = 'X';
    System.out.println(ch2 >= 65 && ch2 <= 122);
 //a = 65~122
    /*4. ch3가 대소문자 구분 없이 영어 알파벳이 맞는가?*/
    char ch3 = 'a';
    System.out.println(ch3 >= 65 && ch3 <= 122);

  }
}
