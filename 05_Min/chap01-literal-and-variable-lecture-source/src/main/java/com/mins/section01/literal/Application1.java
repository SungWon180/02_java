package com.mins.section01.literal;



public class Application1 {
  // main method : 자바를 실행시키는 도구
  public static void main(String[] args) {
    // 리터럴 출력
    System.out.println(123);
    System.out.println(1.23);
    // b. 문자 형태의 값 출력
    System.out.println('a');
    System.out.println('1');

    // sout == System.out.println()의 snippet(단편 , 약어)
    System.out.println('1'); // '1' == 문자 1, 1== 정수 1
                              // '1' == 문자열
    //System.out.println('ab'); // ''내에는 한 글자만 작성 가능
    //System.out.println(''); // ''내에서 한 글자가 무조건 필요!

    // c. 문자열 형태 값 출력
    System.out.println("안녕하세요"); // 문자열은 "" (쌍따옴표)로 감싸져 있어야 한다
    System.out.println("123"); // 문자열
    System.out.println("a"); // 문자열
                              // 한 글자만 들어가도 문자열("")
                            // 'a' == "a" --> false
    System.out.println(""); //  빈 문자열 : 내용은 없지만 "" 감싸짐 == (문자열)

    // d. 논리형 값 출력
    System.out.println(true);
    System.out.println(false);
  }
}
