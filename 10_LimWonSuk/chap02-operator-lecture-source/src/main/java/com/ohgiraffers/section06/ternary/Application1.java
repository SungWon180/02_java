package com.ohgiraffers.section06.ternary;

public class Application1 {
    public static void main(String[] args) {
        /* 삼항 연산자
        * 조건식 ?
        * true인경우 :
        * false인 경우 ;
        * */

        int num1 = 10;
        int num2 = -10;

        /* 양수 음수 판별 */
       String result1 = num1 > 0 ? "양수" : "음수"; // true 양수 조건식
 /*       num1은 10

        조건식: num1 > 0 → 10 > 0 → true

        따라서 result1 = "양수"*/

       String result2 = num2 > 0 ? "양수" : "음수"; // true 양수 조건식
/*        num2는 -10

        조건식: num2 > 0 → -10 > 0 → false

        따라서 result2 = "음수"*/

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        char gender1 = '남';
        char gender2 = '여';

        String result3 = (gender1 == '남') ? "남자입니다." : "여자입니다.";
        String result4 = (gender2 == '남') ? "남자입니다." : "여자입니다.";

        System.out.println("result3 = " + result3);
 /*       조건: gender1 == '남'

        gender1은 '남' → 조건이 true

        따라서 "남자입니다." 선택*/

        System.out.println("result4 = " + result4);
/*        조건: gender2 == '남'

        gender2는 '여' → 조건이 false

        따라서 "여자입니다." 선택*/


        System.out.println("============== 삼항 연산자 중첩 사용 ===============");
        int num = 100;
        // 정수의 종류 : 양 / 음 의 정수, 0

        String result =
                (num == 0) ? "0 입니다" : ((num > 0) ? "양수 입니다" : "음수 입니다");


        System.out.println("result = " + result);


    }
}
