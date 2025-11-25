package com.ohguraffers.section02.dimensinal;

public class Application1 {
    public static void main(String[] args) {
        /*다차원 배열 구조 이해
         *
         * 1. 2차원 배열 변수 선언
         * */

        int[][] iarr1;
        int iarr2[][];
        int[] iarr3[];

        /* 2. 2차원 배열 할당
         * == 2차원 배열 == 1차원 배열 참조 변수의 묶음
         *
         * */
        //  iarr1 = new int[][]; // z[]안에 크기지정 x -> 생성불가
        // iarr1 = new int[][4];  // 1차원 배열을 참조 변수 묶음의 크기 지정x
        // iarr1 = new int[0][4];  // 0 은 null 이랑 다름
        iarr1 = new int[3][];// 1차원 배열을 참조 변수 묶음의 크기 지정o


        /* 3. 1차원 배열 참조 변수 마다 1차원 배열 할당
         *
         * */
        iarr1[0] = new int[4];
        iarr1[1] = new int[4];
        iarr1[2] = new int[4];

        /* 4. 한번에 2차원 배열 할당*/
        iarr2 = new int[3][4];

        int value = 1;

        /* 5. for문을 이용해서 모든 배열 요소 순차적으로 접근*/
        for (int i = 0; i < iarr2.length; i++) // iarr2.length == 3
        {
            for (int j = 0; j < iarr2[i].length; j++) // iarr2[i].length == 4
            {
                iarr2[i][j] = value++;// ++붙이면 1씩후입연산

                System.out.printf("iarr2[%d][%d] == %d\n ", i, j, iarr2[i][j]);
            }


        }
        System.out.println("================ 프로그램 종료 ======================= ");

    }
}
