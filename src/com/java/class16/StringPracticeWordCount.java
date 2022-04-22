package com.java.class16;

import java.util.Scanner;

public class StringPracticeWordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String wordsIn[] = str.split(" ");
        System.out.println(wordsIn.length);


    }
}
