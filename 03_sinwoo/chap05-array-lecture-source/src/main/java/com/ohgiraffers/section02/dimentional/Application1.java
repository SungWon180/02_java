package com.ohgiraffers.section02.dimentional;

public class Application1 {

    public static void main(String[] args) {
        int[][] arr = new int[3][4];

        // for문을 이용해서 배열의 모든 원소 참조
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
            }
        }

    }
}
