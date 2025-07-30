package io.prasana;

import java.util.Scanner;

public class studenttask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;


        int mark1, mark2, mark3, mark4, mark5, mark6;
        int sum;
        double average;


        System.out.println("Enter the name of the student:");
        name = sc.nextLine();


        System.out.println("Enter the marks for Subject 1:");
        mark1 = sc.nextInt();
        System.out.println("Enter the marks for Subject 2:");
        mark2 = sc.nextInt();
        System.out.println("Enter the marks for Subject 3:");
        mark3 = sc.nextInt();
        System.out.println("Enter the marks for Subject 4:");
        mark4 = sc.nextInt();
        System.out.println("Enter the marks for Subject 5:");
        mark5 = sc.nextInt();
        System.out.println("Enter the marks for Subject 6:");
        mark6 = sc.nextInt();


        sum = mark1 + mark2 + mark3 + mark4 + mark5 + mark6;

        System.out.println("The total marks for " + name + " is: " + sum);


        average = (double) sum / 6;

        System.out.println("The average percentage for " + name + " is: " + String.format("%.2f", average) + "%"); // Format to 2 decimal places


        if (average >= 90) {
            System.out.println("The Student got an *A* Grade");
        } else if (average >= 80) {
            System.out.println("The Student got a *B* Grade");
        } else if (average >= 70) {
            System.out.println("The Student got a *C* Grade");
        } else if (average >= 60) {
            System.out.println("The Student got a *D* Grade");
        } else if (average >= 50) { // Assuming 50-59 is an 'E' grade or pass
            System.out.println("The Student got an *E* Grade");
        } else { // This 'else' catches all cases where average is less than 50
            System.out.println("The Student Failed in the Exam");
        }

        sc.close();
    }
}