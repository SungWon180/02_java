package com.mins.section01.method;

public class Application3 {
  public static void main(String[] args) {

    Application3 application3 = new Application3();

    // - 전달 인자 개수는 반드시 호출하려는 메서드의 매개변수(parameter) 개수와 같아야 한다!
    // - 전달 인자 타입은 반드시 호출하려는 메서드의 매개변수 타입과 같아야 한다.
    // - 전달 인자 순서는 반드시 호출하려는 메서드의 매개변수 순서과 같아야 한다.
    application3.printAge(19);
    application3.printAge(40);
    application3.printAge(50);
    application3.printAge(99);

    application3.introduce("김",1,'남');
    application3.introduce("이", 2, '남');
    application3.introduce("박", 3, '남');
  }

  // /** */ : JavaDoc 주석 -> 클래스, 메서드 설명을 작성하는 주석, 문서화 용도

  /**
   * 전달 받은 age를 출력하는 메서드
   * @param age 나이를 의미하는 int 타입 값
   */
   public void printAge(int age) {

    System.out.println("당신의 나이는 "+age+"세입니다.");
  }

  /**
   * 전달 받은 매개 변수 값을 이용해 소개 글을 출력하는 메서드
   * @param name
   * @param age
   * @param gender
   */

  public void introduce(String name,int age, char gender) {

    System.out.println("당신의 이름은 "+name+"이고, 나이는 "+age+"세, 성별은 "+gender+" 입니다.");

  }
}
