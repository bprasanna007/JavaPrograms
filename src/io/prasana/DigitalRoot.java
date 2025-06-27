package io.prasana;

import java.util.Scanner;

public class DigitalRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter a number: ");
        int number = scanner.nextInt();

        while (number >= 10) {
            int sum = 0;
            int temp = number;

            while (temp > 0) {
                sum += temp % 10;
                temp = temp / 10;
            }

            number = sum;
        }

        System.out.println(" Digital Root: " + number);
        scanner.close();
    }
}
