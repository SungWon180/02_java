package com.mycompany.section04.scanner;

import java.util.Scanner;

public class Application1 {
  public static void main(String[] args) {
    /* java.util.Scanner
    * - 자바에서 제공하는 간단한 텍스트 입력 클래스
    * */

    /* 1. Scanner 객체 생성
    * JVM 내에 키보드 입력을 인식하는 장치를 sc라는 이름으로 생성
    * */
    Scanner sc = new Scanner(System.in);

    /* 2. 자료형 별 값 입력 받기*/

    /* 2-1. 문자열(단어) 입력 받기*/
    System.out.print("이름 입력: ");
    String name = sc.next(); // 다음 입력된 첫번째 토큰을 읽어와 문자열로 반환
    sc.nextLine(); // 입력 문제 해결(나중에 설명)
    System.out.println("name = " + name);

    /* 2-2. 문장 입력 받기 */
    System.out.print("주소 입력: ");
    String address = sc.nextLine(); // 엔터가 입력되기 전까지의 모든 토큰을 읽어옴
    System.out.println("address = " + address);

    /* 2-3. 정수 입력*/
    /* 정수가 아닌 다른 자료형 입력 시 또는
    * int 범위를 초과하는 정수 입력 시
    * java.util.InputMismatchException이 발생한다.
    * */

    System.out.print("나이 입력: ");
    int age = sc.nextInt(); // 다음 입력된 첫번째 토큰을 읽어와 int로 변환하여 반환
    System.out.println("age = " + age);

    /* 2-4. 실수 입력 받기 */
    /* 문자열 또는 double 범위 초과시
    * java.util.InputMismatchException이 발생한다.
    * */
    System.out.print("키 입력: ");
    double height = sc.nextDouble();
    System.out.println("height = " + height);

    /* 2-5. 논리 값 입력 받기 */
    System.out.print("true/false 중 하나 입력: ");
    boolean isTrue = sc.nextBoolean();
    System.out.println("isTrue = " + isTrue);

  }
}
