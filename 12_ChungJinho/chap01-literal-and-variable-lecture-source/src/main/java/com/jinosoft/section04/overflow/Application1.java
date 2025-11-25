package com.jinosoft.section04.overflow;

public class Application1{
  public static void main(String[] args) {
    byte bnum = 127;
    bnum++;
    System.out.println(bnum);

    // 오버플로우 발생 여부는
    // 연산 후에만 알 수 있기 때문에
    // 처음 코드를 작성할 대 저장되는 값의 범위를 잘 예측해야한다.
  }
}
