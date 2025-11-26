package com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal {

  @Override
  public void eat() {
    System.out.println("호랑이는 고기를 뜯어 먹습니다.");
  }

  @Override
  public void sleep() {
    System.out.println("호랑이는 드르렁 코골면서 잡니다.");
  }

  @Override
  public void move() {
    System.out.println("호랑이는 위엄있게 움직입니다.");
  }
  
  public void bite(){
    System.out.println("호랑이는 이빨로 물어 뜯습니다. 앙");
  }
}
