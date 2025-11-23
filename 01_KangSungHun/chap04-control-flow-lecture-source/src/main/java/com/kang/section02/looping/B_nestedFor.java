package com.kang.section02.looping;

import java.util.Scanner;

public class B_nestedFor {


  /* 중첩 for문을 이용해서 출력하기
     1 2 3 4
     1 2 3 4
     1 2 3 4
     1 2 3 4
   */
  public void printTable() {

    for (int row = 1; row <= 3; row++) {
      // 1234
      for (int col = 1; col <= 4; col++) {
        System.out.print(col);

      }
      System.out.println();
    }


  }

  public void printTable2() {

    for (int row = 1; row <= 3; row++) {
      // 1234
      for (int col = 4; col <= 1; col--) {
        System.out.print(col);

      }
      System.out.println();
    }


  }

  /* 2단 구구단표 만들기 */
  public void printTwoDan() {
    System.out.println("==== 2단 ====");

    for (int i = 1; i <= 9; i++) {
      System.out.println("2 *" + i + "= " + 2 * i);
    }
  }

  /*
   * *
   * **
   * ***
   * ****
   * *****
 */

  public void printTriangleStar() {

    Scanner sc = new Scanner(System.in);
    System.out.print("출력하고 싶은 * 삼각형의 층 수 입력 : ");
    int floor = sc.nextInt();

    for (int row = 1; row <= floor; row++) { //행 반복

      for (int col = 1; col <= row; col++) { // 열 반복

        System.out.print("*");

      }
      System.out.println();
    }
  }
}
