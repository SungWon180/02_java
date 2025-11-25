package selfTest;

import java.util.Scanner;

public class ifElseif2 {


  public void selfElseif2(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("키를 입력해 주세요.");
    double height = scanner.nextDouble();
    System.out.println("몸무게를 입력해 주세요.");
    double weight = scanner.nextDouble();

    double heightM = height / 100.0;
    double bmi = weight / (heightM * heightM);

    if(bmi < 18.5) {
      System.out.println("저체중");
    } else if(bmi <= 22.9) {
      System.out.println("정상");
    } else if(bmi <= 24.9) {
      System.out.println("과체중");
    } else {
      System.out.println("비만");
    }
  }
}
