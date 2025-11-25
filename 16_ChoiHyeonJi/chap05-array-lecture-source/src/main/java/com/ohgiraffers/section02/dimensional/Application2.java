package com.ohgiraffers.section02.dimensional;

public class Application2 {
  public static void main(String[] args) {
    /* 2차원 가변 배열
     * - 1차원 배열 할당을 각각 지정해야 구현 가능 */

    int[][] arr = new int[3][]; //행만 나누고 열은 안 나눔

    /* 각 1차원 배열 참조 변수(행) 마다 길이가 다른 1차원 배열 할당 */

    arr[0] = new int[4];
    arr[1] = new int[3];
    arr[2] = new int[5];

    int value = 1;


    /* 2중 for문을 이용해서 모든 배열 요소 순차적으로 접근 */
    for (int i = 0; i < arr.length; i++) { //iarr2.length==3  //i는 인덱스의 i
      for (int j = 0; j < arr[i].length; j++) { //iarr2[i].length==4,3,5
        arr[i][j] = value++; //value 모든 요소에 1을 집어넣겠당 value++ 대입후 1증가


        System.out.printf("iarr2[%d][%d] == %d ", i, j, arr[i][j]);  //shift+f6 오류명 한번에 변경
      }
      System.out.println(); //줄바꿈
    }


  }
}
