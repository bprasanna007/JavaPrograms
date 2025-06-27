package io.prasana;

public class Main {

    public static void main(String[] args) {
        Happynumber happy = new Happynumber();

        System.out.println("is 1 happy = " + happy.isHappyNumber(1));
        System.out.println("is 2 happy = " + happy.isHappyNumber(2));
        System.out.println("is 7 happy = " + happy.isHappyNumber(7));
        System.out.println("is 19 happy = " + happy.isHappyNumber(19));
        System.out.println("is 28 happy = " + happy.isHappyNumber(28));
        System.out.println("is 45 happy = " + happy.isHappyNumber(45));
        System.out.println("is 63 happy = " + happy.isHappyNumber(63));
        System.out.println("is 100 happy = " + happy.isHappyNumber(100));
        System.out.println("is 111 happy = " + happy.isHappyNumber(111));
        System.out.println("is 4 happy = " + happy.isHappyNumber(4));
        System.out.println("is 0 happy = " + happy.isHappyNumber(0));
        System.out.println("is 123 happy = " + happy.isHappyNumber(123));
    }
}
