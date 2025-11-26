package com.ohgiraffers.section02.encapsulation.problem1;

/* 객체의 필드에 직저 접근을 하면 발생하는 문제점*/
public class Application
{
    public static void main(String[] args)
    {
        Monster monster1 = new Monster();
        monster1.name = "드라큘라";
        monster1.hp = 200; // Monster 객체의 필드에 직접 접근
        System.out.println("monster1.name = " + monster1.name);
        System.out.println("monster1 hp : " + monster1.hp);

        Monster monster2 = new Monster();
        monster2.name = "프랑켄슈타인";
        monster2.setHp(300); // Monster 객체의 필드에 간접적인 접근 ,
        System.out.println("monster2 name : " + monster2.name);
        System.out.println("monster2 hp : " + monster2.hp);

        Monster monster3 = new Monster();
        monster3.name = "미이라";
        /* hp는 절대 음수 값일 수 없다
        *-> hp 필드에 직접 접근이 가능하기 때문에
        *   음수가 대입되는 것을 막을 수  없는 문제가 발생한다 (통제 불가)
        * -> 일단 간덥 접근 방법으로 수정하겠다
        * */
        //monster3.hp = -400;
        monster3.setHp(-400);

        System.out.println("monster3 name : " + monster3.name);
        System.out.println("monster3 hp : " + monster3.hp);
    }
}
