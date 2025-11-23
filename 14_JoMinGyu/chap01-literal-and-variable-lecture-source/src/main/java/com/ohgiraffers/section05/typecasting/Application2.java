package com.ohgiraffers.section05.typecasting;

public class Application2 {
  public static void main(String[] args) {
    double dnum2 = 0.1234567890123456789;
    System.out.println("dnum2 = " + dnum2);

    float fnum2 = (float) dnum2;
    System.out.println("fnum2 = " + fnum2);

    int inum3 = 217;
    System.out.println(Integer.toBinaryString(inum3));
    byte bnum3 = (byte) inum3;
    System.out.println("bnum3 = " + bnum3);
  }
}
