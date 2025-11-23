package com.kang.section04.scanner;

import java.util.Scanner;

public class Application2 {

  public static void main(String[] args) {

    /* Scanner 사용 시 유의 사항 */
    // 1. 개행 문자를 남기는 메서드 (next(), nextInt(), nextDouble()...) 뒤에
    //    nextLine()이 오면 입력을 넘어가는 문제

    Scanner sc = new Scanner(System.in);
    System.out.println("정수 입력: ");
    int num = sc.nextInt();
    System.out.println("num = " + num);

    System.out.println("문자열(문장) 입력 : ");
    String str = sc.nextLine(); // 입력 버퍼에 남은 \n (개행 문자)를 미리 빼서 제거
    System.out.println("str = " + str);

    /* 2. nextLine()을 제외한 next~~~() 메서드는 */
    // 공백문자 (스페이스바)를 토큰을 구분하는 기준으로 삼기 때문에
    // 입력되는 값에 공백문자가 포함되면 버퍼에 값이 남아있기 때문에 오류가 발생할 수 있다.
    System.out.print("문자(단어) 입력: ");
    String word = sc.next(); // 문장 입력이 예상되면 nextLine()을 사용 권장
    System.out.println("word = " + word);

    System.out.println("숫자 입력 : ");
    int num2 = sc.nextInt();
    sc.nextLine();
    System.out.println("num2 = " + num2);

    /* 3. Scanner는 문자 1개(char) 입력을 지원하지 않는다. */
    System.out.println("문자 1개 입력: ");
    // char ch = sc.nextChar // nextChar는 존재하지 않는다.

    char ch = sc.nextLine().charAt(0);
    // char String.charAt(index) :
    // 문자열에서 지정된 index번째 문자 1개를 char 형태로 변환
    System.out.println("ch = " + ch);

  }
}
