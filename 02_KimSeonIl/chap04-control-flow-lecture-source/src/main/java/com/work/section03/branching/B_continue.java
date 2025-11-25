package com.work.section03.branching;

public class B_continue {
    public void testSimpleContinueStatement(){
      /* continue (다음 반복으로 넘어가기 ))*/
      for (int i = 0; i < 10; i++) {
        // i가 짝수일 경우에 다음 반복으로 넘어가기 (for 문은 증감식으로 넘어감)
        if(i % 2==0) continue;
        System.out.println("i = " + i);
      }

  }

//  1~100 까지 출력하기
  // 4의 배수 5의 배수는 제외
  public  void testSimpleContinueStatement2(){
    for (int i = 0; i <= 100; i++) {
      if(i % 4 == 0 || i% 5 == 0)  continue;
        System.out.println("i = " + i);
    }
  }

  /*인접한 반복문 continue 여부 확인하기*/
  public void testSimpleContinueStatement3() {

    for (int dan = 2; dan <= 9; dan++) {
      if (dan == 5) continue;
      for (int su = 1; su <= 9; su++) {

        if (su == 5) continue; // 종료 조건  인접한 반복문만 멈춤ㄲ

        System.out.printf("%d * %d = %d ", dan, su, dan * su);
      }
      System.out.println();// 줄 바꿈
    }
  }

  public void testJumpContinue(){

    label:   // for(;;)에 대한 이름 지정
    for(;;){ // 무한 루프
      for (int i = 0; i < 10; i++) {
        System.out.println("i = " + i);
        if(i == 5) continue label;
      }
    }
  }
}
