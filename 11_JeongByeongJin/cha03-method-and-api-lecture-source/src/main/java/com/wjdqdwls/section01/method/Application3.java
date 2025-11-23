package com.wjdqdwls.section01.method;

public class Application3 {
  public static void main(String[] args) {

    Application3 application3 = new Application3();

    // 전달 인자의 개수는 반드시 호출하려는 메서드의 매개변수 개수와 같아야 한다
    // 전달 인자의 타입은 반드시 호출하려는 메서드의 매개변수 타입과 같아야 한다
    // 전달 인자의 순서는 반드시 호출하려는 메서드의 매개변수 순서와 같아야 한다
    application3.printAge(10);
    application3.printAge(34);
    application3.printAge(21);
    application3.printAge(29);

    application3.introduce("정병진", 29, '남');
    application3.introduce("박찬진", 26, '남');
    application3.introduce("정진호", 26, '남');
    application3.introduce("정현호", 26, '남');

  }
  // /** */ JavaDoc 주석 -> 클래스, 메서드 설명을 작성하는 주석, 문서화 용도
  /**
   * 전달받은 age를 출력하는 메서드
   * @param age 나이를 의미하는 int 타입 값
   */
  public void printAge(int age){
    // 매개 변수 int age : 전달 받은 Int 값을 저장하는 변수
    //                   age는 현재 메서드(printAge())에서만 사용 가능한 지역변수 범위를 갖음

    System.out.println("당신의 나이는 "+age+"세 입니다.");
  }

  /**
   * 전달 받은 매개 변수 값을 이용해 소개 글을 출력하는 메서드
   * @param name
   * @param age
   * @param gender
   */
  public void introduce(String name, int age, char gender){
    System.out.println(
        "당신의 이름은 "+name+"이고, " +
        "나이는 "+age+"세, " +
        "성별은 "+gender+"자입니다.");

    // void 메서드에 컴파일러가 자동으로 Return; 추가
    return;
  }


}
