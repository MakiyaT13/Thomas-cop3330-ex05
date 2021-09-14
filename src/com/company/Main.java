/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Makiya Thomas
 */
package com.company;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the first number? ");
        int int1 = input.nextInt();

        System.out.print("What is the second number? ");
        int int2 = input.nextInt();

        int sum, dif, pro, div;
        sum = int1 + int2;
        dif = int1 - int2;
        pro = int1 * int2;
        div = int1 / int2;

        System.out.printf("%d + %d = %d\n", int1, int2, sum);
        System.out.printf("%d - %d = %d\n", int1, int2, dif);
        System.out.printf("%d * %d = %d\n", int1, int2, pro);
        System.out.printf("%d / %d = %d\n", int1, int2, div);
    }
}