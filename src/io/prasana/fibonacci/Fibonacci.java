package io.prasana.fibonacci;

public class Fibonacci {

    int fibonacci(int n) {

        int first = 0, second = 1, result = 0;

        for (int i = 2; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }

        return result;

    }
}

