package com.kang.section01.method;

public class Application4 {
  public static void main(String[] args) {


    Application4 application4 = new Application4();

    // 메서드 호출 후 종료될 떄 return에 작성된 값이 호출구문이 작성된 곳으로 돌아옴
    int result = application4.testMethod();//123425
    System.out.println("result = " + result);

    /* 메서드 호출 시 값 전달하고 리턴값 돌려받기 */
    double result2 = application4.twoNumberSum(10.3, 20.5);
    System.out.println("result2 = " + result2);
  }
  //  리턴 타입(반환형)
  // void : 리털할 값이
  // 기본 자료형 : 메서드가 종료되고 호출한 곳으로 돌아갈 때
  //                기본 자료형 값을 듥고 들어가
  // - String : 메서드가 종료되고 호출한 곳으로 돌아갈 때
  //String 을 들고 돌아감
  public int testMethod() {

    // return 돌고돌아갈값
    return 12345;
  }

  /**
   전달 받은 두 실수를 더해서 반환하는 메서드
   @param num1
   @param num2
   @return*/
  public double twoNumberSum(double num1, double num2){
    return num1 + num2;}
}
