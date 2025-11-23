package com.mycompany.section01.conditional;

import java.util.Scanner;

public class D_switch {

  /* switch(식){
    case 값1 :
      식의 결과가 값 1일 때 동작할 코드;
    break;

    case 값2 :
      식의 결과가 값 2일 때, 동작할 코드;
    break;

    .......

    default :
     모든 case가 일치하지 않을 때 수행될 코드
     break; // default 구문은 가장 아래 있어서 break가 없어도 됨

  }
  * */

  // 식 : 정수 or 문자 or 문자열 결과가 반환되는 변수 또는 연산식
  // break; : switch 구문의 수행을 멈추는 키워드

  /* switch 사용법 */
  public void testSimpleSwitchStatement() {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫 번째 정수: ");
    int first = sc.nextInt();
    sc.nextLine();

    System.out.print("두 번째 정수: ");
    int second = sc.nextInt();
    sc.nextLine();

    System.out.print("연산 기호: ");
    char op = sc.next().charAt(0);
    sc.nextLine();

    int result = 0; // 연산 결과 저장용 변수

    switch (op) {
      case '+':
        result = first + second;
        break;
      case '-':
        result = first - second;
        break;
      case 'x':
        System.out.println("x 선택됨"); // break가 없어서, 다음 case 내부로 이동이 됨
      case '*':
        result = first * second;
        break;
      case '%':
        result = first % second;
        break;
      default:
        System.out.print("잘못된 연산자 입니다");
        return; // 메서드를 끝내고 돌아감 // early return(메서드를 중간에 리턴 시킴)
    }

    System.out.printf("%d %c %d = %d\n", first, op, second, result);
    // %d == decimal (10진수)
    // %c == character (문자 char)
    // \n == 개행문자 (엔터)
  }

  /* Java 14 버전에 추가된 case 작성 방식 */
  public void improveSimpleSwitchStatement() {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫 번째 정수: ");
    int first = sc.nextInt();
    sc.nextLine();

    System.out.print("두 번째 정수: ");
    int second = sc.nextInt();
    sc.nextLine();

    System.out.print("연산 기호: ");
    char op = sc.next().charAt(0);
    sc.nextLine();

    int result = switch (op) { // 람다식 표현 방법
      case '+' -> first + second;
      case '-' -> first - second;
      case 'x', 'X', '*' -> first * second;
      case '%' -> first % second;
      default -> {
        System.out.print("잘못된 연산자 입니다");
        yield 0;
      }
    };
    System.out.printf("%d %c %d = %d\n",first,op,second,result);
    // %d == decimal (10진수)
    // %c == character (문자 char)
    // \n == 개행문자 (엔터)
  }
}

