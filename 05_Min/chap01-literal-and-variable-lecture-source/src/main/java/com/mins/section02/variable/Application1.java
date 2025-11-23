package com.mins.section02.variable;

public class Application1 {

  public static void main(String[] args) {
    /* 변수 선언
     * - 메모리에 값을 저장할 공간을 할당하고 이름을 붙임
     * [ 작성법 ]
     *  자료형 뱐수명;
     * */

    /* 기본 자료형(Primitive type)*/

    /* 정수형 */
    byte bnum;
    short snum;
    int inum;
    long lnum;

    /* 실수형 */
    float fnum;
    double dnum;

    /* 문자형 */
    char ch; // 2byte
    /* 논리형*/
    boolean isTrue; // 1byte
    boolean isFalse; // 1byte

    /* 문자열(String) - 참조 자료형 */
    String str; // 기본 자료형이 아님을 기억해라 !!!!!!!!!!!!!!!!

    /* 2. 변수 값 대입
     * - 선언(할당) 된 변수에 값을 집어 넣는 것
     * - 대입연산자 (=) 사용
     * - A =B -> B를 A 변수에 대입하겠다
     *
     * - 초기화 : 선언된 변수에 최초로 값을 대입하는 것
     * */

    bnum = 1;
    snum = 2;
    inum = 4;
    lnum = 8L;
    fnum = 4.0f;
    dnum = 8.0f;
    ch = 'a';
    isTrue = true;
    str = "Hello World!";


    /* 변수 사용*/
    // - 변수에 저장 된 값이 사용됨!
    System.out.println("bnum = " + bnum);
    System.out.println("snum = " + snum);
    System.out.println("inum = " + inum);
    System.out.println("lnum = " + lnum);
    System.out.println("fnu, = " + fnum);
    System.out.println("dnum = " + dnum);
    System.out.println("ch = " + ch);
    System.out.println("isTrue = " + isTrue);
    System.out.println("dnum = " + dnum);
  }
}
