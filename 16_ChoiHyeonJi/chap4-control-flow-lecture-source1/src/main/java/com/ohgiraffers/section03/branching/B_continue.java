package com.ohgiraffers.section03.branching;

public class B_continue {
  /*
  * continue (다음 반복으로 넘어가기) 확인하기
  * */

  public void testSimpleContinueStatement(){
    for (int i = 0; i < 10 ; i++) { // continue 넘어가는 곳 i++ 여기로 넘어감
      // i가 짝수일 경우에 다음 반복으로 넘어가기 (for문은 증감식으로 넘어감)
      if (i % 2 == 0) continue;
      System.out.println("i = " + i);

    }
  }

  /* 1 ~ 100 까지 출력
  * 단, 4의 배수 또는 5의 배수는 제외 */
  public void testSimpleContinueStatement2(){
    for (int i = 1; i <= 100; i++) {
      if (i % 4 == 0 || i % 5 == 0) continue;
      System.out.println("i = " + i);
    }
  }

  /* 인접한 반복문 continue 여부 확인 */
  public void testSimpleContinueStatement3(){

    for(int dan = 2; dan <= 9; dan++){

      if(dan == 5) continue;

      for (int su = 1; su <= 9; su++){
        if (su == 5) continue; // 인접한 반복문만 멈춤 .분기문.
        System.out.printf("%d * %d = %d ", dan, su, dan * su);
      }
      System.out.println();
    }
  }

  /* 중첩 반복문 내에서 continue문 사용 시 이름을 지정하면 같은 이름의 for문까지 jump하여 멈추게 할 수 있다. */
  public void testJumpContinue(){
    label: // for(;;)에 대한 이름 지정
    for (;;){ //무한 루프(무한 반복)
      for (int i = 0; i < 10 ; i++) {
        System.out.println(i);

        if (i == 5) continue label;
      }
    }
  }

}
