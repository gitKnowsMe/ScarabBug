package com.java.class14;

import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello World";
        String str3 = "Hello World! Welcome to DevX!";



        //1. Check equality of two strings!!!
        System.out.println("1. Equality " + str1.equals(str2));
        System.out.println(" ==============================================================");

        //2. Check equality of two strings ignoring case.
        System.out.println("2. Equality ignoring case " + str1.equalsIgnoreCase(str2));
        System.out.println(" ==============================================================");

        //3. Check one string contains another string.
        String str2LowerCase = str2.toLowerCase();
        String str3LowerCase = str3.toLowerCase();
        System.out.println("3. Contains " + str1.contains(str1));
        System.out.println("3.1 Contains " + str2LowerCase.contains(str3LowerCase));
        System.out.println("3. ==============================================================");

        //4. Changing the case of string.
        System.out.println("4. Uppercase " + str1.toUpperCase());
        System.out.println("4. Lowercase " + str2.toLowerCase());
        System.out.println(" ==============================================================");

        // If we want to check one String case then we have to change both Strings
        //   in the same case, and then check contains, so it will only check contains of both.

        System.out.println("4. " + str3.toLowerCase().contains (str2.toLowerCase()));
        System.out.println(" ==============================================================");

        //5. Find index of character.
        System.out.println("5. Index of character is " + str1.lastIndexOf('W'));
        System.out.println(" ==============================================================");

        //6. Find character at index
        System.out.println("6. Index of Char: " + str1.charAt(0));
        // Last index of character.
        System.out.println("6. Last index of Char: " + str3.lastIndexOf('l'));
        System.out.println(" ==============================================================");

        //7. Length of String
        System.out.println("7. Length of String " + str1.length());
        System.out.println("7. Length of String " + str3.length());
        System.out.println(" ==============================================================");

        //8. Empty and Blank
        str1 = "             ";
        str3 = "d";
        System.out.println("8. Empty : " + str1.isEmpty());
        System.out.println("8. Empty : " + str3.isEmpty());
        System.out.println("8. Blank : " + str1.isBlank());
        System.out.println("8. Blank : " + str3.isBlank());


                                              // IMPORTANT METHODS

        //9. Replace & ReplaceAll
        str1 = "Welcome User";
        str3 = "Devx";
        System.out.println(str1.replace("User", str3));


        System.out.println(str1);
        System.out.println("Please enter your name: ");
        System.out.println(str1.replace("User" , str3));
        System.out.println(" ==============================================================");

        //10. Format
        str1 = " Welcome %s, Welcome %s";
        System.out.println("10. Format: " + String.format(str1 , "Eugene", "eBay"));

        //11. Substring

        //12. Split
        // 12. Split - at the space
        str1 = "Welcome to java class!";
        String[] words = str1.split(" ");
        System.out.println("12. Split " + words[3]+words[0]);
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);

    }
}

