package section01;

import java.util.Scanner;

public class A_if {

  /* if문
  *
  * [작성법]
  * if(조건식){
  *   조건식이 true일 경우 수행할 코드;
  * }
  * */

  /**
   * if문 단독 사용 흐름 확인
   */
  public void testSimpleIfStatement(){

    Scanner sc = new Scanner(System.in);

    System.out.print("정수 하나 입력: ");
    int input = sc.nextInt();

    if(input % 2 == 0){ // 2의 배수 == 짝수이면 if문 수행
      System.out.println("입력하신 정수는 짝수입니다.");
    }

    System.out.println("프로그램을 종료합니다.");
  }



  /* 중첩 if문 */
  public void testNestedIfStatement(){

    Scanner sc = new Scanner(System.in);

    System.out.print("정수 하나 입력: ");
    int input = sc.nextInt();

    if(input > 0) { // 양의 정수인지 확인
      if (input % 2 == 0) { // 2의 배수 == 짝수이면 if문 수행
        System.out.println("입력하신 정수는 짝수입니다.");
      }
    }

    System.out.println("프로그램을 종료합니다.");
  }

}

