package com.ohgiraffers.section05.overloading;

public class OverloadingTest
{
    /* 오버로딩
    * - 같은 클래스 내에서 같은 이름의 메서드를 작성하는 기법
    *
    * 사용 이유
    * - 매개변수의 종류에 따라서 메서드 동작이 조금씩 달라 지는 경우
    *       서로 다른 이름으로 메서드를 관리하면 어렵기 때문에 하나의 이름으로 괸리
    *
    * 성립요건
    *1. 메서드이름이 같아야함

    *2. 메개변수의 타입,순서,개수 중 하나라도 달라야한다

    *3. 접근제어자, 반환형, 예외처리 신경 x
    * */

    public static void main(String[] args)
    {
     OverloadingTest overloadingTest = new OverloadingTest();
    }
    public void test()
    {

    }
    public void test(int num) // 매개변수 개수 다름
    {

    }
    public void test(double num) // 타입이 다름
    {

    }

    public void test(String name, double num) // 개수가 다름
    {

    }
    public void test(  double num, String name) // 순서 다름
    {

    }
    public void test(  String a, String b) // 타입 다름
    {

    }
/*    public void test(  String b, String a) //
            순서가달라보이지만
       변수명이 달라져도 타입, 순서, 개수가 모두 일치함

    {

    }*/

}
