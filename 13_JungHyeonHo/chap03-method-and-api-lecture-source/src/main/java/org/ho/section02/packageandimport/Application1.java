package org.ho.section02.packageandimport;

public class Application1 {
  public static void main(String[] args) {
    // 패키지명 + 클래스명 == 실제 클래스명

    // 다른 패키지에 존재하는 클래스를 가져와서 사용하려면
    // 어디에 위치한 클래스인지 패키지명 + 클래스명을 모두 명시
    org.ho.section01.method.Calculator calculator
        = new org.ho.section01.method.Calculator();

    System.out.println("add: "+calculator.add(10,20));
    System.out.println("sub: "+calculator.sub(55,20));
    System.out.println("안녕하세요. 정현호입니다!");
     for(int i=0;i<5;i++){
       System.out.println("안녕하세요 저는 "+i+"번째 정현호입니다!");
     }
  }
}
