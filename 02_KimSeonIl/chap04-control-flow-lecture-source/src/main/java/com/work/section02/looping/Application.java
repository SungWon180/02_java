package com.work.section02.looping;

import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
    A_for a = new A_for();
//    a.testSimpleForStatement();
//
//    a.testForExample2();
//    a.testForExample6();


//    B_nestedFor b = new B_nestedFor();
//    b.printTable2();
//    b.print2dan();
//    b.printgugudan();
//    b.printTriangleStar();

    C_while c = new C_while();
//    c.testSimpleWhileStatement();
//    c.testWhileExample1();
//    c.testDoWhileStatement();

      /*switch + do ~ while*/
    Scanner sc = new Scanner(System.in);
    int input = 0;

    do {
      System.out.println("==== while 예시 선택 메뉴 ====");
      System.out.println("1. c.testSimpleWhileStatement ");
      System.out.println("2. c.testWhileExample1");
      System.out.println("3. c.testDoWhileStatement");
      System.out.println("0 . 종료");
      System.out.println("메뉴 번호 입력 >>");
      input = sc.nextInt();
      sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거

      switch (input){
        case 1  : c.testSimpleWhileStatement();break;
        case 2  : c.testWhileExample1();break;
        case 3  : c.testDoWhileStatement();break;
        case 0  :
          System.out.println("===== 프로그램 종료 =====");break;
        default :
          System.out.println("메뉴에 없는 번호를 입력함");
      }
    } while (input != 0);
  }

}