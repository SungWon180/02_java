package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application1 {

    public static void main(String[] args) {
        /*
        얕은 복사 : 주소만 복사하여 같은 배열을 참조하는 것
         */
        int[] origin = {1,2,3,4,5};
        // 얕은 복사를 적용
        int[] copy = origin;

        System.out.println("origin = " + origin.hashCode());
        System.out.println("copy = " + copy.hashCode());

        origin[0] = 10;

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));


    }

}
