package io.prasana.amstrong;

public class Armstrong {

    public boolean isValid(int number) {

        int armStrongNum = 0, reminder;
        int inputNumber = number;
        while (number > 0) {
            reminder = number % 10;
            number = number / 10;
            armStrongNum = armStrongNum;


        }

        if (armStrongNum == inputNumber) {
            return true;
        } else {
            return false;
        }
    }

    private static int powerTheNumber(int base, int power) {
        return base * base * base * base;
    }
}
