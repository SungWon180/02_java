package com.ohgiraffers.section01.array;

public class Application1 {
  public static void main(String[] args) {
     /* 배열(참조형 변수) 선언 */
    int[] arr1; // int[] 주소를 저장할 참조형 변수 선언
    int arr2[]; // arr1, arr2 모두 int[] 참조형 변수 선언 방법

    /* 배열 할당 */
     arr1 = new int[5];
     // heap에 생성된 int[] 의 주소를 arr1에 대입
     // == arr1이 생성된 int[]을 참조함
     // new : heap 영역에 새로 할당 후 주소를 반환  // 대입 연산도 연산이다
    // int[5] : int형 변수 5개를 생성 -> 5개 묶음 == int[] 자료형
    //          각각 0부터 시작하는 index 번호가 부여

    /* 배열 요소에 접근하여 값 대입하기 */
    arr1[0] = 10; // 인덱스를 활용해서 요소별로 접근 가능 0번 인덱스에 10 넣
    arr1[1] = 20;
    arr1[2] = 30;
    arr1[3] = 40;
    arr1[4] = 50;

    /* 배열 요소에 접근하여 값 출력하기(배열 + for문) */
    // arr1.length == arr1이 참조하는 배열의 길이를 반환 (5반환)
    for (int i = 0; i < arr1.length ; i++) {
      System.out.println("arr1["+i+"] = " + arr1[i]);
    }
    System.out.println("===== 향상된 for문 =====");
    /* 향상된 for문
    * [작성법]
    *  for( 배열 요소를 저장할 변수 선언 : 배열명 ) {
    *
    *     반복 수행할 코드;
    * }
    *
    * - 작성된 배열의 첫 번쨰(0) 요소 부터 마지막 요소(배열.length-1) 까지
    *   하나씩 순차적으로  : 왼쪽 변수에 저장하는 반복문
    * */

    for ( int num : arr1) {
      System.out.println("num = " + num);
    }


    /* 향상된 for문 + 배열 + 살짝 응용 */
    // arr1에 저장된 모든 배열 요소의 합 구하기
    int sum1 = 0;
    for ( int i = 0; i < arr1.length ; i++) {
      sum1 += arr1[i]; // 10 + 20 + 30 + 40 + 50 sum1: 0 i : 0 arr1: [10,20,30,40,50]
    }
    System.out.println("sum1 = " + sum1);

    int sum2 = 0;
    for ( int num : arr1) {
      sum2 += num; //break 포인트(멈추고 싶은 곳)에 두고 디버그 실행 f9 다음거 실행
    }
    System.out.println("sum2 = " + sum2);
  }
}
