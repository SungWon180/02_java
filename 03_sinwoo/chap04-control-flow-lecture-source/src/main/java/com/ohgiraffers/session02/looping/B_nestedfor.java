package com.ohgiraffers.session02.looping;

public class B_nestedfor {

    public void printTable(){

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public void printGooGooDan(){
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                System.out.println(i + "x" + j + "=" + i*j);
            }
        }
    }

    public void printTriangleStar(){

        System.out.print("층 수 입력: ");
        int num = new java.util.Scanner(System.in).nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }




}
