package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        /*
        깊은 복사 : 기존 객체(배열)과 똑같은 객체를 만드는 것
         */
        int[] origin = {1,2,3,4,5};

        // 1. for문을 이용한 깊은 복사
        int[] copy1 = new int[origin.length];
        for (int i = 0; i < copy1.length; i++) {
            copy1[i] = origin[i];
        }

        // 2. object.clone() 메서드를 이용
        int[] copy2 = origin.clone();

        // 3. System.arraycopy() 메서드를 이용한 깊은 복사
        int[] copy3 = new int[origin.length];
        System.arraycopy(origin, 0, copy3, 0, origin.length);

        // 4. Arrays.copyOf() 메서드를 이용한 깊은 복사
        int[] copy4 = Arrays.copyOf(origin, origin.length);

        origin[0] = 10;
        copy1[0] = 100;
        copy2[0] = 1000;
        copy3[0] = 10000;
        copy4[0] = 100000;

        System.out.println("origin = " + Arrays.toString(origin));
        System.out.println("copy1 = " + Arrays.toString(copy1));
        System.out.println("copy2 = " + Arrays.toString(copy2));
        System.out.println("copy3 = " + Arrays.toString(copy3));
        System.out.println("copy4 = " + Arrays.toString(copy4));
    }
}
