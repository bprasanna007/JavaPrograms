package io.prasana.fibonacci;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int n = 10;
        System.out.println("Fibonacci number at position " + n + " is: " +fibonacci.fibonacci(n));
    }
}
