package com.beyond.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {
  /*
   *  for((1)초기식 ; (2)조건식 ; (4)증감식){
   *   (3) 조건식이 true일 때 반복 수행할 구문
   * }
   *
   * 실행 순서 :
   *  1회전 : 1 -> 2 -> 3 -> 4
   *  2회전 이후 : 2 -> 3 -> 4 반복
   *
   * * 조건식이 false가 되는 순간 반복 종료
   * */

  /* 단순 for문 */
  public void testSimpleForStatement() {

    // 1 ~ 10까지 차례대로 출력
    for (int i = 1; i <= 10; i++) {
      System.out.println("출력 : " + i);
    }

  }

  /* 로또 번호 6개 생성 (중복 제거 X, 정렬 X) */
  public void testForExample1() {
    Random rand = new Random(); // 랜덤 클래스

    for (int i = 1; i <= 6; i++) {
      System.out.println("난수 : " + (rand.nextInt(45) + 1));
    }
  }

  /* 1부터 100까지의 합 */
  /* fori 사용시 for 반복문 기본 양식 */
  public void testForExample2() {

    int sum = 0;  // 반복문 수행 전에 결과를 저장할 변수를 선언

    for (int i = 1; i <= 100; i++) {
      sum += i; // 1 ~ 100까지 sum 변수에 i값을 누적
    }

    System.out.println("1부터 100까지의 합: " + sum);
  }

  /* 1부터 입력된 값 까지의 합 */
  public void testForExample3() {
    Scanner sc = new Scanner(System.in);
    System.out.print("1보다 큰 정수 입력 : ");
    int input = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= input; i++) {
      sum += i;
    }
    System.out.println("1부터 " + input + "까지의 합: " + sum);
  }

  /* 사용자로부터 두 개의 값을 입력받아 */
  public void testForExample4() {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫 번째 정수 입력 : ");
    int input1 = sc.nextInt();
    System.out.print("두 번째 정수 입력 : ");
    int input2 = sc.nextInt();

    int min = 0;
    int max = 0;

    if (input1 > input2) {
      max = input1;
      min = input2;
    }else { // input <= input2
      max = input2;
      min = input1;
    }

    int sum = 0;
    for (int i = min; i <= max; i++) {
      sum += i;
    }
    System.out.println("합: " + sum);
  }

  /* 최대 최소 구하기 - 빙법 2(Java API - Math) */
  public void testForExample5() {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫 번째 정수 입력 : ");
    int input1 = sc.nextInt();
    System.out.print("두 번째 정수 입력 : ");
    int input2 = sc.nextInt();

    int min = Math.min(input1, input2);
    int max = Math.max(input1, input2);

    int sum = 0;

    for (int i = min; i <= max; i++) {
      sum += i;
    }
    System.out.println("합: " + sum);
  }

}
