package javaHomework;

import java.util.Scanner;

public class IncomeTaxExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert gross income.");

        double salary = sc.nextDouble();
        double stateTax = 4.95d;
        double stateTaxTotal = (salary * stateTax) / 100;

        System.out.println("Illinois State Tax: " + "$" + stateTaxTotal);

        // This is for federal tax:
        double federalTax1 = 0.10;
        double federalTax2 = 0.12;
        double federalTax3 = 0.22;
        double federalTax4 = 0.24;
        double federalConst1 = 1420;
        double federalConst2 = 6220;
        double federalConst3 = 13293;

        double incomeBracket1 = 14200;
        double incomeBracket2 = 54200;
        double incomeBracket3 = 86350;
        double incomeBrackets4 = 164900;
        double incomeBrackets5 = 209425;

        if (salary < incomeBracket1 ) {
            System.out.println("Federal State Tax: " + salary * federalTax1);
        }else if ( salary < incomeBracket2) {
            System.out.println("Federal State Tax: " + "$" + ( salary - federalConst1 ) * federalTax2 );
        } else if (salary > incomeBracket2 && salary < incomeBracket3) {
            System.out.println( "Federal State Tax: " + "$" + ( salary - federalConst2 ) * federalTax3 );
        } else if (salary > 86351 && salary < 164900) {
            System.out.println("Federal State tax: " + "$" + ( salary - federalConst3 ) * federalTax4 );
        } else if ( salary > 164900 && salary < 209425 )
            System.out.println();
        System.out.println();


    }
}
