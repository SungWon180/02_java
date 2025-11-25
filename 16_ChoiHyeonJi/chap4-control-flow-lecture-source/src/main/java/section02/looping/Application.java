package section02.looping;

import java.util.Scanner;

public class Application {
  public static void main(String[] args) {

    A_for a_for = new A_for();
//    a_for.testSimpleForStatement();
    //a_for.testForExample1();
//    a_for.testForExample2();
//    a_for.testForExample3();
    //a_for.testForExample4();


    B_nestedFor b_nestedFor = new B_nestedFor();
//    b_nestedFor.printTable();
//    b_nestedFor.printTable2();
//    b_nestedFor.printGuguDan();
      b_nestedFor.printTriangleStar();
  }

  C_while c_while = new C_while();
  //c_while.testSimpleWhileStatement();
  //c_while.testWhileExample1();
  //c_while.testSimpleDoWHileStatement();

  /* switch + do ~ while */
  Scanner sc = new Scanner(System.in);

  int input = 0;

  do {
    System.out.println("===== while 예시 선택 메뉴 =====");
    System.out.println(" 1.testSimpleWhileStatement()");
    System.out.println(" 2.c_while.testWhileExample1() ");
    System.out.println(" 3.c_while.testSimpleDoWhileStatement() ");
    System.out.println("0. 종료");
    System.out.println("메뉴 번호 입력 >> ");
    input = sc.nextInt();
    sc.nextInt();
  } while(input != 0)

    switch(input) {
    case 1:  break;
    case 2: break;
    case 3 :
    case 0:

      default
  }
}
