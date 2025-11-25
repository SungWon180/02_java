package com.mycompany.section03.copy;

import java.util.Arrays;

public class Application1 {
  public static void main(String[] args) {

    /* 얕은 복사 : 주소만 복사하여 같은 객체(배열)를 참조하는 것 */

    /* 원본 배열 */
    int[] origin = {1, 2, 3, 4, 5};

    /* 얕은 복사를 적용 */
    int[] copy = origin;

    /* hashCode() 확인 */
    System.out.println("origin.hashCode() = " + origin.hashCode());
    System.out.println("copy.hashCode() = " + copy.hashCode());

    /* 배열에 저장된 값 출력해서 확인*/
    System.out.println(Arrays.toString(origin));
    System.out.println(Arrays.toString(copy));

    origin[0] = 100;

    /* 배열에 저장된 값 출력해서 확인*/
    System.out.println(Arrays.toString(origin));
    System.out.println(Arrays.toString(copy));
  }
}
