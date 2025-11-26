package com.ohgiraffers.section02.encapsulation.problem3;


public class Application
{
    public static void main(String[] args)
    {
        Monster monster1 = new Monster();


        monster1.setInfo("드라큘라");
        monster1.setHp(200);

        System.out.println("monster1.name = " + monster1.getInfo());
        System.out.println("monster1 hp : " + monster1.gethp());

        Monster monster2 = new Monster();

        monster2.setInfo("프랑켄슈타인");
        monster2.setHp(300);

        System.out.println("monster2 name : " + monster2.getInfo());
        System.out.println("monster2 hp : " + monster2.gethp());

        Monster monster3 = new Monster();

        monster3.setInfo("미이라") ;


        monster3.setHp(-400);

        System.out.println("monster3 name : " + monster3.getInfo());
        System.out.println("monster3 hp : " + monster3.gethp());
    }
}
