package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        A_for a_for = new A_for();
       // a_for.testSimpleForStatement();
       // a_for.testSimpleForEaxmple1();
      //  a_for.testSimpleForEaxmple2();
       // a_for.testSimpleForEaxmple3();
        //a_for.testSimpleForEaxmple4();
       // a_for.testSimpleForEaxmple5();
        B_nestedFor b_nestedFor = new B_nestedFor();
        // b_nestedFor.printTable();
       // b_nestedFor.printTable2();
        // b_nestedFor.printTwoDan();
        b_nestedFor.printTraingleStar();
    }
}
