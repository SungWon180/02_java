package com.qew032.section01.method;

public class Application3 {

  public static void main(String[] args) {

    // 전달 인자의 개수는 반드시 호출하려는 메서드의 매개변수 개수와 같아야한다.
    // 전달 인자의 타입은 반드시 호출하려는 메서드의 매개변수  타입과 같아야 한다.
    // 전달 인자의 순서는 반드시 호출하려는 메서드의 매개변수 순서와 같아야 한다.
    Application3 application3 = new Application3();
    application3.printAge(34);;
    application3.printAge(45);;
    application3.printAge(10000);;

    application3.introduce("윤성원", 34, '남');
    application3.introduce("유리", 5, '여');

  }

  /**
   *  전달 받은 age를 출력하는 메서드
   * @param age 나이를 의미하는 int 타입 값
   */

  public  void printAge(int age) {
    // 매개 변수 int age : 전달 받은 int값을 저장하는 변수
    // age는 현재 메서드(printAge())에서만 사용 가능한 지역변수 범위를 갖음.


    System.out.println("당신의 나이는 " + age + "세 입니다.");
  }


  /**
   * 전달 받은 매개 변수 값을 이용해 소개글을 출력하는 메서드
   * @param name
   * @param age
   * @param gender
   */
  public  void introduce(String name, int age, char gender) {
    System.out.println("당신의 이름은 "+ name +"이고, 나이는 " + age + "세, 성별은 " + gender + "자 입니다.");

    // void 메서드에 컴파일러가 자동으로 return; 추가
    return;
  }

}
