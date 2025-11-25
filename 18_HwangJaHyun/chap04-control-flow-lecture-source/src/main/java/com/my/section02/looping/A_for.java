package com.my.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {
  public void testSimpleForStatement(){
    /*
    * for((1)초기식; (2)조건식; (4)증감식){
    * (3) 조건식이 true일때 반복 수행할 구문
    * }
    * 실행순서
    * 1회전 : 1->2->3->4
    * 2회전이후 : 2->3->4
    * 조건식이 false가 되는 순간 반복 종료
    * */

    /* 단순 for문 */
    
    // 1~10까지 차례대로 출력
    for(int i = 1; i <= 10; i++){
      System.out.println(i);
    }
  }

  //로또번호생성기()
  public void testForExample(){
    Random rand = new Random(); // 랜덤 클래스
    for(int i = 1; i <= 6; i++){
      System.out.println("난수 : " + (rand.nextInt(45)+1) );
    }
  }

  /* 1부터 100까지의 합 */
  public void testForExample2(){
    int sum = 0;
    for(int i = 1; i <= 100; i++){
      sum += i;
    }
    System.out.println("합계: " + sum);
  }

  /* 1부터 입력된 값까지의 합 */
  public void testForExample3(){
    Scanner scan = new Scanner(System.in);
    System.out.println("1보다 큰 정수 입력: ");
    int input = scan.nextInt();
    int sum = 0;

    if (input > 0) {
      for(int i = 1; i <= input; i++){
        sum += i;
      }
    }else{
      System.out.println("입력한 값이 1보다 작습니다.");
      return;
    }
    System.out.println("합계 : " + sum);
  }

  /* 사용자로부터 두개의 값을 입력받아
  * 둘 중 작은 값 이상 큰 값 이하까지의 합을 구하자. */
  public void testForExample4(){
    Scanner scan = new Scanner(System.in);

    System.out.println("첫 번째 정수 입력 : ");
    int input1 = scan.nextInt();

    System.out.println("두 번째 정수 입력 : ");
    int input2 = scan.nextInt();

    int min = 0;
    int max = 0;
    int sum = 0;

    if (input1 < input2) {
      min = input1;
      max = input2;
    }else{ // input1 >= input2
      min = input2;
      max = input1;
    }
    for(int i = min; i <= max; i++){
      sum += i;
    }
    System.out.println("합계 : " + sum);
  }


  /* 사용자로부터 두개의 값을 입력받아
   * 둘 중 작은 값 이상 큰 값 이하까지의 합을 구하자. */
  public void testForExample5(){
    Scanner scan = new Scanner(System.in);

    System.out.println("첫 번째 정수 입력 : ");
    int input1 = scan.nextInt();

    System.out.println("두 번째 정수 입력 : ");
    int input2 = scan.nextInt();

    // 최대 최소 구하기 - 방법1(JAVA API - Math)
    int min = Math.min(input1, input2);
    int max = Math.max(input1, input2);

    int sum = 0;

    for(int i = min; i <= max; i++){
      sum += i;
    }
    System.out.println("합계 : " + sum);
  }
}
