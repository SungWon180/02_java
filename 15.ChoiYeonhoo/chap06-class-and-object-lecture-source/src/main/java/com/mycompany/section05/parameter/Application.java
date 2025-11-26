package com.mycompany.section05.parameter;

public class Application {
  public static void main(String[] args) {

    /* 매서드 호출 시, 전달 가능한 자료형
    * - 기본 자료형 : 실제 값(data)을 저장
    * - 기본 자료형 배열, 클래스 자료형, 클래스 자료형 배열, 가변 인자 / 참조 주소값(reference) 저장
    * */

    ParameterTest pt = new ParameterTest();

    // 메서드 호출 시 전달 인자에 작성된 변수는
    // 변수가 아닌 "저장된 값만 복사"해서 메서드로 전달한다.
    int num = 0;
    pt.testPrimaryTypeParameter(num);
    System.out.println("num = " + num);

    // {1,2,3,4,5}가 저장된 주소가 arr에 저장되어 있고, 주소가 testPrimaryTypeArrayParameter에 전달됨
    // 내부에서 주소를 보고 해당 주소의 데이터를 수정했으므로, 값이 바뀌는것을 확인할 수 있다.
    int[] arr = {1,2,3,4,5};
    pt.testPrimaryTypeArrayParameter(arr); // 배열 참조 주소가 복사되서 전달(얕은 복사)
    System.out.println("arr[0] = " + arr[0]);

    // r1에 저장된값 = 생선된 rectAngle 인스턴스의 참조 주소
    RectAngle r1 = new RectAngle(0,0);
    pt.testClassTypeParameter(r1); // 인스턴스 주소만 복사에서 전달하는 얕은 복사
    System.out.println("width = " + r1.getWidth());
    System.out.println("height() = " + r1.getHeight());

    /* 가변 인자 확인 */
    pt.testVariableLengthArrayParameter("홍길동","도둑질","동해번쩍", "서해번쩍");

  }
}
