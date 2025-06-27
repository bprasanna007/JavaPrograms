package io.prasana.eb;

import java.util.Scanner;

public class ElectricityBill {
    private final String userName;
    private final int noOfUnits;
    private double price;

    
    public ElectricityBill(String userName, int noOfUnits) {
        this.userName = userName;
        this.noOfUnits = noOfUnits;
    }
    
    public double calculate() {

        if (noOfUnits < 0) {
            System.out.println("Please invalid usage");
        } else if (noOfUnits < 100) {
            price = noOfUnits * 1.5;
            System.out.println("\nprice for your usage " + price);
        } else if (noOfUnits < 200) {
            price = 100 * 1.5 + (noOfUnits - 100) * 2;
            System.out.println("\nprice for your usage " + price);
        } else if (noOfUnits < 300) {
            price = 100 * 1.5 + 100 * 2 + (noOfUnits - 200) * 3;
            System.out.println("\nprice for your usage" + price);
        } else {
            price = ((100 * 1.5) + (100 * 2) + (100 * 3) +((noOfUnits - 300) * 5));
            System.out.println("\n price for your usage " + price);
        }

        return price;
    }

    public void display() {
        System.out.println(userName + " Below is your EB bill");
        System.out.println("\nYour usage is " + noOfUnits + " units");
        System.out.println("\nYour Bill amount is " + price );
    }

    public static ElectricityBill  getInputs() {
        Scanner eb = new Scanner(System.in);

        System.out.println("\nenter customer name");
        String customerName = eb.nextLine();

        System.out.println("\nenter number of eb units");
        String units = eb.nextLine();

        int numOfUnits = isValidUnits(units);

        return new ElectricityBill(customerName, numOfUnits);
    }

   static int isValidUnits(String units) {
        try {
            return Integer.parseInt(units);
        }catch (NumberFormatException e){
            System.out.println("Invalid units, expected an integer.");
            System.out.println("Program ends, Rerun");
        }
        return 0;
    }
}