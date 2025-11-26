package com.mycompany.section05.overloading;

public class OverloadingTest {

  /* 오버로딩
  * - 같은 클래스 내에서 같은 이름의 메서드를 작성하는 기법
  *
  * 사용 이유
  * - 매개 변수의 종류에 따라서, 메서드 동작이 조금씩 달라지는 경우
  *    서로 다른 이름으로 메서드를 관리하면 어렵기 때문데
  *    하나의 이름으로 관리
  *
  * 성립 요건
  * 1. 메서드의 이름이 같아야 한다.
  * 2. 매개변수의 타입, 순서, 개수 중 하나라도 달라야 한다.
  * 3. 접근제어자, 반환형, 예외처리 신경 X
  * */
  public static void main(String[] args) {
    OverloadingTest overloadingTest = new OverloadingTest();
  }
  
  public void test(){};
  public void test(int num){}; // 매개 변수 개수가 다름
  public void test(double num){}; // 타입이 다름
  public void test(String name, double num){}; // 개수가 다름
  public void test(double num, String name){}; // 순서가 다름
  public void test(String a, String b){}; // 타입이 다름
//  public void test(String b, String a){}; // 에러 발생, 변수 이름만 다르고 타입,순서,개수가 모두 일치함.,
}
