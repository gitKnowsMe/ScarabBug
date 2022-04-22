package com.java.class18;

import java.util.Scanner;

public class MergeTwoWords {
    public static void main(String[] args) {
        /**
         * Merge two words with three characters one by one and print them
         * if words have more than three characters print Error message "Incorrect input! Cannot merge".
         *
         * ex
         * "ice", "sea"
         *
         *
         * output:
         * isceae
         *
         * ex2:
         * "Hot", "Day"
         *
         * output:
         * HDoaty
         *
         */
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        System.out.println(printMerge(word1, word2));
    }
    static String printMerge(String word1, String word2) {
        String mergeString="";
        if(word1.length() > 4 || word2.length()>4){
            System.out.println("Invalid Input");
        }else{
            for(int i=0; i<word2.length(); i++){
                mergeString = mergeString + word1.charAt(i) + word2.charAt(i);
            }
        }
        return mergeString;
    }
}



