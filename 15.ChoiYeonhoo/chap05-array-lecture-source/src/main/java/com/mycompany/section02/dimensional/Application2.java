package com.mycompany.section02.dimensional;

public class Application2 {
  public static void main(String[] args) {

    /* 2차원 가변 배열
     * - 1차원 배열 할당을 각각 지정 해야 구현 가능
     * - 형렬의 형태를 띄는게 아니라, 각각 행마다 열의 길이가 다름
     * */

    int[][] arr = new int[3][];

    /* 각 1차원 배열 참조 변수(형)마다 길이가 다른 1차원 배열을 할당 */

    arr[0] = new int[4];
    arr[1] = new int[3];
    arr[2] = new int[5];

    int value = 1;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {

        arr[i][j] = value++; // 대입 후 1증가

        System.out.printf("iarr2[%d][%d] == %d  ", i, j, arr[i][j]);
      }
      System.out.println();
    }

  }
}
