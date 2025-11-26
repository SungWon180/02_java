package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal {

  @Override
  public void eat() {
    System.out.println("토끼는 당근을 먹습니다.");
  }

  @Override
  public void move() {
    System.out.println("토끼는 엉덩이를 흔들면서 움직입니다.");
  }

  @Override
  public void sleep() {
    System.out.println("토끼는 웅크리고 잡니다.");
  }

  public void jump(){
    System.out.println("토끼는 깡총 깡총 뜁니다.");
  }
}
