package com.mycompany.section04.overflow;

public class Application1 {
  public static void main(String[] args) {

    /* 오버 플로우
    * - 초기화 외, 연산 수행 시, 저장되는 값이 변수 값의 범위를 초과할 때, 발생하는 현상
    * */

    byte bNum1 = 127;
//    byte bNum2 = 128; // 초기화 시엔 에러 발생

    // 오버 플로우
    System.out.println("bNum1 = " + bNum1); // 127
    System.out.println();
    bNum1++; // bNum 값을 1 증가
    System.out.println("bNum1 = " + bNum1); // -128

    byte bNum2 = -128;
    
    // 언더 플로우
    System.out.println("bNum2 = " + bNum2); // -128
    bNum2--;
    System.out.println("bNum2 = " + bNum2); // 127

    /* 오버, 언더 플로우 발생 여부는
    * 연산 후에만 (프로그램 실행 중) 알 수 없기 때문에
    * 처음 코드를 작성 할 때, 값의 범위를 잘 예측해야한다.
    * */
  }
}
