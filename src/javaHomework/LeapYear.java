package javaHomework;
import java.util.Scanner;
public class LeapYear {
    public static void main(String [] args) {
        System.out.println(" Please enter to the year you'd like to check if it's leap or not.");
        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();
        if(year % 4 == 0) {
            System.out.println(year + " it's a leap year");
        }else{
            System.out.println(year + " it's a non leap year");
        }
    }
}
