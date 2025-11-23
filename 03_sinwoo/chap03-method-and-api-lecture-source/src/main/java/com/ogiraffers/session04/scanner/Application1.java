package com.ogiraffers.session04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        // java.util.Scanner
        // JVM 내에 키보드 입력을 인식하는 입력 장치 생성
        Scanner sc = new Scanner(System.in);

        // 자료형 별 값 입력받기
        String T = sc.next();
        System.out.println("T = " + T);
        sc.nextLine();

        System.out.print("주소 입력 : ");
        String address = sc.nextLine();
        System.out.println("address = " + address);


        // 정수 입력받기
        sc.nextInt();
        // 실수 입력받기
        sc.nextDouble();
    }
}
