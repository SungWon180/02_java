package com.wjdqudwls.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {
  public static void main(String[] args) {

  }

  /*
   * for((1) 초기식 ; (2) 조건식 ; (4) 증감식){
   *   (3) 조건식이 true일 때 반복 수행할 구문
   * }
   *
   * 실행 순서 :
   * 1 회전 : 1 -> 2 -> 3 -> 4
   * 2 회전 이후 : 2 -> 3 -> 4 -> 반복
   *
   * * 조건식이 false가 되는 순간 반복 종료
   * */
  public void testSimpleForStatement() {

    // 1 ~ 10까지 차례대로 출력
    for (int i = 1; i <= 10; i++) {
      System.out.println("출력 : " + i);
    }
  }

  /* 로또 번호 6개 생성 ( 중복 제거 x */
  public void testForExample() {
    Random rand = new Random(); // Random class
    for (int i = 1; i <= 6; i++) {
      System.out.println("난수 : " + (rand.nextInt(45) + 1));
    }
  }

  /* 1부터 100까지의 합 */
  public void testForExample2() {
    int sum = 0; // 반복문 수행 전에 결과를 저장할 변수를 선언
    for (int i = 1; i <= 100; i++) {
      sum += i; // 1 ~ 100까지 sum 변수에 i값을 누적
    }
    System.out.println("합계 : " + sum);
  }

  public void testForExample3() {
    Scanner sc = new Scanner(System.in);
    System.out.println("1 보다 큰 정수 입력 : ");
    int input = sc.nextInt();

    int sum1 = 0;
    for (int i = 0; i <= input; i++) {
      sum1 += i;


    }

    System.out.println("합계 : " + sum1);
  }
  /* 사용자로 부터 2개의 값을 입력 받아
   *
   * */

  public void testForExample4() {
    Scanner sc = new Scanner(System.in);
    System.out.println("첫 번쨰 정수 입력 : ");
    int input1 = sc.nextInt();

    System.out.println("두 번째 정수 입력 : ");
    int input2 = sc.nextInt();

    // 최대 최소 구하기 - 방법 1
    int min = 0;
    int max = 0;

    if (input1 < input2) {
      min = input1;
      max = input2;
    } else { // input1 >= input2
      min = input2;
      max = input1;
    }

    int sum1 = 0;
    for (int i = min; i <= max; i++) {
      sum1 += i;
    }
    System.out.println("합계 : " + sum1);


    //최대 최소 구하기 - 방법 2(Java API -Math)
    min = Math.min(input1, input2);
    max = Math.max(input1, input2);
    int sum = 0;
    for (int i = min; i <= max; i++) {
      sum += i;
    }
    System.out.println("합계: " + sum);
  }

}
