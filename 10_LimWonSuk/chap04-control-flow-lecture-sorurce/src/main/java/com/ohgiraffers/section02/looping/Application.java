package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {

        A_for a_for = new A_for();
       // a_for.testSimpleForStatement();
       // a_for.testSimpleForEaxmple1();
      //  a_for.testSimpleForEaxmple2();
       // a_for.testSimpleForEaxmple3();
        //a_for.testSimpleForEaxmple4();
       // a_for.testSimpleForEaxmple5();

      //  B_nestedFor b_nestedFor = new B_nestedFor();
        // b_nestedFor.printTable();
       // b_nestedFor.printTable2();
        // b_nestedFor.printTwoDan();
      //  b_nestedFor.printTraingleStar();

      //  C_while.testWhileExample.();

        C_while c_while = new C_while();
        // c_while.testSimpleWhileStatement();
     //   c_while.testSimpleWhileStatement1();

/*switch + do ~ while
* */
/*        Scanner sc = new Scanner(System.in);
        int input = 0

                do {
                    System.out.println("What is your name?");
                    System.out.println("testSimpleForStatement");
                    System.out.println("testSimpleWhileExam1");
                    System.out.println("testSimpleWhileStatement");
                    System.out.println("testSimpleWhileStatement");
                    System.out.println("0");
                    System.out.println("메뉴볺호입력");

                    switch ((input))
                    {
                    case 1 : break;
                    case 2 : break;
                    case 3 : break;
                    case 0 : break;
                        System.out.println("메뉴볺호입력"); break;
                        default:
                            System.out.println("메뉴에 없는 벊호를 입력");
                            }

                }*/



        /* switch + do ~ while */
        Scanner sc = new Scanner(System.in);
        int input = 0;

        do{
            System.out.println("===== while 예시 선택 메뉴 =====");
            System.out.println("1. testSimpleWhileStatement()");
            System.out.println("2. testWhileExample1()");
            System.out.println("3. testSimpleDoWhileStatement()");
            System.out.println("0. 종료");
            System.out.print("메뉴 번호 입력 >> ");
            input = sc.nextInt();
            sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거

            switch(input){
                case 1  : c_while.testSimpleWhileStatement(); break;
                case 2  : c_while.testWhileExample1(); break;
                case 3  : c_while.testSimpleDoWhileStatement(); break;
                case 0  :
                    System.out.println("===== 프로그램 종료 ====="); break;
                default :
                    System.out.println("메뉴에 없는 번호를 입력함");
            }

        }while(input != 0); // false  일경ㄹ우 종ㄽㅛ



    }
}
