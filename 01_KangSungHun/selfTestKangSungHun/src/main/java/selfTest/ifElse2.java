package selfTest;

import java.util.Scanner;

public class ifElse2 {

  public void selfElse2() {

    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    if(input >= 60) {
      System.out.println("합격");
    } else {
      System.out.println("불합격");
    }
  }
}
