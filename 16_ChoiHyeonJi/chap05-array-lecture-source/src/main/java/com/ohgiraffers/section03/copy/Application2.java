package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 {
  public static void main(String[] args) {
    /* 깊은 복사 : 기존 객체(배열)과 똑같은 객체를 만드는 것 */

    /* 원본 배열 */
    int[] origin = {1, 2, 3, 4, 5};

    /* 1. for 문을 이용한 깊은 복사 */
    int[] copy1 = new int[origin.length];

    for (int i = 0; i < origin.length; i++) {  // 1,2,3,4,5 복제본 만들기
      copy1[i] = origin[i];
    }

    /* 2. Object.clone() 메서드 이용한 깊은 복사 */
    int[] copy2 = origin.clone(); /* 짧지만 이해 없이 사용 비권장 위험 !! */

    /* 3. System.arrarycopy() 메서드를 이용한 깊은 복사 */
    int[] copy3 = new int[origin.length];
    System.arraycopy(origin, 0, copy3, 0, origin.length);

    /* 4. Arrays.copyOf() 메서드를 이용한 깊은 복사 */
    int[] copy4 = Arrays.copyOf(origin, origin.length);

    /* 깊은 복사 확인 */
    origin[0] = 100;
    copy1[0] = 200;
    copy2[0] = 300;
    copy3[0] = 400;
    copy4[0] = 500;

    System.out.println("origin = " + Arrays.toString(origin));
    System.out.println("copy1 = " + Arrays.toString(copy1));
    System.out.println("copy2 = " + Arrays.toString(copy2));
    System.out.println("copy3 = " + Arrays.toString(copy3));
    System.out.println("copy4 = " + Arrays.toString(copy4));

    // 0번 인덱스 다 다른 곳을 참조하고 있음 (확인)

  }
}
