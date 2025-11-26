     /* 로또번호 생성기
      * 6칸 짜리 정수 배열을 하나 생성하고
      * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
      * 오름차순 정렬하여 출력하세요.
      * Arrays.sort(배열) 메소드 활용하여 정렬 가능.
      * */

     package com.ohgiraffers.section01.array.level04.advanced;

     import java.util.Arrays;
     import java.util.Random;

     public class Application1 {

         public static void main(String[] args) {
             int[] lotto = new int[6];

             Random rand = new Random();

             for (int i = 0; i < lotto.length; i++) {
                 lotto[i] = rand.nextInt(45) + 1; // 0~44 + 1

                 for (int j = 0; j < i; j++) {
                     if (lotto[j] == lotto[i]) // 이미 저장된 난수 == 새로 저장된 난수
                     {
                         ㅑ--;
                         break;
                     }

                 }


             }
             // 뒤에 s 붙는애들은 java에서 만든 ~관련 utill class
             // Arrays : 배열 관련 유용한 기능을 제공하는 클래스
             Arrays.sort(lotto); // 배열이 오름차순으로 정렬됨
             System.out.println(Arrays.toString(lotto));

         }

     }