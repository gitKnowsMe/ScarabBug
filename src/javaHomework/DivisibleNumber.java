package javaHomework;
import java.util.Scanner;
public class DivisibleNumber {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num % 5 == 0) {
            System.out.println("The number you entered is divisible by 5.");
        }else{
            System.out.println("The number you entered is not divisible by 5.");
        }
    }
}
