package com.java.class16;

import java.util.Locale;
import java.util.Scanner;

public class FindOccurrenceOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "This is my java program.";
        char c = 'a';
        int count = 0;

        for (int i = 0; i < str.length();  i++) {
            if(str.toLowerCase().charAt(i) == c) {
                count++;
            }
        }
        System.out.println(count);
    }
}
