package com.beyond.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

  public void printTable() {

    /* 중첩 for문을 이용해서 출력하기
     * 1234
     * 1234
     * 1234
     *
     * */
    for (int row = 1; row <= 3; row++) {
      for (int column = 1; column <= 4; column++) {
        System.out.print(column);  // 1234 - 행 출력
      }
      System.out.println(); // 내용 없는 println() == 줄바꿈
    }


  }

  public void printTable2() {

    /* 중첩 for문을 이용해서 출력하기
     * 1234
     * 1234
     * 1234
     *
     * */
    for (int row = 3; row >= 1; row--) {
      for (int column = 4; column >= 1; column--) {
        System.out.print(column);  // 1234 - 행 출력
      }
      System.out.println(); // 내용 없는 println() == 줄바꿈
    }
  }

  /* 2단 구구단표 만들기*/
  public void printTwoDan() {
    System.out.println("====== 2단 ======");

    for (int row = 1; row <= 9; row++) {
      System.out.println("2 x " + row + " = " + 2 * row);
    }
  }

  /* 구구단표 */
  public void printNineNineDan() {

    for (int row = 2; row <= 9; row++) {
      System.out.println("====== "+ row +"단 ======");
      for (int col = 1; col <= 9; col++) {
        System.out.println(row + " x " + col + " = " + row * col);
      }

    }
  }

  /* 삼각형 모양으로 * 출력하기
  * - 1번째 줄 - 1개
  * - 2번째 줄 - 2개
  * - n번째 줄 - n개
  * *
  * **
  * ***
  * ****
  * *****
  * */
  public void printTriangleStar() {
    Scanner sc = new Scanner(System.in);
    System.out.print("출력하고 싶은 * 삼각형의 층 수 입력 : ");
    int floor = sc.nextInt();
    for (int row = 1; row <= floor; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print("*");
      }
      System.out.println(); // 줄 바꿈
    }
  }

}
