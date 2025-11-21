package com.work.section01.conditional;

import java.util.Scanner;

public class A_if {
  public static void main(String[] args) {

    /*if문
    *
    * [작성법]
    * if(조간석){
    *    조건식이 true일 경우 수행할 코드;
    *     }*/


    }

  public void testSimpleIfStatement(){
    Scanner sc = new Scanner(System.in);
    System.out.print(" 정수 하나 입력 : ");
    int input = sc.nextInt();

    if (input % 2 == 0) {
      System.out.println("입력하신 정수는 짝수");
    }else{
      System.out.println("홀수");
    }
    System.out.println("프로그램을 종료합니다.");

  }

//  중첩 if문
  public void testNestedIfStatement() {
    Scanner sc = new Scanner(System.in);
    System.out.print(" 정수 하나 입력 : ");
    int input = sc.nextInt();

    if (input > 0){
      if (input % 2 == 0) {
        System.out.println("입력하신 정수는 짝수");
      } else {
        System.out.println("홀수");
      }
    }
    System.out.println("프로그램을 종료합니다.");
  }
}
