package com.ohgiraffers.section02.dimensional;

public class Application3 {
  public static void main(String[] args) {
    /* 2차원 배열을 선언 + 할당 + 초기화 동시에 수행 할 수 있다. */
    /* 정변 배열 (고정 크기) */
    int[][] iarr1 = {
        {1, 2, 3, 4, 5},
        {6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15}
    };

    /* 정변 배열 */
    int[][] iarr2 = {
        {1, 2, 3},
        {4, 5},
        {6, 7, 8, 9}
    };

    /* 미리 할당된 1차원 배열을 이용해 2차원 배열 만들기 */
    int[] arr1 = {1, 2, 3, 4, 5}; // arr1 1,2,3,4,5의 주소 들어감
    int[] arr2 = {6, 7, 8, 9, 10};
    int[][] iarr3 = {arr1, arr2};


  }
}
