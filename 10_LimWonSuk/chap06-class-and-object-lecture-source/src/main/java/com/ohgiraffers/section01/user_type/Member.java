package com.ohgiraffers.section01.user_type;

public class Member
{
    /*클래스 :
    *객체의 속성과 기능을 정의하는 문\서
    * (객체를 만들기위한 설계도 개념
    * */


    /*필드(field) 또는 멤버변수
    * -클래스 범위에 선언된 변수
    * - 클래스 내 전역에서 사용 가능하다 (전역 변수와 유사한 개념 )
    *-  클래스 내에서 사용된 변수는 어디서든 사용가능
    * */

    /* heap 영역은 비어있는 상태로 존재를 못함!
    * -> JVM이 각 자료형 기본 값으로 초기화함.
    * javs - nyll : 참조하는 객체가 업다(주소 저장X 의미)
    * */

    String id;
    String pwd;
    String name;
    int age;
    char gender;
    String[] address;
    String[] hobby
            ;
}
