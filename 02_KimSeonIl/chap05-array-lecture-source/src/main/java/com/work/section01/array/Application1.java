package com.work.section01.array;

public class Application1 {
  public static void main(String[] args) {

    //배열 (참조형 변수) 선언
    int[] arr1; // int[] 주소를 저장할 참조형 변수 선언
    int arr2[]; //arr1, arr2 모두 int[] 참조형 변수 선언 방법

    //배열 할당
    arr1 = new int[5];// heap에 생성된 int [] 배열의 주소를 arr1에 대입
    // == arr1이 생성된 int[]을 참조함.
    //new : heap영역에 새로 할당 후 주소 반환
    //int[5] : int형 변수 5개를 생성 -> 5개의 묶음 == int[] 자료형
    //         각각 0부터 시작하는 index 번호가 부여

    /*배열 요소에 접근하여 값 대입 하기 */
    arr1[0] = 10; // 인덱스를 활용해서 요소별로 접근 가능
    arr1[1] = 20;
    arr1[2] = 30;
    arr1[3] = 40;
    arr1[4] = 50;

//    /*배열 요소에 접근하여 값 출력 하기 */
//    System.out.println("arr1[0] = " + arr1[0]);
//    System.out.println("arr1[1] = " + arr1[1]);
//    System.out.println("arr1[2] = " + arr1[2]);
//    System.out.println("arr1[3] = " + arr1[3]);
//    System.out.println("arr1[4] = " + arr1[4]);

    //arr1.length == arr1이 참조하는 배열의 길이를 반환(5)
    for (int i = 0; i < arr1.length; i++) {
      System.out.println("arr1[" + i + "] = " + arr1[i]);
    }

    System.out.println("====== 향상된 for문 =====");
    /*향상된 for문
      [작성법]
      for(배열 요소를 저장할 변수명 : 배열명){
        반복 수행할 코드;
      }

      작성된 배열의 첫 번째(0) 요소 부터
      마지막 요소(배열.length-1) 까지
      하나씩 순차적으로 변수에 저장하는 반복문
    * */
    for (int i : arr1) {
      System.out.println("i = " + i);

    }


    int sum1 = 0;
    for (int i = 0; i < arr1.length; i++) {
      sum1 += arr1[i];
    }
    System.out.println("sum1 = " + sum1);


    int sum2 = 0;
    for (int i : arr1) {
      sum2 += i;
    }
    System.out.println("sum2 = " + sum2);
  }

}