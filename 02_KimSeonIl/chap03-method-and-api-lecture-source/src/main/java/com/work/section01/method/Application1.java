package com.work.section01.method;

public class Application1 {
  // method == 기능, 동작

  // main() method : java 프로그램 실행 시 jvm이 제일 처음 찾아서 호출하는 메서드
  // 호출이 되면 {} 지정된 동작(코드) 수행
  public static void main(String[] args) {

    System.out.println("main() 메서드 호출");
    /*별도로 선언한 메서드를 호출한다.*/
    Application1 app1 = new Application1();
    app1.MethodA();
    app1.MethodB();
    app1.MethodC();
    System.out.println("main() 메서드 종료");

    int result1 = add(1, 2);
    }//main() end
  /* 별도 메서드 선언, 정의
  * - 메서드 선언 : 접근제어자 반환형 메서드명(매개변수){}
  * - 메서드 정의 : {} 내에 원하는 동작을 코드로 작성
  * */
    public void MethodA(){
      System.out.println("AAAA methodA() 호출 AAA");
      System.out.println("AAAA methodA() 종료 AAA");
    }

    public void MethodB(){
      System.out.println("BBBB methodA() 호출 BBB");
      System.out.println("BBBB methodA() 종료 BBB");
    }

    public void MethodC(){
      System.out.println("CCCC methodA() 호출 CCC");
      System.out.println("CCCC methodA() 종료 CCC");
    }

  public static int add(int a, int b) {
      return a + b;
  }

  }

