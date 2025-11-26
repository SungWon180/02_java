package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {

    /*
    name을 수정해야 하는 상황
     */

    private String kinds; // 기존에 name에 직접 접근하던 코드에서 오류 발생.
    private int hp;

    public void setHp(int hp) {
        if (hp > 0) {
            // this. 참조 변수 : 만들어진 인스턴슬를 참조하는 참조형 변수
            this.hp = hp;
            System.out.println("양수 값이 입력되어 몬스터 체력 입력값으로 변경.");
        }else {
            this.hp = 0;
            System.out.println("0이하의 값이 입력되어 몬스터의 체력을 0으로 변경.");
        }
    }

    public int getHp() {
        return this.hp;
    }

    public String setInfo(String info) {
        return this.kinds;
    }

    public String getInfo() {
        return this.kinds;
    }

}
