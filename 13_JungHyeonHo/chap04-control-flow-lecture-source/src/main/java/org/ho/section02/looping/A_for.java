package org.ho.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {
  /**
   * for((1)초기식; (2)조건식: (4)증감식{
   * (3) 조건식이 true일 때 반복 수행할 구문
   * }
   * <p>
   * 실행 순서:
   * 1회전: 1,2,3,4
   * 2회전 이후: 2,3,4 반복
   * <p>
   * 조건식이 false가 되는 순간 반복 종료
   */
  /* 단순 for문 */
  public void testSimpleForStatement() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("출력: " + i);
    }
  }

  /* 로또 번호 6개 생성 (중복 제거 X, 정렬  X)*/
  public void testForExample1() {
    Random random = new Random();
    for (int i = 1; i <= 6; i++) {
      System.out.println("난수 : " + (random.nextInt(45) + 1));
    }
  }

  /* 1부터 100까지의 합 */
  public void testForExample2() {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      sum += i;
    }
    System.out.println("sum = " + sum);
  }


  public void testForExample3() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("1보다 큰 정수 입력: ");
    int input = scanner.nextInt();
    int sum = 0;
    for (int i = 1; i <= input; i++) {
      sum += i;
    }
    System.out.println("합계: " + sum);
  }
  /* 사용자로부터 2개의 값 입력받아서 처리 */
  public void testForExample4() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("첫 번째 정수 입력: ");
    int input1 = scanner.nextInt();
    System.out.println("두 번째 정수 입력: ");
    int input2 = scanner.nextInt();

    //최대 최소 구하기 - 방법 1
    int min=0;
    int max=0;

    if(input1<input2){
      min=input1;
      max=input2;
    }
    else{
      min=input2;
      max=input1;
    }
    //최대 최소 구하기 - 방법 2(Java API -Math)
    min=Math.min(input1,input2);
    max=Math.max(input1,input2);
    int sum = 0;
    for (int i = min; i <= max; i++) {
      sum += i;
    }
    System.out.println("합계: " + sum);
  }
}
