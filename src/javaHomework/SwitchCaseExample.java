package javaHomework;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the chosen month!");
        String month = sc.next();

        switch (month){
            case "January":
                System.out.println("Is the first Month of the year!");
                break;
            case "March":
                System.out.println("Is the third month of the year!");
                break;
            case "April":
                System.out.println("Is the fourth month of the year!");
                break;
            case "May":
                System.out.println("Is the fifth month of the year!");
                break;
            case"June":
                System.out.println("Is the sixth month of the year!");
                break;
            case "July":
                System.out.println("Is the seventh month of the year!");
                break;
            case "August":
                System.out.println("Is the eight moth of the year!");
                break;
            case "September":
                System.out.println("is the ninth month of the year!");
                break;
            case "October":
                System.out.println("Is the tenth month of the year!");
                break;
            case "November":
                System.out.println("Is the eleventh month of the year!");
            case "December":
                System.out.println("Is the twelfth month of the year!");

        }
    }
}
