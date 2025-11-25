package com.jinosoft.section01.array.level04.advanced;

import java.util.Arrays;

public class Application01 {

  public static void main(String[] args) {

    /* 로또번호 생성기
     * 6칸 짜리 정수 배열을 하나 생성하고
     * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
     * 오름차순 정렬하여 출력하세요.
     * Arrays.sort(배열) 메소드 활용하여 정렬 가능.
     * */

    int[] arr = new int[6];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 45) + 1;


      for (int j = 0; j < i; j++) {
        if (arr[i] == arr[j]) {
          i--;
          break;
        }
      }
    }

    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

  }

}