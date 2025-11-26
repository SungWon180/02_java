package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster 
{
    String name;
    int hp;
    
    public void setHp(int hp)
    {
        if(hp > 0)
        {
           this.hp = hp; // this. = 참조 변수 - 만들어진 인스턴스의 주소를 참조하는 참조형변수
        // 생성된 객체가 자신을 참조할때 사용 (자신을 3인칭으로 부르듯)
            System.out.println("  양수값이 입력되어 몬스터의 체력을 입력 값으로 변경 ");
            }
        else
        {
            this.hp = 0;
            System.out.println(" 0이하의 값이 입력되어 몬스터의 체력을 0으로 변경" );

        }
    }
}
