package com.jinosoft.section05.logical;

public class Application01 {

  public static void main(String[] args) {

    char ch = 'G', ch2 = 'Y', ch3 = 'o';
    
    // 2. ch가 영어 대문자가 맞는가?
    System.out.println( ch >= 65 && ch <= 90);
    
    // 3. ch2가 대소문자 구분 없이 'y'가 맞는가?
    System.out.println(ch2 == 'Y' || ch2 == 'y');

    // 4. ch3가 대소문자 구분 없이 영어 알파벳이 맞는가?
    System.out.println((ch3 >= 'A' && ch3 <= 'Z') || (ch3 >= 'a' && ch3 <= 'z'));
  }
}
