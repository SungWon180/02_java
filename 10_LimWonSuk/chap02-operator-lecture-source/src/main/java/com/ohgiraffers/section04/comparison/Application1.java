package com.ohgiraffers.section04.comparison;

public class Application1 {
    public static void main(String[] args) {

        /*비교 연산자
         * - ==, !=, >, <, >=, <=
         * - 비교 연산자 수행 결과는 항상 true / false (boolean)
         * -> 결과가 true / false인 연산식 == 조건식 */

        // 정수 비교

        int inum1 = 10;
        int inum2 = 20;

        System.out.println("inum1과 inum2가 같은지 비교 : " + (inum1 == inum2));
        System.out.println("inum1과 inum2가 같지 않은지 비교 : " + (inum1 != inum2));
        System.out.println("inum1이 inum2보다 큰지 비교 : " + (inum1 > inum2));
        System.out.println("inum1이 inum2보다 크거나 같은지 비교 : " + (inum1 >= inum2));
        System.out.println("inum1이 inum2보다 작은지 비교 : " + (inum1 < inum2));
        System.out.println("inum1이 inum2보다 작은거나 같은지 비교 : " + (inum1 <= inum2));

        double dnum1 = 10.0;
        double dnum2 = 20.0;

        System.out.println("dnum1과 dnum2가 같은지 비교 : " + (dnum1 == dnum2));
        System.out.println("dnum1과 dnum2가 같지 않은지 비교 : " + (dnum1 != dnum2));
        System.out.println("dnum1이 dnum2보다 큰지 비교 : " + (dnum1 > dnum2));
        System.out.println("dnum1이 dnum2보다 크거나 같은지 비교 : " + (dnum1 >= dnum2));
        System.out.println("dnum1이 dnum2보다 작은지 비교 : " + (dnum1 < dnum2));
        System.out.println("dnum1이 dnum2보다 작은거나 같은지 비교 : " + (dnum1 <= dnum2));


        // 컴퓨터 안에서 문자는 숫자다
        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println("ch1과 ch2가 같은지 비교 : " + (ch1 == ch2));
        System.out.println("ch1과 ch2가 같지 않은지 비교 : " + (ch1 != ch2));
        System.out.println("ch1이 ch2보다 큰지 비교 : " + (ch1 > ch2));
        System.out.println("ch1이 ch2보다 크거나 같은지 비교 : " + (ch1 >= ch2));
        System.out.println("ch1이 ch2보다 작은지 비교 : " + (ch1 < ch2));
        System.out.println("ch1이 ch2보다 작은거나 같은지 비교 : " + (ch1 <= ch2));


        /* ==과 !=은 비교 가능하지만 대소비교는 불가능하다. */
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("============== 논리값 비교 ===============");
        System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 == bool2));
        System.out.println("bool1과 bool2가 같지 않은지 비교 : " + (bool1 != bool2));
//System.out.println("bool1이 bool2보다 큰지 비교 : " + (bool1 > bool2));
//System.out.println("bool1이 bool2보다 크거나 같은지 비교 : " + (bool1 >= bool2));
//System.out.println("bool1이 bool2보다 작은지 비교 : " + (bool1 < bool2));
//System.out.println("bool1이 bool2보다 작은거나 같은지 비교 : " + (bool1 <= bool2));



        /* 문자열도 ==과 !=은 비교 가능하지만 대소 비교는 불가능하다. */
        String str1 = "java";
        String str2 = "java";

        System.out.println("============== 문자값 비교 ===============");
        System.out.println("str1과 str2가 같은지 비교 : " + (str1 == str2));
        System.out.println("str1과 str2가 같지 않은지 비교 : " + (str1 != str2));
//System.out.println("str1이 str2보다 큰지 비교 : " + (str1 > str2));
//System.out.println("str1이 str2보다 크거나 같은지 비교 : " + (str1 >= str2));
//System.out.println("str1이 str2보다 작은지 비교 : " + (str1 < str2));
//System.out.println("str1이 str2보다 작은거나 같은지 비교 : " + (str1 <= str2));

        /*str1 == str2 -> true인 이유
         * - "java" == "java" 저장된 문자를 모두 비교 x
         * - str1, str2 변수에 저장된 주소를 비교 O
         * */

        /* 실제 String 값 비교 방법 -> A.equals(B) 이용*/
        String str3 = "구내식당";
        String str4 = new String("구내식당");


        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);
        System.out.println("str3 == str4 -> " + (str3 == str4)); // 주소 비교

        System.out.println(str3.equals(str4)); // 실제 값 비교






    }
}
