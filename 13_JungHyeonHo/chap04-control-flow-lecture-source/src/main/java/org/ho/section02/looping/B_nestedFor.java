package org.ho.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

  public void printTable() {
    for (int row = 1; row <= 3; row++) {
      for (int col = 1; col <= 4; col++) {
        System.out.print(col);
      }
      System.out.println();
    }
  }

  /* 9단 구구단표 만들기 */
  public void printDan() {
    for (int i = 1; i <= 9; i++) {
      System.out.println(" ==== " + i + "단 ====");
      for (int j = 1; j <= 9;j++) {
        System.out.println(i+" * " + j + "=" + i * j);
      }
    }
  }

  public void printTriangleStar(){
    Scanner sc=new Scanner(System.in);
    System.out.println("출력하고 싶은 * 삼각형의 층 수 입력 : ");
    int row = sc.nextInt();
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
