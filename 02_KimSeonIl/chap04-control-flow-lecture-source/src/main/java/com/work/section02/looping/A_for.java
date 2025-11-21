package com.work.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {
  /*
  for((1)초기식; (2)조건식; (4)증감식;){
    (3)조건식이 true일때 반복수행할 구문;
  }

  실행 순서 :
   1회전 : 1 -> 2 -> 3 -> 4
   2회전 이후: 2 -> 3 -> 4

   조건식이 false가 되는 순간 반복 종료

  * */

  /*단순 for문*/
  public void testSimpleForStatement() {
    //1부터 10까지 차례대로 출력
    for (int i = 1; i <= 10; i++) {
      System.out.println("출력 : " + i);
    }
  }

  public void testForExample1() {
    Random random = new Random();

    for (int i = 1; i < 7; i++) {

      System.out.println("난수 : " + (random.nextInt(45) + 1));
    }
  }

  /*1부터 100까지의 합*/
  public void testForExample2() {
    int sum = 0;
    for (int i = 0; i <= 100; i++) {
      sum += i;
    }
    System.out.println("합계 : " + sum);

  }

  /*1부터 입력된 값 까지의 합*/
  public void testForExample3() {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    System.out.println("1보다 큰 정수 입력 : ");
    int input = sc.nextInt();
    for (int i = 1; i <= input; i++) {
      sum += i;
    }
    System.out.println("합계 : " + sum);
  }

  // 사용자로 부터 2개의 값을 입력 받아 둘중 작은 값 이상 큰 값 이하까지의 합을 구하자
  public void testForExample4() {
    Scanner sc = new Scanner(System.in);
    System.out.println("첫번째 정수 입력: ");
    int input1 = sc.nextInt();
    System.out.println("두번째 정수 입력: ");
    int input2 = sc.nextInt();

    int min = 0;
    int max = 0;

    //최대 최소 구하기 방법 1번
    if (input1 < input2) {
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
    System.out.println("합계 : " + sum);
  }


  // 사용자로 부터 2개의 값을 입력 받아 둘중 작은 값 이상 큰 값 이하까지의 합을 구하자
  public void testForExample5() {
    Scanner sc = new Scanner(System.in);
    System.out.println("첫번째 정수 입력: ");
    int input1 = sc.nextInt();
    System.out.println("두번째 정수 입력: ");
    int input2 = sc.nextInt();

    //최대 최소 구하기 방법 2번


//    int result = input1 > input2 ? (input1 : input2);
    int min = Math.min(input1, input2);
    int max = Math.max(input1, input2);


    int sum = 0;
    for (int i = min; i <= max; i++) {
      sum += i;
    }
    System.out.println("합계 : " + sum);
  }

  public void testForExample6() {
    Scanner sc = new Scanner(System.in);
    System.out.println("첫번째 정수 입력: ");
    int input1 = sc.nextInt();
    System.out.println("두번째 정수 입력: ");
    int input2 = sc.nextInt();


    int min = (input1 < input2) ? input1 : input2;
    int max = (input1 > input2) ? input1 : input2;

    int sum = 0;

    for (int i = min; i <= max; i++) {
      sum += i;
    }

    System.out.println("합계: " + sum);

  }


}


