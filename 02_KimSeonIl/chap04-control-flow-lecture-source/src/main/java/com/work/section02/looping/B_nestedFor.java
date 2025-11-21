package com.work.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

  /*
  * 1 2 3 4
  * 1 2 3 4
  * 1 2 3 4
  * */

  public void printTable(){
    for(int row =1; row <= 3; row++) {
      // 1234 - 행 출력
      for (int col = 1; col <= 4; col++) {
        System.out.print(col +" ");

      }
      System.out.println(); // 내용 없는 println() == 줄바꿈
    }
  }

  public void printTable2(){
    for(int row =1; row <= 3; row++) {
      // 1234 - 행 출력
      for (int col = 4; col >= 1; col--) {
        System.out.print(col +" ");

      }
      System.out.println(); // 내용 없는 println() == 줄바꿈
    }
  }

  public void print2dan(){
    System.out.println("========== 2단 ==============");
    for (int i = 2; i <= 2; i++) {
      for (int row = 1; row <= 9; row++) {
        System.out.println(i+"*"+row+"="+i*row);
      }
    }
  }

  public void printgugudan(){
    for (int i = 2; i <= 9; i++) {
      System.out.println("========= "+i+"단 ============");
      for (int row = 1; row <= 9; row++) {
        System.out.println(i+"*"+row+"="+i*row);
      }
    }
  }

  /*
   *
   **
   ***
   ****
   *****
   *
   1번째 줄 - 1개
   2번째 줄 - 2개
   n번째 줄 - n개
   /
   */
  public void printTriangleStar(){

    Scanner sc = new Scanner(System.in);
    System.out.println("출력 하고싶은 * 삼각형의 층 수 입력:" );
    int floor = sc.nextInt();

    for (int row = 1; row <= floor; row++) {   //행
      for (int col = 1; col <= row; col++) { //열
        System.out.print("*"); //
      }
      System.out.println();
    }
  }
}
