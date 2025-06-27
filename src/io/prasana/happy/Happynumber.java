package io.prasana.happy;

public class Happynumber {
    public static void main(String[] args) {

        int x = 19;
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
        if (happy == 1) {
            System.out.println("this is happy number " + happy);
        } else {
            System.out.println("this is not happy number" + happy);
        }
    }

}

