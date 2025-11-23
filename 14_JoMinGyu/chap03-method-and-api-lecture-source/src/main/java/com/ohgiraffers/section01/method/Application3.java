package com.ohgiraffers.section01.method;

public class Application3 {
  public static void main(String[] args) {
    Application3 application3 = new Application3();
    application3.printAge(19);

  }

  /**
   * 전달 받은 age를 출력하는 메서드
   * @param age 나이를 의미하는 int 타입 값
   */
  public void printAge(int age) {
    System.out.println("your age is " + age);
  }


}
