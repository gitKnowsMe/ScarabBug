package javaHomework;

public class HW_class16resultOfSeries {
    public static void main(String[] args) {
        //Find result of given series 1 + 2 – 3+ 4 + 5 – 6 + 7 + 8 – 9 +10
        int result = 1;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                result = result + i;
            }
        }
        System.out.println(result);
    }
}
