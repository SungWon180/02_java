package com.mycompany.section01.array.level04.advanced;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application2 {

  public static void main(String[] args) {

    /* 숫자 야구게임 만들기
     * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
     * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
     * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
     * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
     *
     * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
     * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
     *
     * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
     * 횟수는 차감하지 않는다.
     *
     * -- 프로그램 예시 (난수 7416 의 경우) --
     *
     * 10회 남으셨습니다.
     * 4자리 숫자를 입력하세요 : 1234
     * 아쉽네요 0S 2B 입니다.
     * 9회 남으셨습니다.
     * 4자리 숫자를 입력하세요 : 5678
     * 아쉽네요 0S 2B 입니다.
     * 8회 남으셨습니다.
     * 4자리 숫자를 입력하세요 : 7416
     * 정답입니다.
     * */

    int[] collectNum = new int[4];
    char[] inputCharNum = new char[4];
    int[] inputNum = new int[4];

    // 중복없는 난수 생성
    Random rand = new Random();

    for (int i = 0; i < collectNum.length; i++) {
      collectNum[i] = rand.nextInt(9);

      for (int j = 0; j < i; j++) {
        if (collectNum[j] == collectNum[i]) {
          i--;
          break;
        }
      }
    }

    Scanner sc = new Scanner(System.in);

    // 검증용 출력 함수
    System.out.println("테스트용 정답 미리 보기 : " + Arrays.toString(collectNum));

    int chance = 10;

    for (int count = 0; count < chance; count++) {
      int remainChance = chance - count;
      System.out.println(remainChance + "회 남으셨습니다.");
      System.out.print("네자리 숫자를 입력하세요 : ");

      String input = sc.nextLine();
      inputCharNum = input.toCharArray();

      // 4자리 정수가 아니면 횟수 다시 돌아가기
      // array의 칸중에 null인 값이 있다면 돌아가게 할려고 했는데
      int length = inputCharNum.length; // 애초에 3자리 넣으면 길이가 3으로 뜨네, null은 길이에 포함 안됨
      if (length != 4) {
        System.out.println("네자리의 정수를 입력해야 합니다");
        count--; // 잘못 입력하면 횟수 감소 안해야하니까 카운트 늘어난거 반대로 줄여줘서 반복
        continue;
      }

      // 맨처음에 입력한 숫자를 string으로 받아서 4개로 쪼개는게 아니라 그냥 숫자로 나눠서 받는 방법이 있나?? - 질문 해봐야지
      // 바로 숫자로 나눠서 하는 방법은 우선 없음, 하려면 숫자로 나누고 나머지를 입력해야하는데 더 번거로움

      // 대신 charArray를 굳이 int로 변환 한 후에 비교하지 말고, 아래 숫자 비교할때 바로바로 비교하면 더 간단해짐
      for (int i = 0; i < length; i++) {
        inputNum[i] = (int) inputCharNum[i] - 48;
      }

      // 숫자 비교, 입력할 때마다, strike, ball 카운트 초기화
      int strike = 0;
      int ball = 0;

      for (int i = 0; i < inputNum.length; i++) {
        for (int j = 0; j < collectNum.length; j++) {
          if (inputNum[i] == collectNum[j]) {
            if (i == j) {
              strike++;
            } else {
              ball++;
            }
          }
        }
      }

      if (strike == 4) {
        System.out.println("정답 입니다");
        return;
      } else {
        System.out.println("아쉽네요 " + strike + "S " + ball + "B 입니다");
      }

      if (count == chance - 1) {
        System.out.println(chance + "번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");
      }

    }

  }
}

