package org.ho.section02.looping_and_branching.level02.normal;

import java.util.Scanner;

public class Application1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("문자열을 입력하세요 : ");
    String input = sc.nextLine();
    for (int i = 0; i < input.length(); i++) {
      System.out.println(i+" : "+input.charAt(i));
    }
  }
}
