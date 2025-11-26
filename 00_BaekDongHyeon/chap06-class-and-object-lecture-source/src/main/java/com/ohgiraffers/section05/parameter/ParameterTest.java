package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class ParameterTest {

  /* 1. 기본 자료형 */
  public void testPrimaryTypeParameter(int num) {
    num += 10;
    System.out.println("testPrimaryTypeParameter : " + num);
  }

  /* 2. 기본 자료형 배열 */
  public void testPrimaryTypeArrayParameter(int[] iarr) {
    iarr[0] = 100;
    System.out.println("testPrimaryTypeArrayParameter : " + iarr[0]);
  }

  /* 3. 클래스 자료형 */
  public void testClassTypeParameter(RectAngle rectAngle) {
    rectAngle.setWidth(32.5);
    rectAngle.setHeight(42.5);

    System.out.println("testClassTypeParameter : "
        + rectAngle.getWidth() + " / " + rectAngle.getHeight());
  }

  /* 4. 가변 인자
  * - 전달 인자의 개수가 정해져 있지 않을 경우 사용하는 매개 변수
  * - 단, 가변 인자는 항상 매개 변수 선언부 제일 마지막에 작성 되어야 한다.
  * */
  public void testVariableLengthArrayParameter(String name, String...hobby) {

    System.out.println("name : " + name);
    System.out.println("hobby.length : " + hobby.length);
    System.out.println("hobby : " + Arrays.toString(hobby));
  }
}
