package com.mycompany.section5.logical;

public class Application2 {
  public static void main(String[] args) {

    /* 1. num이 1 초과 100 이하의 값이 맞는가 */
    int num = 150;
    int min = 1;
    int max = 100;
    System.out.println("1. num은 " + min + "초과 " + max + "미만이 맞는가? \n: " + (num > min && num <= max));

    /* 2, ch가 영어 대문자가 맞는가? */
    char ch = 'G';
    char a = 'A';
    char z = 'Z';

    System.out.println("2. ch는 대문자가 맞는가? \n: " + (ch >= a && ch <= z));

    /* 3. ch2가 대소문자 구분 없이 'y' 가 맞는가 */
    char ch2= 'y';
    char charic1 = 'y';
    char charic2 = 'Y';

    System.out.println("3. ch2는 y or Y 가 맞는가? \n: " + (ch2 == charic1 || ch2 == charic2));

    /* 4. ch3가 대소문자 구분 없이 영어 알파벳이 맞는가?*/
    char ch3 = 'o';
    char charic3 = 'A';
    char charic4 = 'Z';
    char charic5 = 'a';
    char charic6 = 'z';


    System.out.println("4. ch3는 대소문자 구분 없이 알파벳이 맞는가? \n: " + ((ch3 >= charic3 || ch3 <= charic4) || (ch3 >= charic5 || ch3 <= charic6)) );


  }
}
