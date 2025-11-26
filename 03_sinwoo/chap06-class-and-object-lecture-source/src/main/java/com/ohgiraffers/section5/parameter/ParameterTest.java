package com.ohgiraffers.section5.parameter;

import java.awt.*;

public class ParameterTest {

    public void testPrimaryTypeParameter(int num) {
        num += 10;
        System.out.println("testPrimaryTypeParameter" + num);
    }

    public void testPrimaryTypeArrayParameter(int[] iarr) {
        iarr[0] = 100;
        System.out.println("ParameterTest.testPrimaryTypeArrayParameter" + iarr[0]);
    }

    public void testClassTypeParameter(RectAngle rectAngle) {
        rectAngle.setWidth(30.5);
        rectAngle.setHeight(20.5);
        System.out.println("ParameterTest.testClassTypeParameter" + rectAngle.getWidth() + "/" + rectAngle.getHeight());
    }

    // 가변인자 : 전달인자의 개수가 정해지지 않을경우 사용하는 매개변수. 단, 가변인자는 항상 매개변수 선언부 제일 마지막에 작성되어야 한다.
    public void testVariableLengthArrayParameter(String name, String...hobby) {
        System.out.println(name);
        for(String hobbyItem : hobby) {
            System.out.println(hobbyItem);
        }
    }

}
