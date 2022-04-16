package com.java.class07;

import java.util.Scanner;

public class SwitchNrDaysAMonth {
    public static void main(String[] args) {
        System.out.println("Please enter a month");
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();

        switch (month){
            case "January":
                System.out.println("31");
                break;
            case "February":
                System.out.println("28/29");
            case "march":
                System.out.println("31");
                break;
            case "April":
                System.out.println("30");
                break;
            case "May" :
                System.out.println("31");
                break;
            case "June":
                System.out.println("30");
                break;
            case "july":
                System.out.println("31");
                break;
            case "August":
                System.out.println("31");
                break;
            case "September":
                System.out.println("30");
                break;
            case "October":
                System.out.println("31");
                break;
            case "November":
                System.out.println("30");
                break;
            case "December":
                System.out.println("31");
            default:
                System.out.println("You entered wrong data");


        }

    }

}
