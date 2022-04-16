package com.java.class08;

import java.util.Scanner;

public class MaximumOutOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter three numbers to find out the maximum!");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("max is " + num1);
        } else if (num2 > num3) {
            System.out.println("max is " + num2);
        } else {
            System.out.println("max is " +num3);
        }
    }
}