package com.my.section05.logical;

public class Application2 {
  public static void main(String[] args) {
    // system.out.print("내용") : 출력 후 줄바꿈 없음

    /* 1. num이 1초과 100 이하의 값이 맞는가? */
    int num = 150;
    System.out.println(num > 1 && num <= 100);

    /* 2. ch가 영어 대문자가 맞는가? */
    char ch = 'G';
    System.out.println(ch >= 65 && ch <= 90);
    System.out.println(ch >= 'A' && ch <= 'z');

    /* 3. ch2가 대소문자 구분 없이 'y'가 맞는가 */
    char ch2 = 'y';
    System.out.println(ch2 == 'Y' || ch2 == 'y');

    /* 4. ch3가 대소문자 구분 없이 영어 알파벳이 맞는가? */
    char ch3 = 'o';
    System.out.println((ch >= 65 && ch <= 90) || (ch2 >= 97 || ch2 <= 122));
    System.out.println((ch >= 'A' && ch <= 'Z') || (ch2 >= 'a' || ch2 <= 'z'));
  }
}
