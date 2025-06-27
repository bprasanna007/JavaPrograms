package io.prasana.Perfectnumber;


public class Perfectnumber {
    public  boolean isValid(int number) {
        int sum = 0;
        for (int i = 1; i <= number/2; i++) {
            if(isPerfectDivisor(number,i)) {
                sum += i;
            };
        }
        return sum == number;
    }

    private  boolean isPerfectDivisor(int number, int i) {
        return number % i == 0;
    }


}
