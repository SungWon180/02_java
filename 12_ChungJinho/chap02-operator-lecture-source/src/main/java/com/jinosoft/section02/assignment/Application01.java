package com.jinosoft.section02.assignment;

public class Application01 {
  public static void main(String[] args) {
    /* 증가/감소 연산자
    *  - ++, -- 단항 연산자
    * -  */

    int num = 20;

    System.out.println("====== 전위 연산자 ======");
    System.out.println("num: " + num);
    System.out.println("++num: " + (++num));
    System.out.println("num: " + num);
    System.out.println("--num: " + (--num));
    System.out.println("num: " + num);

    System.out.println("====== 후위 연산자 ======");
    System.out.println("num: " + num);
    System.out.println("num++: " + (num++));
    System.out.println("num: " + num);
    System.out.println("num--: " + (num--));
    System.out.println("num: " + num);

    int result = (num++) * 3;
    System.out.println("result = " + result);
    System.out.println("num: " + num);
    
    int a = 3;
    int b = ++a + 5;
    int c = b-- + a + 1;
    int result1 = a++ + b-- - --c;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);

    System.out.println("result = " + result1);

  }
}
