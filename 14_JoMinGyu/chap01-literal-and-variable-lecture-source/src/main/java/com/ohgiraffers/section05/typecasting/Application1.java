package com.ohgiraffers.section05.typecasting;

public class Application1 {
  public static void main(String[] args) {
    int inum1 = 10;
    long lnum1 = inum1;

    int inum2 = 20;
    long lnum2 = 100L;
    long result2 = inum2 + lnum2;

    int inum3 = 100;
    float fnum3 = 1.5f;
    float result3 = inum3 + fnum3;

    long lnum4 = 200L;
    float fnum4 = lnum4;

    char ch5 = 'A';
    int inum5 = ch5;


  }
}
