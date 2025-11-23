package com.google.section02.looping;

import java.util.Scanner;

public class A_for {

  /*
  * for((1) 초기식; (2) 조건식; (4) 증감식){
  * (3) 조건식이 true일때 반복 수행할 구문
  * }
  *
  * 실행 순서 :
  *  1회전  : 1 -> 2 -> 3 -> 4
  *  2회전 이후 : 2 -> 3 -> 4 반복
  *
  *  조건식이 false가 되는 순간 반복 종료
  * */

  // 단순 for문
  public void testSimpleForStatement() {
    for(int i = 1; i <= 10; i++ ){
      System.out.println("출력 : " + i);
    }
  }


  public void testForExample1(){
    for (int i = 1; i <= 6; i++) {
      System.out.println("i = " + i);
    }
  }

  // 1부턴 100까지의 합
  public void testForExample2(){
    for (int i = 1; i < 100; i++) {
      int sum = 0;
      sum = sum + i; // 1 ~ 100 까지 sum 변수에 i 값을 누적
    }

    System.out.println(" 합계 : " + 5050);
  }

  //1부터 입력된 값 까지의 합
  public void testForExample3() {
    Scanner sc = new Scanner(System.in);
    System.out.print("1보다 큰 정수 입력 : ");
    int input = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= input; i++){
      sum = sum + i;
    }


    System.out.println("합계 : " + sum);
  }




  //사용자부터 2개의 값을 입력받아
  // 둘 중 작은 값 이상 큰 값 이하까지의 합을 구하자
  public void testForExample4() {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫 번째 정수 입력 : ");
    int input = sc.nextInt();

    System.out.print("두 번째 정수 입력 : ");
    int input2 = sc.nextInt();

    // 최대 최소 구하기
    int min = 0;
    int max = 0 ;

    if (input < input2) {
      min = input;
      max = input2;
    } else { // input1     input2
      min = input2;
      max = input;
    }

    int sum = 0;
    for (int i = min; i <= max; i++){
      sum += i;
    }

    System.out.println("합계 : " + sum);
  }


  //사용자부터 2개의 값을 입력받아
  // 둘 중 작은 값 이상 큰 값 이하까지의 합을 구하자
  public void testForExample5() {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫 번째 정수 입력 : ");
    int input = sc.nextInt();

    System.out.print("두 번째 정수 입력 : ");
    int input2 = sc.nextInt();

    // 최대 최소 구하기 - 방법 2
    int min = Math.min(input, input2);
    int max = Math.max(input, input2);

    if (input < input2) {
      min = input;
      max = input2;
    } else { // input1     input2
      min = input2;
      max = input;
    }

    int sum = 0;
    for (int i = min; i <= max; i++){
      sum += i;
    }

    System.out.println("합계 : " + sum);
  }

  /*
  * */

}
