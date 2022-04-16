package com.java.class07;

import java.util.Scanner;

public class HomeworkVowelOrNot7 {
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
                    break;
                default:
                    System.out.println("This letter is a consonant!");
            }
        }
    }
}


