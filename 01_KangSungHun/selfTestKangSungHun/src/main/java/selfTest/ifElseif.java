package selfTest;

import java.util.Scanner;

public class ifElseif {

  public void selfifElseif (){
    Scanner scanner = new Scanner(System.in);
    System.out.println("학점을 입력하세요.");
    int input = scanner.nextInt();

    if(input >= 90) {
      System.out.println("A");
    } else if(input >= 80) {
      System.out.println("B");
    } else if(input >= 70) {
      System.out.println("C");
    } else if(input >= 60) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }
  }
}
