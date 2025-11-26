package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class Application {

    public static void main(String[] args) {

        // 생성사는 객체 생성시 1회 호출
        // User 객체를 생성

        // 기본 생성자 : 매개변수가 없는 생성자로써 클래스 내 생성자가 1개가 없으면 컴파일러에 의해 자동으로 1개 추가.
        // 작성한 생성자 외에는 인스턴스를 생성할 수 있는 방법을 제공하지 않고 싶을 경우
        User user1 = new User();

        User user2 = new User("1","2","홍길동");

        User user3 = new User("4","5","고길동",new Date());

        User user4 = new User(user3);

    }

}
