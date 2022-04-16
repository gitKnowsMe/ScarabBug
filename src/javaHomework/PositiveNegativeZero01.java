package javaHomework;
import java.util.Scanner;
public class PositiveNegativeZero01 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert your number!");
        int num = scan.nextInt();
        if(num == 0) {
            System.out.println("Your number is equal with zero!");
        }else if (num > 0){
            System.out.println("The number you inserted is positive!");
        }else{
            System.out.println("The number you inserted is negative!");
        }
    }
}
