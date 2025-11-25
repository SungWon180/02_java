package org.ho.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i=0;
    do{
      System.out.print("2보다 큰 정수를 하나 입력하세요 : ");
      i = sc.nextInt();
      if (i <= 2) System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
      else{
        for (int j = 2; j <= i; j++) {
          if(j==i) System.out.println("소수다.");
          else if(i%j==0) {System.out.print("소수가 아니다.");break;}
        }
      }
    }
    while(i<=2);
  }
}
