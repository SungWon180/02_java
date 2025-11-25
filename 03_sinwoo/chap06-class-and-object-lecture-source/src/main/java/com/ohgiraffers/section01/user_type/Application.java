package com.ohgiraffers.section01.user_type;

public class Application {
    public static void main(String[] args) {

        Member member = new Member();

        member.id = "user01";
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[] {"축구", "볼링", "테니스"};

        System.out.println("변경 후 member.id : " + member.id);
        System.out.println("변경 후 member.pwd : " + member.pwd);
        System.out.println("변경 후 member.name : " + member.name);
        System.out.println("변경 후 member.age : " + member.age);
        System.out.println("변경 후 member.gender : " + member.gender);
        System.out.print("변경 후 member.hobby : ");

        for(int i = 0; i < member.hobby.length; i++) {
            System.out.print(member.hobby[i] + " ");
        }

    }
}
