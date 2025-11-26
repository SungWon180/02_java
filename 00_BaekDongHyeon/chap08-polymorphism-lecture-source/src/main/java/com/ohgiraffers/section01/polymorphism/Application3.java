package com.ohgiraffers.section01.polymorphism;

public class Application3 {


  public static void main(String[] args) {

    feed(new Animal());
    feed(new Tiger());
    feed(new Goat());
    feed(new Rabbit());
  }

  /* 매개 변수 + 다형성(업캐스팅) */
  public static void feed(Animal animal){
    animal.eat();
  }

  /* 만약 매개 변수 + 다형성(업캐스팅)을 몰랐을 경우
  * -> 모든 타입의 메서드를 오버로딩으로 구현 */
/*
  public void feed(Tiger t){
    t.eat();
  }
  public void feed(Goat g){
    g.eat();
  }
  public void feed(Rabbit r){
    r.eat();
  }
  */
}
