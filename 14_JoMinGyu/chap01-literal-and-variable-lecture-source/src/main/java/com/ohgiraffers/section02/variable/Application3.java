package com.ohgiraffers.section02.variable;

public class Application3 {
  public static void main(String[] args) {
    System.out.println("보너스를 포함한 급여 : " + (1_000_000 + 200_000) + "원");

    int salary = 200_000;
    int bonus = 1_000_000;
    System.out.println("보너스를 포함한 급여 : " + (bonus + salary) + "원");


  }
}
