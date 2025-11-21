package com.mins.section01.literal;

public class Application2 {

  public static void main(String[] args) {

    /* 값을 연산하여 결과를 출력할 수 있다.
     * 이 때, 값의 결과는 연산에 사용된 값에 형태에 따라
     *  또는 연산자의 종류에 따라 달라진다.
     * */

    /* 1. 숫자와 숫자 연상*/
    System.out.println("===== 정수와 정수 =====");
    System.out.println(123 + 456); // 579 (정수)
    System.out.println(123 - 23); // 100 (정수)
    System.out.println(123 * 10); // 1230 (정수)
    System.out.println(123 / 10); //12 (정수)
    System.out.println(123 % 10); // 3 %(modulo,mod) 나머지 연산


    /*컴퓨터의 값 처리 원칙
     * - 같은 타입(형식)끼리만 연산 가능
     * - 같은 타입 연산의 결과는 꼭 같은 타입이 된다*/

    /* 2. 실수와 실수 연산*/
    System.out.println("===== 실수와 실수 =====");

    System.out.println(1.23 + 1.23);
    System.out.println(1.23 + 0.5);
    System.out.println(1.23 * 0.5);
    System.out.println(1.23 / 0.5);
    System.out.println(1.23 % 1.0); // 예상 : 0.23 , 실제 : 0.22999999999999998

    /* java에서 실수 (float,double)는 실제 딱 떨어지는 값이 아닌 근사치*/

    /* 3. 정수와 실수*/
    System.out.println("===== 정수와 실수 =====");
    System.out.println(123 + 0.5);

    /* 3. 자동 형변환에 의해 정수 -> 실수로 변환 됨*/
    System.out.println(123 + 0.5);
    System.out.println(123 - 0.5);
    System.out.println(123 * 0.5);
    System.out.println(123 / 0.5);
    System.out.println(123 % 0.5); // 0.0 (실수)

    /* 4. 문자와 문자 연산*/
    System.out.println("===== 문자와 문자 =====");
    System.out.println('a' + 0); // 97(정수) == '' 문자는 정수로 저장됨을 확인!
    System.out.println('a' + 'b');
    System.out.println('a' - 'b');
    System.out.println('a' * 'b');
    System.out.println('a' / 'b');
    System.out.println('a' % 'b');

    /* 5. 문자와 정수*/
    System.out.println("===== 문자와 정수 =====");
    System.out.println('A' + 0);
    System.out.println('A' + 1);
    System.out.println('A' - 1);
    System.out.println('A' * 2);
    System.out.println('A' / 2);
    System.out.println('A' % 2);

    /* 6. 문자와 실수 */
    System.out.println("===== 문자와 실수 =====");
    System.out.println('a' + 1.0);
    System.out.println('a' - 1.0);
    System.out.println('a' * 1.2);
    System.out.println('a' / 0.5);
    System.out.println('a' % 0.5);

    /* 7. 문자열과 문자열 연산
     *  문자열A + 문자열B = 문자열A문자열B
     *  - 나머지 산술 연산자(-,*,/,% 연산 자체가 안됨! (오류)
     */
    System.out.println("Hello" + " World");
//    System.out.println("Hello" - " World");
//    System.out.println("Hello" * " World");
//    System.out.println("Hello" / " World");
//    System.out.println("Hello" % " World");

    /* 8. 문자열과 다른 리터럴 연산
     *  '+' 연산에 문자열이 포함되면 최종 결과는 무조건 문자열*/
    System.out.println("===== 문자열과 다른 리터럴 =====");
    System.out.println("helloworld" + 123);
    System.out.println("helloworld" + 123.456);
    System.out.println("helloworld" + 'a');
    System.out.println("helloworld" + true);
    System.out.println("123" + "456");

    /* 9. 논리 값의 연산
     *  - true(참)/false(거짓)
     *  - 기본적인 산술 연산은 사용 불가
     *  - 대신 비교연산(==, !=), 논리연산을 사용
     *  */
//    System.out.println(true + true);
    System.out.println(true == true); // 결과: true

  }
}
