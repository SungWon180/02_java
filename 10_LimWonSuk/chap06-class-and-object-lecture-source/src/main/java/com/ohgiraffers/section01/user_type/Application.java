package com.ohgiraffers.section01.user_type;

import java.util.Arrays;

public class Application
{
    public static void main(String[] args)
    {
        /*사용자 정의 자료형(클래스) 사용하기
        *
        * - 작성한 클래스를 이용해서 변수 선언 및 객체 생성
        *
        * [작성법]
        * 클래스명 변수명 = new 클래스명()= 생성자 구문;
        *
        * - 클래스명 변수명ㄹ : 특정 클래스로 생성한 객체 주소를 저장할 변수 선언
        * 주소로저장 = 참조 자료형 -> 주소로 저장하면 다 참조 자료형임
        *
        * -new 클래스명() : heap 영역에 클래스에 정의된 내용대로 메모리 할당 == 객체(instance) 생성
        *
        * */

        Member member = new Member(); // Member 객체 생성후 주소 참조

        /* 참조 연산자 = ' . '
        * - 참조 변수가 참조하고 있는 객체의 필드 또는 메서드에 접근하는 연산자
        *
        *  */

        System.out.println("member.id = " + member.id);
        System.out.println("member.pwd = " + member.pwd);
        System.out.println("member.name = " + member.name);
        System.out.println("member.age = " + member.age);
        System.out.println("member.gender = " + member.gender);
        System.out.println("member.hobby = " + member.hobby);

        // **변수(variable)**는 값이 변할 수 있는 수
        /*필드에 값 대임*/
        member.id = "user01"; // user01은 변수
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[] {"축구", "볼링", "테니스"}; // 배열이므로 주소로 값을 가져옴

        /*int[] arr;
        arr = new int{1, 2, 3}; // 이 배열은 추론이 확실하지 않다 그래서  new int 라는 타입을 명시해줘야함*/

        System.out.println("변경 후 member.id : " + member.id);
        System.out.println("변경 후 member.pwd : " + member.pwd);
        System.out.println("변경 후 member.name : " + member.name);
        System.out.println("변경 후 member.age : " + member.age);
        System.out.println("변경 후 member.gender : " + member.gender);
      //  System.out.print("변경 후 member.hobby : " + Arrays.toString(member.hobby));
        System.out.print("변경 후 member.hobby : ");
        for(int i = 0; i < member.hobby.length; i++) {
            System.out.print(member.hobby[i] + " ");
        }



    }
}
