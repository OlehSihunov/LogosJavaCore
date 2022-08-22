package Lesson6;

import java.util.Scanner;

public class Lesson6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumInRange = 0;
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        for (int i = firstNumber; i <= secondNumber; i++) {
            sumInRange += i;
        }
        System.out.println("Sum for range ["
                + firstNumber + ":"
                + secondNumber + "] : "
                + sumInRange);

    }

}
