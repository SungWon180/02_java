package com.my.section02.dimensional;

public class Application1 {
  public static void main(String[] args) {
    /* 다차원 배열 구조 이해 */
    /* 1. 2차원 배열 변수 선언 */
    int[][] iarr1;
    int iarr2[][];
    int[] iarr3[];

    /* 2. 2차원 배열 할당
     * -2차원 배열 == 1차원 배열 참조 변수 묶음
     * */
    //iarr1 = new int[][]; // 크기 지정 X -> 생성불가
    //iarr1 = new int[][4]; // 1차원 배열 참조변수 묶음의 크기 지정 X -> 생성 불가
    iarr1 = new int[3][]; // 1차원 배열 참조 변수 묶음의 크기 지정 O

    /* 3. 1차원 배열 참조 변수마다 1차원 배열 할당 */
    iarr1[0] = new int[4];
    iarr1[1] = new int[4];
    iarr1[2] = new int[4];

    /* 4. 한 번에 2차원 배열 할당 */
    iarr2 = new int[3][4];

    int value = 1;

    /* 5. for문을 이용해서 모든 배열요소 순차적으로 접근 */
    for (int i = 0; i < iarr2.length; i++) { //iarr2.length == 3
      for (int j = 0; j < iarr2[i].length; j++) {  //iarr2.length == 4
        iarr2[i][j] = value++; //대입 후 1증가 (후입연산)
        System.out.printf("iarr2[%d][%d] == %d\n", i, j, iarr2[i][j]);
      }
    }
    System.out.println("===== 프로그램 종료 =====");
    /* 2차원 가변 배열
     * 1차원 배열 할당을 각각 지정해야 구현 가능 */

    int[][] arr = new int[3][];
    /* 각 1차원 배열 참조 변수(행) 마다 길이가 다른 1차원 배열 할당 */
    arr[0] = new int[4];
    arr[1] = new int[3];
    arr[2] = new int[5];

    int value1 = 1;

    for (int i = 0; i < arr.length; i++) { //arr.length == 5
      for (int j = 0; j < arr[i].length; j++) {  //arr.length == 4
        arr[i][j] = value1++; //대입 후 1증가 (후입연산)
        System.out.printf("arr[%d][%d] == %d  ", i, j, arr[i][j]);
      }
      System.out.println(); // 줄바꿈
    }
  }
}


