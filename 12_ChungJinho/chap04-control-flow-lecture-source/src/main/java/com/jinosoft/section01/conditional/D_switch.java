package com.jinosoft.section01.conditional;

import java.util.Scanner;

public class D_switch {

  /* switch(식){
   *
   *    case 값1 :
   *     식의 결과가 값 1일때 동작할 코드
   *    break;
   *    case 값2 :
   *     식의 결과가 값 2일때 동작할 코드
   *    break;
   *    ......
   *    default:
   *     모든 case가 일치하지 않을 때 수행될 코드
   *  }
   * */

  // 식 : 정수 or 문자 or 문자열 결과가 반환되는 변수 또는 연산식
  // break; : switch 구문의 수행을 멈추는 키워드

  /* switch 사용법 */
  public void testSimpleSwitchStatement(){
    Scanner sc = new Scanner(System.in);

    System.out.print("첫 번째 정수: ");
    int first = sc.nextInt();

    System.out.print("두 번째 정수: ");
    int second = sc.nextInt();

    System.out.print("연산 기호 입력: ");
    char op = sc.next().charAt(0);

    int result = 0; // 연산 결과 저장용 변수

    switch (op){
      case '+' :  result = first + second;  break;
      case '-' :  result = first - second;  break;

      case 'X' :
      case 'x' :  System.out.println("x 선택됨"); // break가 없다면 다음 case로 이동
      case '*' :  result = first * second;  break;

      case '/' :  result = first / second;  break;
      case '%' :  result = first % second;  break;
      default  :
        System.out.println("잘못된 연산자 입니다.");
        return; // 메서드를 끝내고 돌아감 //  early return(메서드를 중간에 리턴 시킴)
    }

    System.out.printf("%d %c %d = %d\n", first, op, second, result);
    // %d == decimal (10진수)
    // %c == character(문자 char)
    // \n == 개행문자(엔터)


  }



  /* java 14 버전에 추가된 case 작성 방식 */
  public void improveSimpleSwitchStatement(){
    Scanner sc = new Scanner(System.in);

    System.out.print("첫 번째 정수: ");
    int first = sc.nextInt();

    System.out.print("두 번째 정수: ");
    int second = sc.nextInt();

    System.out.print("연산 기호 입력: ");
    char op = sc.next().charAt(0);

    int result = switch (op){
      case '+' ->  first + second;
      case '-' ->  first - second;

      // 여러 케이스를 한 번에 합쳐서 작성 가능
      case 'x', 'X', '*' -> first * second;
      case '/' ->  first / second;
      case '%' ->  first % second;
      default  ->  {
        System.out.println("잘못된 연산자 입니다.");
        yield 0;
      }
    };

    System.out.printf("%d %c %d = %d\n", first, op, second, result);
  }




}