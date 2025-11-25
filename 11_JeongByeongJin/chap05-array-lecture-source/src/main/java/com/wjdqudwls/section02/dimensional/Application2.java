package com.wjdqudwls.section02.dimensional;

public class Application2 {
  public static void main(String[] args) {

    /* 2차원 가변 배열
    * - 1차원 배열 할당을 각각 지정해야 구현 가능
    * */
    int [][] arr = new int[3][];

    /* 각 1차원 배열 참조 변수(행) 마다 길이가 다른 1차원 배열 할당 */
    arr[0] = new int[4];
    arr[1] = new int[3];
    arr[2] = new int[5];

    int value = 1;

    /* 5. 2중 for문을 이용해서 모든 배열 요소 순차적으로 접근 */
    for(int i = 0; i < arr.length ; i++){ // arr.length == 3
      for (int j = 0 ; j < arr[i].length; j++){ // arr[i].length == 4, 3, 5
        arr[i][j] = value++;

        System.out.printf("arr[%d][%d] == %d  ", i, j, arr[i][j]);
      }
      System.out.println(); // 줄바꿈
    }
  }
}
