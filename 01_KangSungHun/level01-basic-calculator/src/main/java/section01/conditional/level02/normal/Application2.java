package section01.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("무게를 입력해 주세요.");
    double weight = sc.nextDouble();
    System.out.println("신장을 입력해 주세요.");
    double height = sc.nextDouble();

    double BMI = weight / (height * height);

    if(BMI < 20) {
      System.out.println("당신은 저체중입니다.");
    } else if (BMI < 25) {
      System.out.println("당신은 정상체중입니다.");
    } else if (BMI < 30) {
      System.out.println("당신은 과체중입니다.");
    } else {
      System.out.println("당신은 비만입니다.");
    }



  }
}
