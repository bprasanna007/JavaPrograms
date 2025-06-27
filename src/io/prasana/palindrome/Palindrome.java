package io.prasana.palindrome;

public class Palindrome {
    boolean isValid(int number) {
        if (number < 0) {
            return false;
        } else if (number < 10) {
            return true;
        } else {
            int reversedNumber = reverseTheNumber1(number);
            System.out.println(reversedNumber);
            return reversedNumber == number;
        }
    }

    private int reverseTheNumber(int number) {
        int reversedNumber;
        int reminder = number % 10;
        int quotient = number / 10;

        reversedNumber = reminder * 10;

        while (quotient > 10) {
            reminder = quotient % 10;

            quotient = quotient / 10;

            reversedNumber = ((reversedNumber + reminder) * 10);
        }
        reversedNumber = reversedNumber + quotient;

        return reversedNumber;
    }

    private int reverseTheNumber1(int number) {
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        return reversed;
    }

}
