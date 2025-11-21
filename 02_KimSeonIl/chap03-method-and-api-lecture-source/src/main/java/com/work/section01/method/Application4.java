package com.work.section01.method;

public class Application4 {
  public static void main(String[] args) {
    Application4 app4 = new Application4();
    //메서드 호출 후 종료될 때 return에 작성된 값이 호출구문이 작성된 곳으로 돌아옴
    app4.testMethod();
    int result = app4.testMethod();
    System.out.println(result);

    // 메서드 호출시 값 전달하고 리턴 값 돌려 받기
    double result2 = app4.twoNumberSum(10.3, 20.5);
    System.out.println("result2 = " + result2);
  }



// 리턴 타입 = void
  //리턴할 값이 없음
// 기본 자료형 : 메서드가 종료되고 호출한 곳으로 돌아갈때
  // 기본 자료형 값을 들고 돌아간다.
  //String : 메서드가 종료되고 호출한 곳으로 돌아갈 때 String을 들고 돌아감
  public int testMethod(){
    //return 들고 돌아갈 값;
    return 12345;

  }

  /**
   * 전달 받은 두 실수를 더해서 반환하는 메서드
   * @param num1
   * @param num2
   * @return num1 + num2
   */
  public double twoNumberSum(double num1, double num2){
    return num1 + num2;
  }
}
