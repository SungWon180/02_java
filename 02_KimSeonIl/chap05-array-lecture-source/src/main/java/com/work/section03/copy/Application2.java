package com.work.section03.copy;

import java.util.Arrays;

public class Application2 {
  public static void main(String[] args) {
    /*깊은 복사 : 기존 객체(배열)과 똑같은 객체를 만드는 것*/

    /*원본 배열*/
    int[] origin = {1, 2, 3, 4, 5};

    /*1. for문을 이용한 깊은 복사*/
    int[] copy1 = new int[origin.length];
    for (int i = 0; i < origin.length; i++) {
      copy1[i] = origin[i];
    }

    /*2. Object.clone() 메서드를 이용한 깊은 복사*/
    int[] copy2 = origin.clone();// 짧지만 이해 없이 사용은 권장X

    /*3. System.arraycopy() 메서드를 이용한 깊은 복사*/
    //이게 가장 많이 쓰인다고함. (코테)
    int[] copy3 = new int[origin.length];
    System.arraycopy(origin, 0, copy3, 0, origin.length);

    /*4. Arrays.copyOf() 메서드를 이용한 깊은 복사*/
    int[] copy4 = Arrays.copyOf(origin, origin.length);

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
  }
}