package com.my.section02.looping;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C_while {
  public void testSimpleWhileStatement(){

    //for문과 비슷한 형태
    for (int i = 0; i < 10; i ++){
      System.out.println("i = " + i);
    }
    int i = 0;
    while(i < 10){
      System.out.println("i = " + i);
      i++;
    }
  }

  /* 키보드로 문자열을 입력 받아 그대로 출력하기
  * 단 exit 가 입력되면 반복 종료
  * */
  public void testWhileExample1(){

    Scanner sc = new Scanner(System.in);

    String input = "";  // 입력 받은 문자열을 저장할 변수 선언 및 초기화

    // boolean String.equals(String other) : 문자열 값 비교
    while( !input.equals("exit")){
      System.out.print("문자열 입력: ");
      input = sc.nextLine();
      System.out.println("입력 받은 문자열: \"" + input + "\"");
      // \" -> " 모양 그대로 인식(String 리터럴 기호 x)
    }
    System.out.println("===== 프로그램 종료 ======");
  }

  //중첩 while문은 피하기

  public void testSimpleDoWhileStatement(){
    Scanner sc = new Scanner(System.in);

    String input = "exit";  // input값에 exit가 있어서 바로 종료됨

    while( !input.equals("exit")){
      System.out.print("문자열 입력: ");
      input = sc.nextLine();
      System.out.println("입력 받은 문자열: \"" + input + "\"");
    }
    System.out.println("===== 프로그램 종료 ======");
  }

  public void testSimpleDoWhileStatement1(){
    Scanner sc = new Scanner(System.in);

    String input = "exit";

    // do - while : 최소 1회 반복을 보장하는 반복문
    do{
      System.out.print("문자열 입력: ");
      input = sc.nextLine();
      System.out.println("입력 받은 문자열: \"" + input + "\"");
    } while( !input.equals("exit"));

    System.out.println("===== 프로그램 종료 ======");
  }

}
