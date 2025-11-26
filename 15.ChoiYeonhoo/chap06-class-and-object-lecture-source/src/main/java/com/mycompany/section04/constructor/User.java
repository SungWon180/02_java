package com.mycompany.section04.constructor;

import java.util.Date;

public class User {

  /* 필드 */
  private String id;
  private String pwd;
  private String name;
  private Date enrollDate;
  /* 메서드 */

  /* 생성자 선언부
  * [ 생성자 작성법 ]
  * public 클래스명 ([매개 변수]) {
  *   수행할 코드;
  * }
  * */

  /*
  * 기본 생성자(default constructor)
  * 클래스 내에 생성자가 1개도 없다면 (== 0개)
  * 컴파일러에 의해 자동으로 추가된다.
  * */
  public User(){
    System.out.println("User 기본 생성자 호출됨");
  }

  /* 2. 매개변수 있는 생성자 
  * 초기화할 필드가 여러개 있을 경우 사용
  * 인스턴스 생성때마다 getter/setter를 적기엔 귀찮으니 선언할때 동시에 값을 할당함. */
  public User(String id, String pwd, String name) {
    this.id = id;
    this.pwd = pwd;
    this.name = name;
    System.out.println("User 생성과 동시에 id, pwd, name 초기화");
  }

  public User(String id, String pwd, String name, Date enrollDate) {
//    this.id = id;
//    this.pwd = pwd;
//    this.name = name; 위 생성자와 내용이 같아서 중복을 제거하기 위해 수정
    
    // 생성자가 같은곳에 있는 다른 생성자를 호출할때는 이름으로 부르는게 아니라 this로 호출 해야함
    // this() 생성자를 이용한 코드 중복 제거
    this(id,pwd,name); // 같은 클래스 내 다른 생성자 호출 시 this() 작성
    this.enrollDate = enrollDate;
    System.out.println("User 생성과 동시에 id, pwd, name, enrollDate 초기화");
  }

  /* 4. 복사 생성자 */
  public User(User otherUser) {
    this(otherUser.id, otherUser.pwd, otherUser.name, otherUser.enrollDate);
  }

  /* 메서드 선언부 */

  public void method1(){}

  public void method1(int i, String s){}
}
