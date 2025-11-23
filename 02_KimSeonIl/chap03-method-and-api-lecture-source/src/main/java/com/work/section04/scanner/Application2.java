package com.work.section04.scanner;

import java.util.Scanner;

public class Application2 {
  public static void main(String[] args) {
    /*Scanner 사용시 유의 사항
    * 1. 개행 문자를 남기는 메서드(next(), nextInt(), nextDouble()...)
    * nextLine()이 오면 입력을 넘어가는 문제
    * */

    Scanner sc = new Scanner(System.in);
    System.out.print("정수 입력 : ");
    int num = sc.nextInt();
    System.out.println("num = " + num);

    System.out.print("문자열 입력 :  ");
    sc.nextLine();// 입력 버퍼에 남은\n(개행 문자)을 미리빼서 제거
    String str = sc.nextLine();
    System.out.println("str = " + str);

    /*2. nextLine()을 제외한 next~~~() 메서드는
    * 공백문자(스페이스바)를 토큰을 구분하는 기준으로 삼기 때문에 입력되는 값에 공백 문자가 포함되면 오류가 발생 될 수 있다.!*/
    System.out.print("문자(단어) 입력:");
    String word = sc.next();
    System.out.println("word = " + word);

    System.out.println("숫자 입력: ");
    int num2 = sc.nextInt();
    sc.nextLine();  // 입력 버퍼에 남은 개행 문자 삭제
    System.out.println("num2 = " + num2);


//    /*3. Scanner는 문자 1개(char) 입력을 지원하지 않는다.//    */
    System.out.println("문자 1개 입력: ");
//    char ch = sc.nextLine();
    char ch = sc.nextLine().charAt(0);
    //char STring.charAt(index) : 문자열에서 지정된 index번째 문자 1개를 char  형태로 반환
    System.out.println("ch = " + ch);
  }
}
