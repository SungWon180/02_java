package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {
    /* 문제원인 : 객체 필드를 직접 접근하는 것이 문제다!
     *
     *  해결방법 : 외부 클래스/객체 에서의 직접 접근 자체를 차단
     * -> 접근 제어자(제한자) : private, default, protected, public
     *
     * 단, 클래스 선언 시에는 public, (default)만 사용 가능 , ()는 생략의 의미
     * */
    // private 은 같은 클래스/객체 내부에서만 접근 가능 0
    private String kinds;
    private int hp;

    public void setHp(int hp) {
        if (hp > 0) {
            this.hp = hp;
            System.out.println("  양수값이 입력되어 몬스터의 체력을 입력 값으로 변경 ");
        } else {
            this.hp = 0;
            System.out.println(" 0이하의 값이 입력되어 몬스터의 체력을 0으로 변경");

        }
    }
    public int gethp()
    {
        return  this.hp;
    }

    public void setInfo(String info) {

         this.kinds = info;
    }

    public String getInfo() {

        return this.kinds;
    }
}
