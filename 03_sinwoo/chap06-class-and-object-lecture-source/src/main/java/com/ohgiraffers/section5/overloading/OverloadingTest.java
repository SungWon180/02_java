package com.ohgiraffers.section5.overloading;

public class OverloadingTest {

    public static void main(String[] args) {
        /*
        같은 클래스 내에서 같은 이름의 메서드를 작성하는 기법
         */
    }

    public void test() {}
//	public void test() {}		// 에러남
//	private void test() {}			//에러남	//접근제한자는 메서드 시그니처에 해당하지 않는다.
//	public int test() { return 0; }	//에러남	//반환형은 메서드 시그니처에 해당하지 않는다.
    public void test(int num) {}			//파라미터 선언부는 메서드 시그니처에 해당한다.
//	public void test(int num2) {}	//에러남	//매개변수의 이름은 메서드 시그니처에 영향을 주지 않는다.
    public void test(int num1, int num2) {}
    public void test(int num, String name) {}
    public void test(String name, int num) {}

}