package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application2 {
  public static void main(String[] args) {
    int random1 = (int)(Math.random()*10);
    System.out.println("random1 = " + random1);

    Random ran =  new Random();
    int random4 = ran.nextInt(10);
    System.out.println("random4 = " + random4);
  }
}
