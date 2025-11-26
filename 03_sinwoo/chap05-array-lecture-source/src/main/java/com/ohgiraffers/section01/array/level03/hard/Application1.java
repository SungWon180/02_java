package com.ohgiraffers.section01.array.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("홀수인 양의 정수 입력 : ");
        int input = sc.nextInt();

        if (input <= 0 || input % 2 == 0){
            System.out.print("양수 혹은 홀수만 입력 : ");
            return;
        }

        int[] arr = new int[input];
        int mid = input/2;
        int cnt = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i < mid){
                arr[i] = cnt++;
            }else{
                arr[i] = cnt--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
