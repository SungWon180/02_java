package com.work.section02.domesional;

public class Application3 {
  public static void main(String[] args) {

    /*2차원 배열을 선언 + 할당 + 초기화를 동시 수행 할 수 있다.*/

    /* 정변 배열*/
    //고정되 있는 크기
    int[][] iaar1 = {{1, 2, 3, 4, 5},
        {6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15}
    };
//  가변 배열
    int[][] iaar2 = {{1, 2, 3},
        {4, 5},
        {6, 7, 8, 9}
    };
    /*미리 할당된 1차원 배열을 이용해 2차원 배열 만들기*/
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {6, 7, 8, 9, 10};
    int[][] iarr3 = {arr1, arr2};


  }
}
