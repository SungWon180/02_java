package com.ohgiraffers.section02.variable;

public class Application3 {
    public static void main(String[] Args){
        /*변수 사용 목적
        *
        *
        * */
        // 1. 값의 의미 부여
        // 100만, 20만중 어떤게 급여? 보너스?
        System.out.println(
                "보너스를 포함한 급여 : " + (1_000_000 + 200_000) + "원"
    );

        /*의미 부여*/
        int salary = 200_000;
        int bonus = 1_000_000;
        System.out.println(
                "보너스를 포함한 급여 : " + (bonus + salary) + "원"
        );


        // 2. 일괄수정
        System.out.println("1번 고객에게 포인트 100 포인트 지급했습니다.");
        System.out.println("2번 고객에게 포인트 100 포인트 지급했습니다.");
        System.out.println("3번 고객에게 포인트 100 포인트 지급했습니다.");
        System.out.println("4번 고객에게 포인트 100 포인트 지급했습니다.");
        System.out.println("5번 고객에게 포인트 100 포인트 지급했습니다.");
        System.out.println("6번 고객에게 포인트 100 포인트 지급했습니다.");
        System.out.println("7번 고객에게 포인트 100 포인트 지급했습니다.");
        System.out.println("8번 고객에게 포인트 100 포인트 지급했습니다.");
        System.out.println("9번 고객에게 포인트 100 포인트 지급했습니다.");
        System.out.println("10번 고객에게 포인트 100 포인트 지급했습니다.");

        // 지급 포인트를 200으로 변경 (변수 사용)
        int point = 200;

        System.out.println(
                "1번 고객에게 포인트를 " +point+ "포인트 지급했습니다."
        );
        System.out.println(
                "1번 고객에게 포인트를 " +point+ "포인트 지급했습니다."
        );
        System.out.println(
                "1번 고객에게 포인트를 " +point+ "포인트 지급했습니다."
        );


        // 3. 시간에 따라 변하는 값을 저장할 수 있음

        int sum = 0;
        System.out.println(
                "sum =" + sum
        );

        sum = sum + 200;
        System.out.println("sum =" + sum);

        sum = sum + 400;
        System.out.println("sum =" + sum);

    }
}
