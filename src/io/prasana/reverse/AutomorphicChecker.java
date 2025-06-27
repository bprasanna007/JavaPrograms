package io.prasana.reverse;

import java.util.Scanner;

public class AutomorphicChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int a = num * num;
        int temp = num;
        int power = 1;


        while (temp > 0) {
            power *= 10;
            temp /= 10;
        }


        if (a % power == num) {
            System.out.println(num + " is an Automorphic Number.");
        } else {
            System.out.println(num + " is NOT an Automorphic Number.");
        }

        sc.close();
    }
}

