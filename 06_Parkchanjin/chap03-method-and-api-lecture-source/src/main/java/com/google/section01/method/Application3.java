package com.google.section01.method;

public class Application3 {
  public static void main(String[] args) {

    Application3 application3 = new Application3();

    // 전달 인자의 개수는 반드시 호출하려는 메서드의 매개변수 개수와 같아야한다
    // 전달 인자의 타입는 반드시 호출하려는 메서드의 매개변수 타입와 같아야한다
    // 전달 인자의 순서는 반드시 호출하려는 메서드의 매개변수 순서와 같아야 한다.

    application3.printAge(19);
    application3.printAge(30);
    application3.printAge(40);
    application3.printAge(99);

    application3.introduce("신짱구", 5, '남');
    application3.introduce("유리", 5, '여');

    // 잘못된 메서드 호출
//    application3.introduce("유리", 5, ;
//    application3.introduce("유리", 5, "여");
  }
  // /** */ : JAVADOC 주석 -> 클래스,메서드 설명을 작성하는 주석, 문서화 용도

  /**
   * 전달받는 age를 출력하는 메서드
   * @param age
   */
  public void printAge(int age) {
    System.out.println("당신의 나이는 "+ age +"세 입니다.");
  }


  /**
   * 전달 받은 매개 변수 값을 이용해 소개 글을출력하는 메서드
   * @param name
   * @param age
   * @param gender
   */
  public void introduce(String name, int age, char gender) {
    System.out.println(
        "당신의 이름은 " + name + "이고, " +
        "나이는" + age + "세, " +
        "성별은" + gender + "자 입니다.");

    // void 메서드에 컴파일러가 자동으로 return; 추가
  }
}
