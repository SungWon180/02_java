package com.ogiraffers.session01.method;

public class Application4 {

    public static void main(String[] args) {
        Application4 app = new Application4();
        // 메서드 호출 후 종료 될 때 return에 작성된 값이 호출구문이 작성된 곳으로 돌아옴
        int result = app.testMethod();
        System.out.println("result = " + result);

        double result2 = app.twoNumberSum(10.3, 20.5);
        System.out.println("result2 = " + result2);


    }

    // return type : 반환형
    // void : 리턴값 없음
    // 기본 자료형 : 메서드가 종료되고 호출한 곳으로 돌아갈 때 기본 자료형 값을 들고 돌아감
    // 스트링 : 메서드가 종료되고 호출한 곳으로 돌아갈 때 String을 들고 돌아감
    public int testMethod() {
           return 123456;
    }

    /**
     * 전달받은 두 실수를 더해서 반환하는 메서드다
     * @param num1
     * @param num2
     * @return num1 + num2
     */
    public double twoNumberSum(double num1, double num2) {
        return num1 + num2;
    }

}
