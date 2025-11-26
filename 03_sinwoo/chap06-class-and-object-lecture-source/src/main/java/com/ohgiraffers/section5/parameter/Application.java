package com.ohgiraffers.section5.parameter;

public class Application {

    public static void main(String[] args) {

        /*
        메서드 호출시 전달 가능한 자료형.
         */
        ParameterTest parameterTest = new ParameterTest();

        parameterTest.testPrimaryTypeParameter(10);

        parameterTest.testPrimaryTypeArrayParameter(new int[]{10,20,30});

        parameterTest.testClassTypeParameter(new RectAngle(0,0));

        parameterTest.testVariableLengthArrayParameter("d","dawd","Dawdwa");
    }
}
