package org.ho.section01.method;

import javax.print.DocPrintJob;

public class Application3 {
  public static void main(String[] args) {
    Application3 application3 = new Application3();

    // 전달 인자의 개수는 반드시 호출하려는 메서드의 매개변수 개수와 같아야 한다!
    // 전달 인자의 타입은 반드시 호출하려는 메서드의 매개변수 타입와 같아야 한다!
    // 전달 인자의 순서는 반드시 호출하려는 메서드의 매개변수 순서와 같아야 한다!
    application3.printAge(19);
    application3.printAge(30);
    application3.printAge(40);
    application3.printAge(99);
    application3.introduce("정현호",26,'남');

    /*잘못된 메서드 호출*/
//    application3.introduce("유리",5);
//    application3.introduce("유리",5,"");
//    application3.introduce("유리","");
//    application3.introduce("유리","",5);
  }

  // /** */ : JavaDoc 주석 -> 클래스, 메서드 설명을 작성하는 주석, 문서화 용도
  /**
   * 전달 받은 age를 출력하는 메서드
   * @param age 나이를 의미하는 int 타입 값
   */
  public void printAge(int age){
    //매개 변수 int age : 전달 받은 int 값을 저장하는 변수
    System.out.println("당신의 나이는 "+age+"세 입니다.");
  }

  /**
   * 전달 받은 매개 변수 값을 이용해 소개 글을 출력하는 메서드
   * @param name 이름
   * @param age 나이
   * @param gender 성별(남,여)
   */
  public void introduce(String name,int age,char gender){
    System.out.println("당신의 이름은 "+name+"이고," +
        " 나이는 "+age+"세," +
        " 성별은 "+gender+"자 입니다.");
    // void 메서드에 컴파일러가 자동으로 return; 추가
    return;
  }
  public void introduce(String name,int age){
    System.out.println("이건 오버로드 메소드란 것이다.");
  }

}
