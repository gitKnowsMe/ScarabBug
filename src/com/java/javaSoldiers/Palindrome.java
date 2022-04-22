package com.java.javaSoldiers;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String str = sc.nextLine();
        if (isPalindrome(str)) {
            System.out.println(" is palindrome ");
        } else {
            System.out.println(" not a palindrome");
        }
    }

    static boolean isPalindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.toLowerCase(Locale.ROOT).equals(rev)) {
            return false;
        }else{
            return true;
        }


    }
}