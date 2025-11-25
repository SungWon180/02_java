package com.ohgiraffers.section02.dimentional;

public class Application3 {
    public static void main(String[] args) {
        /*
        2차원 배열을 선언 + 할당 + 초기화 동시 수행 가능
         */
        int[][] arr1 = {
                {1,2,3,4,5},
                {2,3,4,5,6},
                {3,4,5,6,7}
        };

        int[][] arr2 = {
                {1,2,3,4},
                {2,3,4,5,6},
                {3,4,5,6,7,8,9}
        };

        /*
        미리 할당된 1차원 배열을 이용해 2차원 배열 만들기
         */
        int[] arr3 = {1,2,3,4,5};
        int[] arr4 = {2,3,4,5,6};
        int[] arr5 = {3,4,5,6,7};
        int[][] arr6 = {arr3, arr4, arr5};



    }
}
