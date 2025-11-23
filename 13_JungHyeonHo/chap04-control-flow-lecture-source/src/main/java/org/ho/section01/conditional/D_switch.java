package org.ho.section01.conditional;

import java.io.IOException;
import java.util.Scanner;

public class D_switch {
  /**
   * switch(식){
   * case 값1:
   * 실행
   * case 값2:
   * 실행
   * break;
   * default:
   * 모든 case가 일치하지 않을 때 수행할 코드
   */
  // 식 : 정수 or 문자 or 문자열 결과가 반환되는 변수 또는 연산식

  /*switch 사용법*/
  public void testSimpleSwitchStatement() throws IllegalArgumentException {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫 번째 정수: ");
    int first = sc.nextInt();

    System.out.print("두 번째 정수: ");
    int second = sc.nextInt();

    System.out.print("연산 기호 입력: ");
    char op = sc.next().charAt(0);

    int result = 0; // 연산 결과 저장용 변수
    switch (op) {
      case '+':
        result = first + second;
        break;
      case '-':
        result = first - second;
        break;
      case '*':
        result = first * second;
        break;
      case '/':
        result = first / second;
        break;
      case '%':
        result = first % second;
        break;
      default:
        throw new IllegalArgumentException("Invalid operation");
//        return;//메서드를 끝내고 돌아감 // early return
    }
    System.out.printf("%d %c %d = %d\n", first, op, second, result);
    // %d == decimal
    // %c == char
    // \n == new line


  }

  public void improveSimpleSwitchStatement() throws IllegalArgumentException {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫 번째 정수: ");
    int first = sc.nextInt();

    System.out.print("두 번째 정수: ");
    int second = sc.nextInt();

    System.out.print("연산 기호 입력: ");
    char op = sc.next().charAt(0);

    // 향상된 switch 문
    int result = switch (op) {
      case '+' ->  first + second;
      case '-' ->  first - second;
      // 여러 케이스를 한 번에 합쳐서 작성 가능
      case 'x', 'X', '*' ->  first * second;
      case '/' ->  first / second;
      case '%' ->  first % second;
      default -> {
        System.out.println("잘못된 연산자 입니다.");
        yield 0;
      }
    };
    System.out.printf("%d %c %d = %d\n", first, op, second, result);
    // %d == decimal
    // %c == char
    // \n == new line


  }
}
