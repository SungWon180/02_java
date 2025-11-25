package com.my.section03.branching;

public class A_break {
  /* 분기문 : 반복문(for, while) 수행 중 멈추거나 다음 반복으로 넘어가게 하는 구문 */

  public void testSimpleBreakStatement(){
    /* break는 가장 인접한 반복문을 멈춤*/
    
    int sum = 0; // 합계 누적용 변수 선언 및 초기화
    
    int i = 1; 
    while(true){  // 무한루프(무한반복..)
      sum += i;
      i++;

      if(i > 100) break; // 분기문
    }
    System.out.println("sum = " + sum); // break문이 없으면 언리처블 코드가됨
  }

  /* 인접한 반복문 break 여부 확인하기 */
  public void testSimpleBreakStatement2(){
    for(int dan = 2; dan <= 9; dan++){
      if(dan > 5)break;

      for(int su = 1; su <= 9; su++){
        if(su > 5) break; // 인접한 반복문만 멈춤.
        System.out.printf("%d * %d = %d ", dan, su, dan);
      }

      System.out.println(); // 줄바꿈
    }
  }

  /* 중첩 반복문 내에서 break문 사용 시 이름을 지정하면
  *  같은 이름의 for문까지 jump하여 멈추게 할 수 있다. */
  public void testJumpBreak(){

    lable: //for(;;)에 대한 이름 지정
    for(;;){ // 무한 루프
      for (int i = 0; i < 10; i++) {
        System.out.println(i);

        if(i == 5) break lable;
      }
    }
  } // 많이 안씀
}
