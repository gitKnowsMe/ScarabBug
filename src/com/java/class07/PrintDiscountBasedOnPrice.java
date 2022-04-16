package com.java.class07;

import java.util.Scanner;

public class PrintDiscountBasedOnPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your number");

        int num = sc.nextInt();

        switch ( num ) {

        }


    }

    public static class HomeworkVowelCharacter {
        public static void main(String[] args) {
            System.out.println("Please insert a letter!");
            Scanner sc = new Scanner(System.in);

            String letter = sc.nextLine();
            switch (letter) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println("This letter is a vowel!");
                default:
                    System.out.println("This letter is a consonant!");
            }
        }
    }
}
