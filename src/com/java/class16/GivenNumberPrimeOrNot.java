package com.java.class16;

import java.util.Scanner;

public class GivenNumberPrimeOrNot {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    boolean primeNum = true;
    int num = sc.nextInt();

    for(int i = 1; i <=num;i++){
        if (num % i == 0)
            System.out.println(i);
    }
}
}
