package com.mycompany.section04.scanner;

import java.util.Scanner;

public class Application2 {
  public static void main(String[] args) {

    /* Scanner 사용 시 유의 사항
    * 1. 개행 문자를 남기는 메서드( next(), nextInt(), nextDouble() ...), // 한 개 토큰만 가져와서 \n이 남는 메서드들
    *                                                                 // 해당 메서드들은 처음이 \n이면 해당 개행 문자를 무시해서, 문제가 생기지 않음
    *                                                                 // ex) 연속으로 nextInt()를 사용하는 경우
    *                                                                 // 123 \n1234 \n12345 인 경우 다음 입력시 남아 있는 \n을 무시함
    * nextLine()이 오면 입력을 넘어가는 문제
    * */

    Scanner sc = new Scanner(System.in);
    System.out.print("정수 입력");
    int num = sc.nextInt();
    sc.nextLine(); // 입력 버퍼에 남은 \n(개행 문자) 미리 제거
    System.out.println("num = " + num);

    System.out.print("문자열(문장) 입력");
    String str = sc.nextLine();
    System.out.println("str = " + str);

    // 숫자를 123으로 입력하면 buffer 안에 123 \n 이 입력 되었음
    // nextInt는 1개의 토큰만 가져오므로, 123만 가져가고 \n이 남아 있음
    // nextLine은 엔터까지 읽어오므로, 남아있던 \n을 읽고 바로 종료함
    // 그러므로, 정상 코드를 수행하기 전 입력 버퍼에 남아있던 \n을 사용하고
    // 그 후 정상적으로 입력 수행

    /* 2. nextLine()을 제외한 next~~~() 메서드는
    * 공백문자(스페이스바)를 토큰을 구분하는 기준으로 삼기 때문에
    * 입력되는 값에 공백문자가 포함되면 오류가 발생될 수 있다.*/

    System.out.print("문자(단어) 입력: ");
    String word = sc.next();
    System.out.println("word = " + word);

    System.out.print("숫자 입력: ");
    int num2 = sc.nextInt();
    sc.nextLine();
    System.out.println("num2 = " + num2);

    // 첫 번째 입력에서 hello world 라고 입력하면
    // sc.next()에서 hello만 가져가고 buffer에 world가 남아있음
    // 그러므로 nextInt에 world가 입력되며 에러가 발생함
    // 문장 입력이 예상되면 nextLine()을 사용하는것을 권장

    /* 3. Scanner는 문자 1개(char) 입력을 지원하지 않는다. */
    System.out.print("문자 1개 입력");
//    char ch = sc.next(); // 에러 발생
    // char ch = sc.nextChar(); nextChar()는 존재하지 않음
    char ch = sc.nextLine().charAt(0);
    // char String.charAt(index) : 문자열에서 지정된 index 번째 문자 1개를 char형태로 반환
    System.out.println("ch = " + ch);

  }
}
