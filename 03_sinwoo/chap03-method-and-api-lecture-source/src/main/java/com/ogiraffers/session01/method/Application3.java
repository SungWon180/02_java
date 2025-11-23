package com.ogiraffers.session01.method;

public class Application3 {
    public static void main(String[] args) {
        Application3 app = new Application3();

        // 전달 인자는 반드시 호출하려는 메서드의 매개변수 개수와 같아야 한다.
        // 전달 인자의 타입은 반드시 호출하려는 메서드의 매개변수 타입과 같아야 한다.
        // 전달 인자의 순서는 반드시 호출하려는 메서드의 매개변수 순서와 같아야 한다.
        app.printAge(19);
        app.introduce("김신우",28,'남');
    }


    // /** */ : javaDoc 주석 -> 클래스, 메서드 설명을 작성하는 주석, 문서화 용도
    /**
     *
     * @param age 나이를 의미하는 int 타입 값.
     */
    public void printAge(int age){
        // 매개변수 int age : 전달 받은 int값을 저장하는 변수
        // age는 현재 메서드 에서만 사용 가능한 지역변수 범위를 갖음.
        System.out.println("당신의 나이는" + age + "세");
    }

    /**
     * 전달받은 매개변수 값을 이용해 소개 글을 출력하는 메서드.
     * @param name
     * @param age
     * @param gender
     */
    public void introduce(String name, int age, char gender){
        System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 성별은 " + gender);
    }

}
