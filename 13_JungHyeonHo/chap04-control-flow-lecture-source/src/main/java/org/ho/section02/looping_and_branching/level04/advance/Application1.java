package org.ho.section02.looping_and_branching.level04.advance;

import java.util.Scanner;

public class Application1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("문자열을 입력하세요 : ");
    String input = sc.nextLine();
    System.out.print("숫자를 입력하세요 : ");
    char[] cA = input.toCharArray();
    int input2 = sc.nextInt();
    input2 %= 26;
    for (int i = 0; i < input.length(); i++) {
      if (i % 2 == 1) continue;
      if (('a' <= cA[i] + input2 && cA[i]+ input2 <= 'z') ||
          ('A' <= cA[i] + input2 && cA[i]+ input2 <= 'Z'))
        cA[i] += input2;
      else cA[i] += input2-26;
    }
    for (int i = 0; i < cA.length; i++) {
      System.out.print(cA[i]);
    }
  }
}
