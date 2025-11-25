package com.mycompany.section02.looping;

import java.util.Scanner;

public class C_while {

 /* while 단독 사용
 * */

  public void testSimpleWhileStatement() {

    // for문과 비슷한 형태
    int i = 0;
    while ( i < 10){
      System.out.println("i = " + i);
      i++;
    }

  }

  /*
  * 키보드로 문자열을 입력 받아 그대로 출력하기
  * 단, "exit" 가 입력 되면 반복을 종료
  * */
  public void testWhileExample1(){

    Scanner sc = new Scanner(System.in);

    String input = ""; // 입력 받을 문자열을 저장할 변수 선언 및 초기화

    while (!input.equals("exit")){
      System.out.println("===== 문자열 입력 ======");
      input = sc.nextLine();
      System.out.println("입력 받은 문자열 : = \""  + input + "\"");
      // \" -> " 모양 그대로로 인식 (String 리터럴 기호 X)
    }

    System.out.println("===== 프로그램 종료 =====");
  }

  /*
  * do - while 문을 이용해서 최소 1회 이상 반복을 확인하기
  * */

  public void testSimpleDoWhileStatement(){

    Scanner sc = new Scanner(System.in);

    String input = "exit";
    
    // do - while : 최소 1회 반복을 보장하는 반복문
    do {
      System.out.println("===== 문자열 입력 ======");
      input = sc.nextLine();
      System.out.println("입력 받은 문자열 : = \""  + input + "\"");
    }
    while (!input.equals("exit"));

    System.out.println("===== 프로그램 종료 =====");
  }

}
