package io.prasana.sumofeacdigit;

public class Sum {
    public int reduceToSingleDigit(int a) {
        while (a >= 10) {
            int sum = 0;
            while (a != 0) {
                int reminder = a % 10;
                sum = sum + reminder;
                a = a / 10;
            }
            a = sum;
        }
        return a;
    }
}
