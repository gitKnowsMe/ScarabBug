package com.java.class08;

import java.util.Scanner;

public class LogicalOperator01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println("Number is divisible by 5");
            System.out.println("Number is not divisible by 5");
        }
    }
}
