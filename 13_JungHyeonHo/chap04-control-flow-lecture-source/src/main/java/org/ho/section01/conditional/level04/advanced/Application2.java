package org.ho.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application2 {
  public static void main(String[] args) {
    System.out.print("월 급여 입력 : ");
    Scanner sc = new Scanner(System.in);
    int sal = sc.nextInt();
    System.out.print("매출액 입력 : ");
    int earnM = sc.nextInt();
    double bonus =0;
    if(earnM>=50000000) bonus=0.05;
    else if(earnM>=30000000) bonus=0.03;
    else if(earnM>=10000000) bonus=0.01;
    System.out.println("======================\n" +
        "매출액 : "+earnM+"\n"+
        "보너스율 : " + (int)(bonus*100)+"%"+"\n"+
        "월 급여 : "+sal+"\n"+
        "보너스 금액 : "+(int)(sal*bonus)+"\n"+
        "======================\n"+
        "총 급여 : " + (int)(sal+earnM*bonus)
        );
  }
}
