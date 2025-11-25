package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {
    /*while 단독사용
     * */
    public void testSimpleWhileStatement() {
        // for문과 비슷한 형태

        /*for (int i = 0; i < 10; i++) {

        }  에서 while문으로 변경한 형태 */

        int i = 0;
        while (i < 10)
            System.out.println("i = " + i);
        i++;
        {

        }

    }

    public void testWhileExample() {
        Scanner sc = new Scanner(System.in);
        String input = ""; //입렫받을 문자열을 저장할 변구선언및초기화

        // boolean String.equals(String other) : 문자열 값 비교
        // !자주들어가는데 잘 안보임
        while (!input.equals("exit")) {
            System.out.print("문자열 입력");
            input = sc.nextLine();
            System.out.println("입력 받은 문자욜 \"" + input + "\"");
            // \" -> " 모양 그대로로 인식 (String 리터럴 기호 x)
        }
        System.out.println("==========프로그램 종료==========");
    }


    public void testWhileExample1(){
        Scanner sc = new Scanner(System.in);
        String input = ""; // 입력 받은 문자열을 저장할 변수 선언 및 초기화

        // boolean String.equals(String other) : 문자열 값 비교
        while( !input.equals("exit") ){
            System.out.print("문자열 입력: ");
            input = sc.nextLine();
            System.out.println("입력 받은 문자열: \"" + input + "\"");
            // " -> " 모양 그대로로 인식 (String 리터럴 기호 X)
        }
        System.out.println("===== 프로그램 종료 =====");
    }
    /* do while 문 사용 해서 최ㅏ서 1회 이상 반복 확인하는 반복문
     * */
    public void testSimpleDoWhileStatement() {
        Scanner sc = new Scanner(System.in);

        String input = "exit";

        do {
            System.out.print("문자열 입력");
            input = sc.nextLine();
            System.out.println("입력 받은 문자욜 \"" + input + "\"");

        } while (!input.equals("exit"));

        System.out.println("==========프로그램 종료==========");
    }

}

