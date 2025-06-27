package io.prasana.harshadnumber;

public class Harshadnumber {

    public boolean Harshadnumber(int number) {
        int sum=0,harshad=number,i;
        while (harshad > 0) {
            i = harshad % 10;
            sum = sum + i;
            harshad /= 10;

        }

        return number % sum == 0;
    }

    }

