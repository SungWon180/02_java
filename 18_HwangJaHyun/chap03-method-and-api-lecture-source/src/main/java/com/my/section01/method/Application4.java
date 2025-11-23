package com.my.section01.method;

public class Application4 {
  public static void main(String[] args) {
    Application4 application4 = new Application4();
    // 메서드 호출 후 종료될 때 return에 작성된 값이 호출구문이 작성된 곳으로 돌아옴
    int result = application4.testMethod(); // 12345
    System.out.println("result = " + result);

    /* 메서드 호출 시 값 전달하고 리턴값 돌려받기 */
    double result3 = application4.twoNumberSum(10, 20); // 자동형변환
    double result2 = application4.twoNumberSum(10.3, 20.5);
    System.out.println("result2 = " + result2 + " result3 = " + result3);
  }

  // 리턴 타입(반환형)
  // void : 리턴할 값이 없음.
  // 기본 자료형 : 메서드가 종료되고 호출한 곳으로 돌아갈 때
  // 기본 자료형 값을 들고 돌아감
  // String : 메서드가 종료되고 호출한 곳으로 돌아갈 때,
  // String 들고 돌아감
  public int testMethod(){
    return 12345;
  }

  /**
   * 전달 받은 두 실수를 더해서 반환하는 메서드
   * @param num1
   * @param num2
   * @return
   */
  public double twoNumberSum(double num1, double num2){
    return num1 + num2;
  }

}
