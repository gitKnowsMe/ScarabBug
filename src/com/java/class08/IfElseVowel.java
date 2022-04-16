package com.java.class08;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class IfElseVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your character.");
        char userInput = sc.next().charAt(0);
        if (userInput == 'a' || userInput ==  'e' || userInput =='i'|| userInput == 'o'||  userInput =='u'){
            System.out.println("vowel");
        }else{
            System.out.println("not vowel");
        }
    }
}
