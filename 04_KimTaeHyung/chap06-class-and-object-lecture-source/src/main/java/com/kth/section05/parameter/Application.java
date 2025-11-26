package com.kth.section05.parameter;

public class Application {
  public static void main(String[] args) {

    /* 메서드 호출 시 전달 가능한 자료형
    * - 기본 자료형(실제 값(data) 저장)
    * - 기본 자료형 배열, 클래스 자료형, 클래스 자료형 배열, 가변 인자
    *   (주소 값 (reference) 저장)
    * */

    ParameterTest pt = new ParameterTest();


    // 메서드 호출 시 전달인자에 작성된 변수는
    // 변수가 아닌 "저장된 값만 복사"해서 메서드로 전달한다
    int num = 0;
    pt.testPrimaryTypeParameter(num);
    System.out.println("num = " + num); // 0?  10?


    int[] arr = {1,2,3,4,5};
    pt.testPrimaryTypeArrayParameter(arr); // 배열 참조 주소가 복사되서 전달(얕은 복사)
    System.out.println("arr[0] : " + arr[0]);

    // r1에 저장된 값 == 생성된 RectAngle 인스턴스 참조 주소
    RectAngle r1 = new RectAngle(0, 0);
    pt.testClassTypeParameter(r1); // 주소만 복사해서 전달(얕은 복사)
    System.out.println("width : " + r1.getWidth());
    System.out.println("height : " + r1.getHeight());


    /* 가변 인자 확인 */
    pt.testVariableLengthArrayParameter("홍길동", "도적질", "동에번쩍", "서에번쩍");

  }
}
