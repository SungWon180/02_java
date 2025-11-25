package com.my.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
  /*
  * 중첩 for문을 사용해서
  *  1 2 3 4
  *  1 2 3 4
  *  1 2 3 4
  * */
  public void printTable(){
    for(int row = 1; row <= 3; row++){
      for(int col=1; col <= 4; col++){
        System.out.print(col);
      }
      System.out.println(); //내용없는 println() == 줄바꿈
    }
  }

  /*
   * 중첩 for문을 사용해서
   *  4 3 2 1
   *  4 3 2 1
   *  4 3 2 1
   * */
  public void printTable1(){
    for(int row = 1; row <= 3; row++){
      for(int col=4; col >= 1; col--){
        System.out.print(col);
      }
      System.out.println(); //내용없는 println() == 줄바꿈
    }
  }

  /*  2단 구구단표 만들기 */
  public void printTwoDan(){
    System.out.println("===== 2단 =====");
    for(int i = 1; i <= 9; i++){
      System.out.println("2 * "+ i + " = " + 2 * i);
    }
  }

  public void printGuguDan(){
    for (int dan = 2; dan <= 9 ; dan++) {
      System.out.println("===== "+ dan + "단 =====");
      for(int i = 1; i <= 9; i++){
        System.out.println(dan + " * "+ i + " = " + 2 * dan);
      }
    }
  }
  /*삼각형 모양으로 별 출력하기
    출력할 줄 수를 입력하세요 : 5
      *
      **
      ***
      ****
      *****
  */
  public void printTriangleStar(){
    Scanner sc = new Scanner(System.in);
    System.out.print("출력하고 싶은 * 삼각형의 층 수 입력 : ");
    int floor = sc.nextInt();

    for(int row = 1; row <= floor; row++){
      for(int col=1; col <= row; col++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
