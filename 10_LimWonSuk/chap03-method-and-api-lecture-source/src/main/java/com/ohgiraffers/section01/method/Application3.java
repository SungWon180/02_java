package com.ohgiraffers.section01.method;

public class Application3 {
    public static void main(String[] args) {
// 매개변수를 사용하면 이런식으로 나타낼 수 있다
        Application3 application3 = new Application3();
// application3.printAge(전달인자)
        // 전달 인자 개수는 반드시 호출하려는 메서드의 매개변수 '개수'외 같아야 한다!
        // 전달 인자의 타입은 반드시 호출하려는 메서드의 매개변수 '타입'과 같아야 한다!
        // 전달 인자의 순서는 반드시 호출하려는 메서드의 매개변수 '순서'와 같아야한다!
        application3.printAge(19); // 여기서 19는 int 형이다
        application3.printAge(39); // 여기서 39는 int 형이다
        application3.printAge(29); // 여기서 29는 int 형이다

        application3.introduce( "신짱구",  5, '남');
        application3.introduce( "유리",  5, '여');

 /*       *//*잘못된 매서드 호출*//*
        application3.introduce( "유리",  5, "여");
        application3.introduce( 5,   "훈이", "여");*/

    }

    /** [/** = JavaDoc 주석 -> 클래스, 매서드 설명을 작성하는 주석, 문서화 용도]
     * 전달 받은 age를 출력하는 메서드
     * @param age 나이를 의미하는 int 타입 값
     *
     */
    public void printAge(int age){
        // 매개변수 int age : 전달 받은 int값을 저장하는 변수
        //   age는 현재 메서드(printAge())에서만 사용 가능한 지역변수 범위를 갖음

        System.out.println("당신의 나이는 "+ age + "세 입니다");
    }

    /**
     * 전달 받은 매개 변수 값을 이용홰 소개 글을 춣력화는 메서드
     * @param name
     * @param age
     * @param gender
     */

    public void introduce(String name, int age, char gender ){

        System.out.println(
                " 당신의 이름은 "+name+"이고," +
                " 나이는 "+age+"세," +
                " 성별은 "+gender+"자 입니다. "
        );
        // 원레는 void 메서드에 컴파일러가 자동으로 Return

    }



}
