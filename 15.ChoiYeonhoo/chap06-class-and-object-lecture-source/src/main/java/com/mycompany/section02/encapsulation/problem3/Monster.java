package com.mycompany.section02.encapsulation.problem3;

public class Monster {
  /* 문제 원인 : 객체 필드를 직접 접근하는 것이 문제다.
  * 해결방법 : 외부 클래스나 외부 객체에서 직접 접근 자체를 차단
  *  -> 접근 제어자(접근 제한자) : private, default, protected, public
  *
  * 단, 클래스 선언시에는, public이랑 (default)만 선언 가능
  * */

  // private 은 같은 클래스/객체 내부에서만 접근 가능
  private String kinds;
  private int hp;

  public void setHp(int hp) {
    if(hp > 0){
      this.hp = hp;
      System.out.println("양수 값이 입력되어 몬스터의 체력을 입력값으로 변경");
    }
    else {
      this.hp = 0;
      System.out.println("0 이하의 값이 입력되어 몬스터의 체력을 0으로 변경");
    }
  }

  public int getHp() {
    return this.hp;
  }

  public void setInfo(String info){
    this.kinds = info;
  }

  public String getInfo(){
    return this.kinds;
  }

}

