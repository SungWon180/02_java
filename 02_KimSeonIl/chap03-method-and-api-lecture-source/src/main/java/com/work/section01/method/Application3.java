package com.work.section01.method;

public class Application3 {
  public static void main(String[] args) {
    Application3 app3 = new Application3();

    //전달 인자는 반드시 호출하려는 메서드의 매개변수 개수와 같아야 한다.
    //전달 인자의 타입은 반드시 호출하려는 메서드의 매개변수 타입과 같아야 한다.
    //전달 인자의 순서는 반드시 호출하려는 메서드의 매개변수 순서와 같아야 한다.
    app3.printAge(19);
    app3.printAge(20);
    app3.printAge(21);
    app3.printAge(21);

    app3.introduce("신짱구",5,'남');
    app3.introduce("유리",5,'여');
//    app3.introduce(5,"유리",'여');
  }

  /** JavaDoc 주석 = 클래그, 메서드 설명을 작성하는 주석, 문서화 용도
   *
   * 전달 받은 age를 출력하는 메서드
   * @param age 나이를 의미하는 (int)
   */
  public void printAge(int age){
    // 매개변수 int age : 전달 받은 int값을 저장하는 변수, age는 현재 메서드(printAge())에서만 사용 가능한 지역변수
    System.out.println("당신의 나이는"+age+"세 입니다.");
  }

  /**
   * 전달받은 매개 변수 값을 이용해 소개글을 출력하는 메서드
   * @param name
   * @param age
   * @param gender
   */
  public void introduce(String name, int age, char gender ){
    System.out.println("안녕하세요."+name+"이고, 나이는"+age+"세, 성별은 "+gender+"자 입니다.");
    /*
    * void 메서드에 컴파일러가 자동으로 return; 추가
    * return;*/
  }
}

