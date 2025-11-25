package org.ho.section02.looping_and_branching.level02.normal;

import java.util.Scanner;

public class Application3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("정수를 입력하세요 : ");
    int input = sc.nextInt();
    for (int i = 1; i <= input; i++) {
      System.out.print(i % 2 == 0 ? "박" : "수");
    }
  }
}
