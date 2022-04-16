package com.java.Scrapbook;

import java.util.Locale;
import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a String");
        String input = sc.nextLine();
        String reverse = "";

        for (int i = input.length(); i >= 0; i--) {
            reverse = reverse + input.substring(i, i + 1);

            if (reverse.equals(input)) {
                System.out.println(input + " it  is not palindrome.");
            } else {
                System.out.println(input + " it is a palindrome");


            }
        }
    }
}

