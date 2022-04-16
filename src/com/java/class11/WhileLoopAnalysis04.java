package com.java.class11;

import java.util.Scanner;

public class WhileLoopAnalysis04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int limit= sc.nextInt();

        while ( i <= limit){
            System.out.println( 11- i);
            i++;

        }
    }
}
