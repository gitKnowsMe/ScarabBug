package javaHomework;


import java.util.Scanner;

public class BloodDonation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter you age ");
        int age = scan.nextInt();
        System.out.println("Enter your weight");
        int weight = scan.nextInt();

        if (age >=18) {
            if(weight >= 50){
                System.out.println("You're eligible");
            }else{
                System.out.println("You're under weight");
            }
        }else{
            if(weight >= 50) {
                System.out.println("You're too young.");
            }else{
                System.out.println("You're totally not eligible");
            }
        }

        //Output
        System.out.println();
    }
}
