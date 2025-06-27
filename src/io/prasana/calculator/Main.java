package io.prasana.calculator;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static void main(String[] args) {
        int a, b;
        System.out.println("***Welcome to my calculator***");
        System.out.println("***what you want to do?***");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("choice 1.Addition");
            System.out.println("choice 2.Subtraction");
            System.out.println("choice 3.Multiplication");
            System.out.println("choice 4.Division");
            System.out.println("choice 5.Quotient");
            System.out.println("choice 6.exit");

            System.out.print("Enter your choice");
            int choice = input.nextInt();


            if (1 == choice) {
                System.out.print("Enter the first number");
                a = input.nextInt();
                System.out.print("Enter the second number");
                b = input.nextInt();
                System.out.println("The sum of two numbers =" + (a + b));

            }
            if (2 == choice) {
                System.out.print("Enter the first number");
                a = input.nextInt();
                System.out.print("Enter the second number");
                b = input.nextInt();
                System.out.println("The difference of two numbers =" + (a - b));
            } else if (3 == choice) {
                System.out.print("Enter the first number");
                a = input.nextInt();
                System.out.print("Enter the second number");
                b = input.nextInt();
                System.out.println("The multiplication of two numbers =" + (a * b));
            } else if (4 == choice) {
                System.out.print("Enter the first number");
                a = input.nextInt();
                System.out.print("Enter the second number");
                b = input.nextInt();
                System.out.println("The division of two numbers =" + (a / b));

            } else if (5 == choice) {
                System.out.print("Enter the first number");
                a = input.nextInt();
                System.out.print("Enter the second number");
                b = input.nextInt();
                System.out.println("The quotient of two numbers =" + (a % b));
            } else if (choice == 6) {
                System.out.println(" program exited");
                break;
            } else {
                System.out.println("invalid choice");
            }

        }
    }
}
