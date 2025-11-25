package org.ho.section02.looping;

import java.util.Scanner;

public class Application1 {
  public static void main(String[] args) {
    A_for a_for = new A_for();
//    a_for.testSimpleForStatement();
//    a_for.testForExample1();
//    a_for.testForExample2();
//    a_for.testForExample3();
//    a_for.testForExample4();
    B_nestedFor b_nestedFor = new B_nestedFor();
//    b_nestedFor.printTable();
//    b_nestedFor.printDan();
//    b_nestedFor.printTriangleStar();
    C_while c_while = new C_while();
//    c_while.testSimpleWhileStatement();
//    c_while.testWhileExample1();
//    c_while.testSimpleDoWhileStatement();
    /* switch + do while */
    Scanner sc = new Scanner(System.in);
    int input = 0;
    do {
      System.out.println("====== while 예시 선택 메뉴 =======");
      System.out.println("1. testSimpleWhileStatement");
      System.out.println("2. testWhileExample1");
      System.out.println("3. testSimpleDoWhileStatement");
      System.out.println("0. 종료");
      System.out.print("메뉴 번호 입력(1,2,3,0) >> ");
      input = sc.nextInt();
      sc.nextLine();
      switch (input) {
        case 1:
          c_while.testSimpleWhileStatement();
          break;
        case 2:
          c_while.testWhileExample1();
          break;
        case 3:
          c_while.testSimpleDoWhileStatement();
          break;
        case 0:
          System.out.println("====== 프로그램 종료 ======");
          break;
        default:
          System.out.println("메뉴에 없는 번호를 입력함");
      }
    } while (input != 0);
  }
}
