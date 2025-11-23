package com.ohgiraffers.section03.math;

public class Application1 {

    /* Java API(Apllication Programming Interface)
    *  - Java에서 만들어서 제공하는 기능을 이용하는 방법(문법)
    * */

    public static void main(String[] args) {

        /* jAVA.Lang.Math 클래스 활용하기
       - Math의 모든 필드, 메서드는 static
       -> Math.필드명, Math.메서드명() 으로 원하는 기능 호출 가능
        * */

        /*1. Math.PI: 원주율 */
        System.out.println("PI = " + Math.PI);

        /*2. Math.abs(값): 절대 값 */
        System.out.println("-30의 절대 값 : = " + Math.abs(-30));

        /*3. Math.Max(값 1, 값 2) : 둘 중 큰 값을 반환 */
        System.out.println("10, 20 중 큰 값 : = " + Math.max(10, 20));

        /*4. Math.Min(값 1, 값 2) : 둘 중 작은 값을 반환 */
        System.out.println("10, 20 중 작은 값 : = " + Math.min(10, 20));

        /*5. Math.Random() : 0.0(00000) <= x < 1.0(000000) 범위의 난수를 하나 반환 (double) */
        System.out.println("난수 발생 : " + Math.random());


    }
}
