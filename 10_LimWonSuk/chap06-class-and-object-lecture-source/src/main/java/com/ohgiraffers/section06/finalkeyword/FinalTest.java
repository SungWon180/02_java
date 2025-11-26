package com.ohgiraffers.section06.finalkeyword;

import com.ohgiraffers.section06.statickeyword.StaticTest;

public class FinalTest
{
    /* final 키워드를 사용할 수 있는 위치는 다양함
     * 1. 지역 변수 : 초기화 이후 값 변경 불가
     * 2. 매개 변수 : 호출 시 전달한 값 변경 불가 = 상수
     * 3. 인스턴스 변수 : 인스턴스 생성 초기화 이후에 값 변경 불가
     * 4. 클래스 변수(static) : 프로그램 시작 이후 값 변경 불가
     * 5. non-static method : 메소드 재작성(오버라이딩) 불가
     * 6. static method : 메소드 재작성(오버라이딩) 불가
     * 7. 클래스 : 상속 불가
     * */

    /* 현재 클래스를 이용해서 인스턴스를 만들었을 때
    * NON_STATIC_NUM이 같이 생성(할당)됨 */
   // private final int NON_STATIC_NUM = 1;

    /*인스턴스가 생성될 때 비어있는 값이 대입되지 않은 final 필드에 자동으로
    *  0이 초기화 되는 문제가 발생 -> 원하는 값 대입 불가능
    * - 해결방법 1) 바로 값을 대입 (명시적 초기화)
    * - 해결 방법 2) 생성자를 이용한 값 초기화
    *
    * */
    private final int NON_STATIC_NUM2;
   // NON_STATIC_NUM2 = 2;

    public FinalTest()
    {
        NON_STATIC_NUM2 = 100; //생성자가 jvm 기본값 대입 보다 우선순위가 높다

        System.out.println(StaticTest.MAX_COUNT);
        System.out.println(StaticTest.MIN_COUNT);


    }



}
