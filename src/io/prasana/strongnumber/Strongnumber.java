package io.prasana.strongnumber;

public class Strongnumber {
    public int isStrongnumber(int n) {
        int original = n;
        int reminder;
        int sum = 0;

        while (n != 0) {
            reminder = n % 10;


            int fact = 1;
            int i = 1;
            while (i <= reminder) {
                fact *= i;
                i++;
            }

            sum += fact;
            n = n / 10;
        }


        return (sum == original) ? 1 : 0;
    }
}
