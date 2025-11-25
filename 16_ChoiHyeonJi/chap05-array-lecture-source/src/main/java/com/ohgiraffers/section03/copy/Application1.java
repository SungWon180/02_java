package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application1 {
  public static void main(String[] args) {
    /* 얕은 복사 : 주소만 복사하여 같은 객체(배열)을 참조하는 것 */

    /* 원본 배열 */
    int[] origin = {1, 2, 3, 4, 5};

    /* 얕은 복사를 적용 */
    int[] copy = origin; // 주소만 복사
    /* hashCode() 확인 */ // 각 객체를 확인하는 프라이머리 키 같은 것 별도로 만들어진건 해시코드 똑같을 수 없음
    // 근데 같은 곳을 참조하기 때문에 객체 하나라 똑같음.
    System.out.println("origin : " + origin.hashCode());
    System.out.println("copy : " + copy.hashCode());

    origin[0] = 100; // 값을 100으로 바꿈 실제로 둘이 같은 곳을 보고 있음.

    /* 배열에 저장된 값 출력해서 확인 */
    System.out.println(Arrays.toString(origin)); // 배열을 하나의 문자열로 만들어라
    System.out.println(Arrays.toString(copy));


  }
}
