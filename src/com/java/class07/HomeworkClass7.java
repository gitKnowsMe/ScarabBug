package com.java.class07;

import java.util.Scanner;

public class HomeworkClass7  {
    public static void main(String[] args) {
        System.out.println("Please type in the product.");
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();

        switch ( product ) {
            case "gmail"://google
            case "hangouts"://google
                System.out.println("Company name is Google");
                break;
            case "skype"://microsoft
            case "outlook"://microsoft
                System.out.println("Company name is Microsoft");
                break;
            case "youtube"://facebook
            case "what's up":
                System.out.println("Company name is Meta");
            default:
                System.out.println("The product doesn't exist in this database!");
        }
    }
}
