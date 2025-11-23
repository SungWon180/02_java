package com.ohgiraffers.section05.logical;

public class Application2 {
  public static void main(String[] args) {
    int num = 150;
    System.out.println(num > 1 && num <= 100);

    char ch = '6';
    System.out.println(ch >= 'A' && ch <= 'Z');

    char ch2 = 'y';
    System.out.println(ch2 == 'y');

    char ch3 = 'o';
    System.out.println(ch3 >= 'A' && ch3 <= 'z');
  }
}
