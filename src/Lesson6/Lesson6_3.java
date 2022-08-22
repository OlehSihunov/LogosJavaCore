package Lesson6;

import java.util.Scanner;

public class Lesson6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentNumber;
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            currentNumber = scanner.nextInt();
            if (currentNumber > 0) {
                positive++;
            } else if (currentNumber < 0) {
                negative++;
            } else {
                zeros++;
            }
        }
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zeros: " + zeros);
    }

}
