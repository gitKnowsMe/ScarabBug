package com.java.class11;

import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int j = 10;

        while (i <= num) {
            System.out.println( i + 11  );
            System.out.println(j  - 10);
        i++;
        j--;
        }
    }
}