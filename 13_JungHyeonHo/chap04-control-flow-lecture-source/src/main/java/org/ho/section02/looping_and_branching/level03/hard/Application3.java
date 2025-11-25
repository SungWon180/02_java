package org.ho.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application3 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("문자열 입력 : ");
    String str = sc.next();
    //영문자 아닌 문자 확인
    for (int i = 0; i < str.length(); i++) {
      if(!Character.isAlphabetic(str.charAt(i))) {
        System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
        return;
      }
    }

    System.out.print("문자 입력 : ");
    char c = sc.next().charAt(0);
    int ans=0;
    for (int i = 0; i < str.length(); i++) {
      if(str.charAt(i)==c) ans++;
    }
    System.out.printf("포함된 갯수 : %d",ans);

  }
}
