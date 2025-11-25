package com.ohgiraffers.section03.branching;

public class A_break {

  public void testSimpleBreakStatement() {
    int sum = 0;
    int i = 1;

    while(true) {
      sum += i;
      i++;

      if(i>100) break;
    }

    System.out.println("sum = " + sum);
  }

  public void testSimpleBreakStatement2() {
    for(int dan = 2; dan <= 9; dan++) {
      for(int su = 1; su <= 9; su++) {
        if(su > 5) break;
        System.out.printf("%d * %d = %d ", dan, su, dan * su);
      }
      System.out.println();
    }
  }

  public void testJumpBreak() {

    label:
    // for(;;)에 대한 이름 지정
    for (; ; ) { // 무한 루프(무한 반복)
      for (int i = 0; i < 10; i++) {
        System.out.println(i);

        if (i == 5) break label;
      }
    }
  }
}
