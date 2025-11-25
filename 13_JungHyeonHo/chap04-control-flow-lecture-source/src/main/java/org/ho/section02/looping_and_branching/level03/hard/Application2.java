package org.ho.section02.looping_and_branching.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    int r = random.nextInt(101);
    int i = 1;
    do {
      System.out.print("정수를 입력하세요 : ");
      int input = sc.nextInt();
      if (input < r) System.out.println("입력하신 정수보다 큽니다.");
      else if (input > r) System.out.println("입력하신 정수보다 작습니다.");
      else {
        System.out.println("정답입니다. " + i + "회만에 정답을 맞추셨습니다.");
        break;
      }
      i++;
    }
    while (true);
  }
}
