package com.mycompany.section06.finalkeyword;

import com.mycompany.section06.statickeyword.StaticTest;

public class FinalTest {
  /* final 키워드를 사용할 수 있는 위치는 다양함

      1. 지역 변수 : 초기화 이후 값 변경 불가
      2. 매개 변수 : 호출 시 전달한 값 변경 불가
      3. 인스턴스 변수 : 인스턴스 생성 초기화 이후에 값 변경 불가
      4. 클래스 변수(static) : 프로그램 시작 이후 값 변경 불가
      5. non-static method : 메소드 재작성(오버라이딩) 불가
      6. static method : 메소드 재작성(오버라이딩) 불가
      7. 클래스 : 상속 불가
  */

  /* 현재 클래스를 이용해서 인스턴스를 만들었을 때,
  * NON_STATIC_NUM이 같이 할당됨 */
  private final int NON_STATIC_NUM = 1;

  // 강사님 설명
  // 인스턴스가 생성될 때 값이 대입되지 않은 final 필드에
  // 자동으로 0이 초기화되는 문제가 발생 -> 원하는 값 대입 불가능
  // 내가 정리
  // 2번 그러나 field는 heap 영역에 만들어지므로, heap영역에는 값이 비어있지 않고 기본값이 들어감. 여기에는 0
  // 이미 값이 할당된 final에 새로운 값을 초기화 하려고 했으므로 에러 발생함
  // - 해결 방법 1) 바로 값 대입 (명시적 초기화)
  // - 해결 방법 2) 생성자를 이용한 값 초기화
  private final int NON_STATIC_NUM2;
//  NON_STATIC_NUM = 2;
  public FinalTest(){
    NON_STATIC_NUM2 = 100; // 생성자가 JVM 기본값 대입보다 우선 순위가 높다.
  }

  public void test(){
    // 1번 지역 변수는 만들어질때 Stack 영역 안에 만들어지고, 값이 잠시 비어 있을 수 있음
    // 그러므로 선언 후 초기화 가능
    final int A;
    A = 100;

    System.out.println(StaticTest.MAX_COUNT);
    System.out.println(StaticTest.MIN_COUNT);
    System.out.println(Math.PI);
  }
}
