package org.ho.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫번째 정수 : ");
    int a = sc.nextInt();
    System.out.print("두번째 정수 : ");
    int b = sc.nextInt();
    char op = sc.next().charAt(0);
    int sum=0;
    switch(op){
      case '+':
        sum=a+b;
        break;
      case '-':
        sum=a-b;
        break;
      case '*':
        sum=a*b;
        break;
      case '/':
        sum=a/b;
        break;
    }
    System.out.println(a+" "+op+" "+b+" = "+sum);
  }
}
