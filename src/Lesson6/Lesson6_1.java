package Lesson6;

import java.util.Scanner;

public class Lesson6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numbers = -1;
        int currentNumber;
        do {
            currentNumber = scanner.nextInt();
            sum += currentNumber;
            numbers++;
        } while (currentNumber != 0);
        System.out.println("Sum: " + sum + ", Number of digits: " + numbers);

    }

}
