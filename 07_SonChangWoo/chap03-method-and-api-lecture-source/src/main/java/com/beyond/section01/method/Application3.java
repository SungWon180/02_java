package com.beyond.section01.method;

public class Application3 {


  public static void main(String[] args) {

    Application3 application3 = new Application3();

    // - 전달 인자 "개수"는 반드시 호출하려는 메서드의 매개 변수 개수와 같아야 한다!
    // - 전달 인자 "타입"은 반드시 호출하려는 매서드의 매개 변수 타입과 같아야 한다!
    // - 전달 인자 "순서"는 반드시 호출하려는 매서드의 매개 변수 순서와 같아야 한다!
    application3.printAge(19);
    application3.printAge(30);
    application3.printAge(40);
    application3.printAge(99);

    application3.introduce("김철수",5,'남');
    application3.introduce("유리",5,'여');

    /* 잘못된 메서드 호출 */
    // application3.introduce(5, "훈이", '남');
  }

  // /** */ : JavaDoc 주석 -> 클래스, 매서드 설명을 작성하는 주석, 문서화 용도
  /**
   * 전달 받은 age를 출력하는 메서드
   * @param age 나이를 의미하는 int 타입 값
   */
  public void printAge(int age) {
    /* 매개 변수 int age : 전달 받은 int 값을 저장하는 변수
       age는 현재 메서드(printAge())에서만 사용 가능한 지역 변수 범위를 갖음
    * */
    System.out.println("당신의 나이는 : " + age + "세입니다.");
  }

  /**
   * 전달 받은 매개 변수 값을 이용해 소개 글을 출력하는 메서드
   * @param name
   * @param age
   * @param gender
   */
  public void introduce(String name, int age, char gender) {

    System.out.println("당신의 이름은 " + name + "이고, " +
        "나이는 "+ age + "이고, " +
        "성별은 " + gender + "자입니다.");

    // void 매서드에 컴파일러가 자동으로 return; 추가
    return;
  }



}
