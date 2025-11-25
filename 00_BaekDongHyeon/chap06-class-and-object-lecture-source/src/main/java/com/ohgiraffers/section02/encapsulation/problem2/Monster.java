package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {

  /* name 필드명을 수정(유지보수) 상황이 발생했다고 가정 */
  
  //String name;
  String kinds; // 기존 name을 직접 접근하던 코드에서 모두 오류가 발생함

  int hp;

  public void setHp(int hp){
    if(hp > 0){
      /* this 참조 변수 : 만들어진 인스턴스의 주소를 저장하는 참조형 변수
      * - 생성된 객체가 자신을 참조할 때 사용
      * */
      this.hp = hp;
      System.out.println("양수 값이 입력되어 몬스터의 체력을 입력 값으로 변경");

    } else {
      this.hp = 0;
      System.out.println("0 이하의 값이 입력되어 몬스터의 체력을 0으로 변경");
    }
  }


  public void setInfo(String info){
    //this.name = info;
    this.kinds = info;
  }

  public String getInfo(){
    //return this.name;
    return this.kinds;
  }


}
