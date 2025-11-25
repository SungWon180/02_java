package com.wjdqudwls.section01.array;

public class Application2 {
  public static void main(String[] args) {

    /* 배열 선언 및 할당 */
    int[] arr = new int[4];

    /* JVM 메모리 영역 중 heap은 비어있는 상태로 존재할 수 없다 !!
     * -> 할당 시 각 자료형의 기본 값으로 초기화 되어있음.
     *
     * 자료형 별 기본값
     * - 정수 / 실수 -> 0, 0L, 0.0f, 0.0
     * - char -> '\u0000' (유니코드 0번)
     * - boolean -> false
     * - 참조형(ex.String) -> null
     * */

    for (int num : arr) {
      System.out.println("num = " + num);
    }
    /* 참조형 변수에 저장된 주소 확인 하기
    *
    * [참조형 변수(Reference Variable)]
    * - new 연산자에 의해서 할당된 공간의 주소를 저장하기 위한 변수
    *
    * - 참조형 변수는 주소를 저장하고 있다는 것을 꼭 기억하자!
    * */

    int[] iarr = new int[5];
    double[] darr = new double[10];

    // 출력 결과 : [자료형@해시코
    System.out.println("iarr = " + iarr); // [I@58644d46
    System.out.println("darr = " + darr); // [D@18b4aac2

    /* hashCode() : 객체(배열)의 주소 값을 10진수로 변환하여 반환하는 고유한 정수값
    * 생성한 객체(배열)의 고유한 정수값을 반환하는 메서드
    * */
    System.out.println("iarr.hashCode() : " + iarr.hashCode());
    System.out.println("darr.hashCode() : " + darr.hashCode());

    /* 배열명.length : 배열의 길이 (칸 수) 를 반환 */
    System.out.println("iarr.length = " + iarr.length);
    System.out.println("darr.length = " + darr.length);

    /* 한 번 생성된 배열은 길이를 변경할 수 없다.
    * -> 새로운 배열을 생성하여 기존 참조형 변수에 새 배열의 주소를 대입
    *   -> 새 배열 참조
    * */
    iarr = new int[100];
    System.out.println("수정된 iarr.hashCode() : " + iarr.hashCode());
    System.out.println("수정된 iarr.length = " + iarr.length);

    /* DB의 NULL : 빈 칸(저장된 데이터가 없다)
       Java의 null : 저장된 주소가 없다 (참조하는 객체가 없다)
    */
    iarr = null; // iarr에 아무 배열도 참조하지 않는다는 null 대입
    /* java.lang.NullPointerException :
    * - 아무것도 참조하지 않는 변수(null)를 이용할 때 발생하는 예외(에러)
    * */
    System.out.println("수정된 iarr.hashCode() : " + iarr.hashCode());
    System.out.println("수정된 iarr.length = " + iarr.length);
  }
}
