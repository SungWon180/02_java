package com.ohgiraffers.section01.polymorphism;

public class Application4 {

  public static void main(String[] args) {

    Animal a1 = getAnimal(1); // Animal
    Animal a2 = getAnimal(2); // Tiger
    Animal a3 = getAnimal(3); // Goat
    Animal a4 = getAnimal(4); // Rabbit

    a1.sleep();
    a2.sleep();
    a3.sleep();
    a4.sleep();
  }

  /* 반환형 + 다형성(업캐스팅) */
  public static Animal getAnimal(int num){
    Animal animal = null;

    switch (num){
      case 1 : animal = new Animal(); break;
      case 2 : animal = new Tiger(); break;
      case 3 : animal = new Goat(); break;
      case 4 : animal = new Rabbit(); break;
    }

    return animal;
  }

}
