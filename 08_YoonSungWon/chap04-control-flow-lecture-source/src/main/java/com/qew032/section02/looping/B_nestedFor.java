package com.qew032.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

  public  void printTable(){
    /* 중첩 for문을 이용해서 출력하기
    *  1 2 3 4
    *  1 2 3 4
    *  1 2 3 4
    * */

    for(int row = 1; row < 4; row++) {
      for (int col = 1; col <= 4 ; col++) {
        System.out.print(col);
      }
      System.out.println();
    }

  }

  public  void printTable2() {
    /* 중첩 for문을 이용해서 출력하기
     *  1 2 3 4
     *  1 2 3 4
     *  1 2 3 4
     * */

    for (int row = 1; row < 4; row++) {
      for (int col = 4; col >= 1; col--) {
        System.out.print(col);
      }
      System.out.println();
    }
  }

  /* 2단 구구단표 만들기 */
  public  void  printGugudan() {
    System.out.println("===== 2단 =====");

    for (int num = 2; num <= 9; num++) {
      System.out.println("===== "+num+"단 =====");
      for (int i = 1; i < 10; i++) {
        System.out.println(num + " x " + i + " = " + num*i);
      }
      System.out.println();
    }
  }

  public void printTriangleStar(){
    System.out.println("===== 별 찢기 =====");
    Scanner scanner=new Scanner(System.in);
    System.out.print("출력하고 싶은 * 삼각형의 층 수 입력 : ");
    int floor=scanner.nextInt();

    for (int i = 1; i <= floor; i++) {
      for (int j = 1; j <= i ; j++) {
        System.out.print("*");
      }
      System.out.println();
    }


//    출력할 줄 수를 입력하세요 : 5
//            *
//            **
//            ***
//            ****
//            *****

  }

}
