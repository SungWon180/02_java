package section_01.usertype;

import java.util.Arrays;

public class Application {
  public static void main(String[] args) {
    /* 사용자 정의 자료형(클래스) 사용하기 */

    /* 작성한 클래스를 이용해서 변수 선언 및 객체 생성
    *
    * [작성법]
    * 클래스명 변수명 = new 클래스명();
    * 클래스명 변수명 : 특정 클래스로 생성한 객체 주소를 저장할 변수를 선언
    * (참조 자료형)
    *
    * @@@@@@@@@@@@@@
    * new 클래스명() : heap 영역에 클래스에 정의된 내용대로 메모리 할당
    *                       == 객체(instance) 생성
    * */

    Member member = new Member(); // Member 객체 생성 후 주소 참조
    /*
    * 참조 연산자(.)
    * 참조 변수가 참조하고 있는 객체의 필드 또는 메서드에 접근하는 연산자
    *
    * */

    // heap 영역은 비어있는 상태로 존재를 못함!
    // -> JVM이 각 자료형 기본값으로 초기화함.
    //  @@@java의 null: 참조하는 객체가 없다(주소 저장X 의미)
    System.out.println("member.id = " + member.id);
    System.out.println("member.pwd = " + member.pwd);
    System.out.println("member.name = " + member.name);
    System.out.println("member.age = " + member.age);
    System.out.println("member.gender = " + member.gender);
    System.out.println("member.hobby = " + Arrays.toString(member.hobby));

    /* 필드에 값 대입 */
    member.id = "user01";
    member.pwd = "user01";
    member.name = "홍두깨";
    member.age = 18;
    member.gender = '여';
    member.hobby = new String[]{"야구", "넷플릭스보기", "소설보기"};

    System.out.println("member.id = " + member.id);
    System.out.println("member.pwd = " + member.pwd);
    System.out.println("member.name = " + member.name);
    System.out.println("member.age = " + member.age);
    System.out.println("member.gender = " + member.gender);
    System.out.println("member.hobby = " + Arrays.toString(member.hobby));

    /*
    *   stack
    * (member) member 주소 참조중
    *   heap
    * (member) 속성들...
    * 같은 자료형, 연산 가능
    * */
  }
}
