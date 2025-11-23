package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {

        Application4 application4 = new Application4();
        application4.testMethod();
        // method 호출 후 종료 될때 return에 작성된 값이 호춣구문이 작성된 곳으로 돌아옴
        // applicationm4.testMethod();
        int result = application4.testMethod(); // 12345;
        System.out.println("result = " + result);

        /* 메서드 호출 시 값 전달하고 리턴값 돌려 받기*/
        application4.twoNuberSum(10.3, 20.5); // 원레는안되는데 double 타입인 소수점 형태로 자동 변환 해주어 가능하게함
        System.out.println("result = " + result);
    }
    // void = return 타입 (반환형)
    // - void : 리턴할 값이 없음
    // - 기본 자료형 : 메서드가 종료되고 호출한 곳으로 돌아갈 때
    //                기본 자료형 값을 들고 돌아간다
    // - String : 메서드가 종료되고 호출한 곳으로 돌아갈 때
    //                String을 들고 돌아감
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

    public double twoNuberSum(
            double num1,
            double num2
                            )
    {
        return num1 + num2;



    }

}
