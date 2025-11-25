package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class Application {
  public static void main(String[] args) {
    
    /* 생성자 
    * - new User()에서 User() 부분이 생성자 호출 부분
    * - 생성자는 인스턴스 생성 시 딱 1회만 호출됨
    * 
    * 생성자 사용 목적
    * 1. 인스턴스 생성 시점에 수행할 명령이 있을 경우
    * 2. 매개 변수 있는 생성자는 전달한 값으로 생성한 인스턴스의 필드를 초기화할 경우
    * 3. 작성한 생성자 외에는 인스턴스를 생성할 수 있는 방법을 제공하지 않고 싶을 경우
    * */
    
    // User 객체 생성

    /* 1. 기본 생성자 */
    User user1 = new User();

    /* 2. 매개 변수 있는 생성자 */
    User user2 = new User("user01", "pass01", "홍길동");

    /* 3. this() 생성자를 이용한 인스턴스 생성 */
    User user3 = new User("user02", "pass02", "고길동", new Date());

    /* 4. 복사 생성자 */
    User user4 = new User(user3);

    System.out.println(user3.hashCode());
    System.out.println(user4.hashCode());

    System.out.println("----프로그램 종료----");
  }
}
