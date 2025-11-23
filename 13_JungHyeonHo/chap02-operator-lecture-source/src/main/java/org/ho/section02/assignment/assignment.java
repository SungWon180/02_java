package org.ho.section02.assignment;

public class assignment {
  public static void main(String[] args) {
    //TIP 대입 연산자
    // -B를 A에 대입하는 연산자
    /**
     * 복합 대입 연산자 (A += | -= | /= | %= B)
     * - A = A+ B
     */
    int num=12;
    System.out.println("num="+num);

    num+=3;
    System.out.println("num="+num); //15

    num-=5;
    System.out.println("num="+num); //10

    num*=2;
    System.out.println("num="+num); //20

    num /=6;
    System.out.println("num="+num); //3

    num %=2;
    System.out.println("num="+num); //1

  }
}
