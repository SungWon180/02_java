package com.google.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
  public void printTable() {
    for(int row = 1; row <= 3; row ++) {
      for(int col = 1; col <= 4; col++) {
        System.out.print(col);
      }
      System.out.println();
    }

  }






  public void printTable2() {
    for (int row = 4; row <= 4; row--) {
      for (int col = 1; col <= 4; col++) {
        System.out.print(col);
      }
      System.out.println();
    }
  }

  public void printTwoDan() {
    System.out.println("====== 2단=====");
  }


  public void printTriangleStar() {
    Scanner sc = new Scanner(System.in);
    System.out.print("출력하고 싶은 * 삼각형의 층 수 입력 : ");
    int floor = sc.nextInt();

    for (int row = 1; row <= floor; row++) { //행반복

      for(int col = 1; col <= row; col ++){ //열반복
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
