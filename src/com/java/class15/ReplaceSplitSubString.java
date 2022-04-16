package com.java.class15;

public class ReplaceSplitSubString {
    public static void main(String[] args) {
        String address = "6614, W Diversey ave, Chicago, IL, 60707";
        String words[] = address.split(",");
        for ( int i = 0; i < address.length(); i++) {
            System.out.println(words[i]);
        }

        System.out.println(address.length());


    }
}
