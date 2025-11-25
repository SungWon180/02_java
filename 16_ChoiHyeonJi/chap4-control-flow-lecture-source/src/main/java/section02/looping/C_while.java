package section02.looping;

import java.util.Scanner;

public class C_while {

  /* while 단독 사용 */
  public static void main(String[] args) {
    int i = 0;
    //for 문과 비슷한 형태
    while (i < 10) {
      System.out.println("i = " + i);
      i++;
    }
  }
  // /* 키보드로 문자열을 입력 받아 그대로 출력하기
  // 단, "exit"가 입력되면 반복 종료 */
  public void testWhileExample1() {
    Scanner sc = new Scanner(System.in);
    String input = ""; // 입력 받을 문자열을 저장할 변수 선언 및 초기화


    // boolean String.equals(String other) : 문자열 값 비교

    while (!input.equals("exit")) { // input != "exit" <= 틀린거임 //exit가 아닐때 반복
      System.out.println("문자열 입력: ");
      input = sc.nextLine();
      System.out.println("입력 받은 문자열: \"" + input + "\"") ;
      // \" -> " 모양 그대로로 인식 (String 리터럴 기호 x)
    }
    System.out.println("===== 프로그램 종료 =====");
  }


  /*
  * do - while문을 이용해서 최소 1회 이상 반복을 확인하기
  * */
  public void testSimpleDoWhileStatement() {
    Scanner sc = new Scanner(System.in);
    String input = "exit"; // 입력 받을 문자열을 저장할 변수 선언 및 초기화


    { // input != "exit" <= 틀린거임 //exit가 아닐때 반복
      System.out.println("문자열 입력: ");
      input = sc.nextLine();
      System.out.println("입력 받은 문자열: \"" + input + "\"") ;
      // \" -> " 모양 그대로로 인식 (String 리터럴 기호 x)
    } while (!input.equals("exit"));
    System.out.println("===== 프로그램 종료 =====");
  }

}
