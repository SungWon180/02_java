package selfTest;

import java.util.Scanner;

public class ifElse {

  public void selfElse1() {

    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    if(input % 2 == 0) {
      System.out.println("짝수");
    } else {
      System.out.println("홀수");
    }
  }
}
