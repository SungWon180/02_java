package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

  /* 중첩 for문을 이용해서 출력하기
  * 1234
  * 1234
  * 1234
  * */
  public void printTable(){

    for(int row = 1 ; row <= 3 ; row++) {

      // 1234 - 한 행의 컬럼 값 출력
      for (int col = 1; col <= 4; col++) {
        System.out.print(col);
      }
      System.out.println(); // 내용 없는 println() == 줄바꿈

    }

  }



  /* 중첩 for문을 이용해서 출력하기
   * 4321
   * 4321
   * 4321
   * */
  public void printTable2(){

    for(int row = 1 ; row <= 3 ; row++) {

      // 4321 - 한 행의 컬럼 값 출력
      for (int col = 4; col >= 1; col--) {
        System.out.print(col);
      }
      System.out.println(); // 내용 없는 println() == 줄바꿈
    }
  }


  /* 구구단표 만들기 */
  public void printGuguDan(){

    for(int dan = 2 ; dan <= 9 ; dan++) { // 2~9단 선택
      System.out.println("===== "+dan+"단 =====");

      for (int i = 1; i <= 9; i++) {
        System.out.println(dan + " * " + i + " = " + (dan * i));
      }
    }
  }


  /* 삼각형 모양으로 별 출력하기
   * 1번째 줄 - 1개
   * 2번째 줄 - 2개
   * n번째 줄 - n개
   *
   *  *
   *  **
   *  ***
   *  ****
   *  *****
   *
   * */
  public void printTriangleStar(){
    Scanner sc = new Scanner(System.in);
    System.out.print("출력하고 싶은 * 삼각형의 층 수 입력 : ");
    int floor = sc.nextInt();

    for(int row = 1 ; row <= floor ; row++){ // 행 반복

      for(int col = 1 ; col <= row ; col++){ // 열 반복
        System.out.print("*");
      }
      System.out.println(); // 줄바꿈
    }
  }

}
