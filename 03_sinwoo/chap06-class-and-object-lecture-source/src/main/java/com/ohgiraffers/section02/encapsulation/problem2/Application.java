package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {
    /*
    객체 필드 직접 접근 시 유지 보수 문제점.
     */
    public static void main(String[] args) {

        Monster monster1 = new Monster();
        monster1.setInfo("드라큘라");
        monster1.hp = 200;
        System.out.println("monster1 name : " + monster1.getInfo());
        System.out.println("monster1 hp : " + monster1.hp);


    }

}
