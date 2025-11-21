package com.qew032.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {

  /*
  *  for ((1)초기실; (2) 조건식; (4) 증감식) {
  * (3) 조건식이 true일 때 반복 수행할 구문
  * }
  *
  * 조건식이 false가 되는 순간 반복 종료
  * */

  public  void testSimpleForStatement() {

    for(int i = 1; i <= 10;  i++) {
      System.out.println("출력 : " + i);
    }

  }

  /* 로또 번호 6개 생성(중복 제거 x , 정렬x) */
  public  void  testForExample1() {
    Random rand = new Random();


    for(int i = 1; i < 7; i++) {
      System.out.println("난수 : "+ (rand.nextInt(45) + 1));
    }
  }

  /* 1~100까지의 합 */
  public  void testForExample2() {
    int sum = 0;

    for (int i = 0; i <=100; i++) {
      sum += i;
    }
    System.out.println("합계 : " + sum);
  }

  /* 1부터 입력된 값 까지의 합 */
  public  void  tesForExample3() {
    Scanner sc = new Scanner(System.in);
    System.out.print("1보다 큰 정수 입력 : ");
    int input = sc.nextInt();
    int sum = 0;

    for (int i = 0; i <= input; i++) {
      sum += i;
    }

    System.out.println("합계 : " +  sum);

  }

/* 사용자로부터 2개의 값을 입력 받아
*  둘 중 작은 값 이상 큰 값 이하까지의 합을 구하자
*  */
  public  void  tesForExample4() {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫번째 정수 입력 : ");
    int input1 = sc.nextInt();

    System.out.print("두번째 정수 입력 : ");
    int input2 = sc.nextInt();


    // 최대 최소 구하기 방법 1
    int min = 0;
    int max = 0;

    if(input1 < input2) {
      min = input1;
      max = input2;
    } else {
      min = input2;
      max = input1;
    }


    int sum = 0;

    for (int i = min; i <= max; i++) {
      sum += i;
    }

    System.out.println("합계 : " +  sum);

  }


  public  void  tesForExample5() {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫번째 정수 입력 : ");
    int input1 = sc.nextInt();

    System.out.print("두번째 정수 입력 : ");
    int input2 = sc.nextInt();


    // 최대 최소 구하기 방법 2
    int min = Math.min(input1, input2);
    int max = Math.max(input1, input2);

    int sum = 0;

    for (int i = min; i <= max; i++) {
      sum += i;
    }

    System.out.println("합계 : " +  sum);

  }

}
