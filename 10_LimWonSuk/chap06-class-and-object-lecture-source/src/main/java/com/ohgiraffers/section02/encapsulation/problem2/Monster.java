package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {
    /* name 필드명을 수정(유지보수) 상황이 발생했다고 가정*/

    // String name;
     String kinds; // 기존 name 을 직접 접근 하던 code에서 모두 에러가 발생함
    int hp;

    public void setHp(int hp) {
        if (hp > 0) {
            this.hp = hp; // this. = 참조 변수 - 만들어진 인스턴스의 주소를 참조하는 참조형변수
            // 생성된 객체가 자신을 참조할때 사용 (자신을 3인칭으로 부르듯)
            System.out.println("  양수값이 입력되어 몬스터의 체력을 입력 값으로 변경 ");
        } else {
            this.hp = 0;
            System.out.println(" 0이하의 값이 입력되어 몬스터의 체력을 0으로 변경");

        }
    }

    public void setInfo(String info) {
       // this.name = info; // 변경한 이름
         this.kinds = info;
    }

    public String getInfo() {
       // return name = info; /// 변경한 이름
        return this.kinds;
    }
}
