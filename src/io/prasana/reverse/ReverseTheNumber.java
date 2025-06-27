package io.prasana.reverse;

public class ReverseTheNumber {


    public int reverse(int number) {
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        return reversed;
    }
}
