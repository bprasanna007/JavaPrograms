package io.prasana;

public class Happynumber {

    public boolean isHappyNumber(int x) {
        int happy = 0, split, power;

        while (x != 1 && x != 4) {
            happy = 0;
            while (x > 0) {
                split = x % 10;
                x = x / 10;
                power = split * split;
                happy = happy + power;
            }
            x = happy;
        }

        return x == 1;
    }
}
