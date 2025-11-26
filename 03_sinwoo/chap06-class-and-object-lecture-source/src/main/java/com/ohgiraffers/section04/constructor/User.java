package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class User {

    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;


    // 1. 기본 생성자
    public User() {

    }

    /* 2. 매개변수 있는 생성자 */
    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        System.out.println("User 생성과 동시에 id, pwd, name을 초기화");
    }

    public User(String id, String pwd, String name, Date enrollDate) {
        this(id,pwd,name);
        this.enrollDate = enrollDate;
        System.out.println("User 생성과 동시에 id, pwd, name을 초기화");
    }


    // 복사 생성자.
    public User(User otherUser) {
        this(otherUser.id, otherUser.pwd, otherUser.name, otherUser.enrollDate);
    }

}
