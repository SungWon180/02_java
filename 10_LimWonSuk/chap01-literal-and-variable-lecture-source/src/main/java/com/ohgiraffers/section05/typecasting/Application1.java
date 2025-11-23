package com.ohgiraffers.section05.typecasting;

public class Application1 {
    public static void main(String[] args) {
        /* 자동 형변환
        * - 서로 다른 자료형의 연산 수횅 시 컴파일러가 자동으로
        * - '작은' 자료형을 "큰" 자료형으로 변환하는 것 */

        int inum1 = 10;
        long lnuim1 = inum1; // 대입연산자 /  10-> 10L로 변환되어 대입

        int inum2 = 20;
        long lnuim2 = 100L;
        long result2 = inum2 + inum2;
        // 20 + 100L -> 20L + 100L = 120L

        int inum3 = 100;
        float fnum3 = 1.5f;
        float result3 = inum3 + inum3;
        // 100 + 1.5f -> 100.0f + 1.5f = 101.5f

        System.out.println("result3 = " + result3);

        /* long(8byte) -> float(4byte) 확인*/
        long lnum4 = 200L;
        float fnum4 = lnum4; // 에러없음

        /* char -> int 변환 확인\
        * 빈칸마다 char값을 다넣음 */
        char ch5 = '가';
        int inum5 = ch5;
        System.out.println("inum5 = " + inum5);

        /* boolean 은 논리형으로써 숫자 타입의 형변환 규칙에서 제외된다!*/



    }
}
