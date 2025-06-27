package io.prasana.palindrome;

public class Main {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println("is 1221 palindrome = " +palindrome.isValid(1221));
        System.out.println("is 1220 palindrome = " +palindrome.isValid(1220));
        System.out.println("is 121 palindrome = " +palindrome.isValid(121));
        System.out.println("is 153 palindrome = " +palindrome.isValid(153));
        System.out.println("is 7 palindrome = " +palindrome.isValid(7));
        System.out.println("is 0 palindrome = " +palindrome.isValid(0));
        System.out.println("is 10 palindrome = " +palindrome.isValid(10));
        System.out.println("is 11 palindrome = " +palindrome.isValid(11));
        System.out.println("is 17 palindrome = " +palindrome.isValid(17));
        System.out.println("is -10 palindrome = " +palindrome.isValid(-10));
        System.out.println("is 12321 palindrome = " +palindrome.isValid(12321));
        System.out.println("is 123321 palindrome = " +palindrome.isValid(123321));
    }
}
