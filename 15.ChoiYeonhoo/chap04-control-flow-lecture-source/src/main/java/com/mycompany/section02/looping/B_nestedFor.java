package com.mycompany.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

  /* 중첩 for문을 이용해서
   * 1234
   * 1234
   * 1234
   * */
  public void printTable() {

    for (int row = 1; row <= 3; row++) {

      // 1234 한 행의 컬럼 값 출력
      for (int col = 1; col <= 4; col++) {
        System.out.print(col);
      }
      System.out.println();
    }
  }

  public void printTable2() {

    for (int row = 1; row <= 3; row++) {

      // 1234 한 행의 컬럼 값 출력
      for (int col = 4; col >= 1; col--) {
        System.out.print(col);
      }
      System.out.println();
    }
  }

  public void printTwoDan() {
    System.out.println("===== 2단 =====");
    for (int i = 1; i <= 9; i++) {

      System.out.println("2 * " + i + " = " + 2 * i);
    }
  }

  /* 구구단표 만들기*/
  public void printGugudan() {

    for (int dan = 2; dan <= 9; dan++) {
      System.out.println("===== "+ dan +"단 =====");
      for (int i = 1; i <= 9; i++) {
        System.out.println( dan + " * " + i + " = " + dan * i);
      }
    }
  }

  public void printTriangleStar(){
    /* 삼각형 모양으로 * 출력하기
     *
     **
     ***
     ****
     *****
    */

    Scanner sc = new Scanner(System.in);
    System.out.println("=== 줄 수 입력 ===");
    int numRows = sc.nextInt();
    sc.nextLine();

    for (int row = 1; row <= numRows; row++) { // 행 반복

      for (int col1 = 1; col1 <= numRows - row + 1 ; col1++) {
        System.out.print(" ");// 열 스페이스바 출력반복
      }
      for (int col2 = 1; col2 <= 2 * row - 1; col2++) { // 열 별 출력반복
        System.out.print("*");
      }
      System.out.println(); // 줄바꿈
    }


  }


}
