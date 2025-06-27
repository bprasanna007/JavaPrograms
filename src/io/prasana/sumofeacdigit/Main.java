package io.prasana.sumofeacdigit;

public class Main {
    public static void main(String[] args) {
        Sum sum = new Sum();

        System.out.println("1234 → " + sum.reduceToSingleDigit(1234));
        System.out.println("9875 → " + sum.reduceToSingleDigit(9875));
        System.out.println("9999 → " + sum.reduceToSingleDigit(9999));
        System.out.println("5 → " + sum.reduceToSingleDigit(5));
        System.out.println("11111 → " + sum.reduceToSingleDigit(11111));
        System.out.println("0 → " + sum.reduceToSingleDigit(0));
        System.out.println("1 → " + sum.reduceToSingleDigit(1));
        System.out.println("19 → " + sum.reduceToSingleDigit(19));
        System.out.println("1001 → " + sum.reduceToSingleDigit(1001));
        System.out.println("8888 → " + sum.reduceToSingleDigit(8888));
    }
}
