package selfTest;

import java.util.Scanner;

public class ifTest {

  public void selfTestIf() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("몇 살인지 입력해 주세요.");
    int input = scanner.nextInt();

    if(input >= 18) {
      System.out.println("성인입니다.");
    }

  }
}
