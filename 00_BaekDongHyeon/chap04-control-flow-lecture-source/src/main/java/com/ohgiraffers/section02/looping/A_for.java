package com.ohgiraffers.section02.looping;

import java.util.Random;

public class A_for {
  
  /*  
  * for((1)초기식 ; (2)조건식 ; (4) 증감식){
  *   (3) 조건식이 true일 때 반복 수행할 구문
  * }
  *
  * 실행 순서 :
  *  1회전: 1 -> 2 -> 3 -> 4
  *  2회전 이후 : 2 -> 3 -> 4 반복
  *
  * * 조건식이 false가 되는 순간 반복 종료
  * */

  /* 단순 for문 */
  public void testSimpleForStatement(){

    // 1 ~ 10까지 차례대로 출력
    for(int i = 1; i <= 10; i++){
      System.out.println("출력 : " + i);
    }
  }

  /* 로또 번호 6개 생성 (중복 제거 X, 정렬 X)*/
  public void testForExample1(){
    Random rand = new Random(); // 랜덤 클래스

    for(int i = 1; i <= 6 ; i++){
      System.out.println("난수 : " + (rand.nextInt(45) + 1) );
    }
  }
  
  /* 1부터 100까지의 합 */
  public void testForExample2(){

    int sum = 0; // 반복문 수행 전에 결과를 저장할 변수를 선언
    
    for (int i = 1; i <= 100; i++) {
      sum += i; // 1 ~ 100까지 sum 변수에 i값을 누적
    }

    System.out.println("합계 : " + sum);
  }




}
