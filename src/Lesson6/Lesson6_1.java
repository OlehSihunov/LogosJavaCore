package Lesson6;

import java.util.Scanner;

public class Lesson6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        int sum = 0;
//        int numbers = -1;
//        int currentNumber;
//        do {
//            currentNumber = scanner.nextInt();0
//            sum+=currentNumber;
//            numbers++;
//        } while (currentNumber != 0);
//        System.out.println("Sum: " + sum + ", Number of digits: " + numbers);


//        int sumInRange=0;
//        System.out.print("Enter first number: ");
//        int firstNumber = scanner.nextInt();
//        System.out.print("Enter second number: ");
//        int secondNumber = scanner.nextInt();
//        for (int i = firstNumber; i <= secondNumber; i++) {
//            sumInRange+=i;
//        }
//        System.out.println("Sum for range ["
//                + firstNumber + ":"
//                + secondNumber + "] : "
//                + sumInRange);

        int currentNumber;
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            currentNumber = scanner.nextInt();
            if(currentNumber > 0) {
                positive++;
            } else if(currentNumber < 0) {
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
