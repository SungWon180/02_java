package com.ohgiraffers.section01.polymorphism;

public class Goat extends Animal{

  @Override
  public void eat() {
    System.out.println("염소는 풀을 뜯어 먹습니다.");
  }

  @Override
  public void move() {
    System.out.println("염소는 절벽을 오르내립니다.");
  }

  @Override
  public void sleep() {
    System.out.println("염소는 옆으로 자빠져 잡니다.");
  }

  public void heading(){
    System.out.println("염소는 박치기를 합니다.");
  }

}
