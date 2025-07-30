package io.prasana.Atm;

import java.util.Scanner;

public class Atm {
    public void checkBalance(){
        System.out.println("Checking balance...");
    }
    public void deposit(double amount){
        System.out.println("Depositing: " + amount);


    }
    public void withdraw(double amount){
        System.out.println("Withdrawing: " + amount);
    }
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(1000);

        Scanner atm = new Scanner(System.in);
        System.out.println("Welcome to the ATM!\n" +
                "1. Check Balance\n" +
                "2. Deposit\n" +
                "3. Withdraw\n" +
                "4. Exit\n" +
                "Enter your choice:\n");
        while(true){
            int choice = atm.nextInt();
            if (choice == 1){
                System.out.println(bank.getBalance());
            }
            else if (choice == 2){
                double amount=atm.nextDouble();

                if (amount>0){
                  bank.deposit(amount);
                    System.out.println("deposit successfull. Balance");

                }
                else{
                    System.out.println("deposit failed. Please try again.");
                }


            }
            else if (choice == 3){
                double amount=atm.nextDouble();
                if (amount>0){
                    bank.withdraw(amount);
                    System.out.println("withdraw successfull. Balance");

                }
                else {
                    System.out.println("withdraw failed. Please try again.");
                }
            }
            else if (choice == 4){
                System.out.println("Exiting... Thanks for using our Atm... Visit again.");
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

    }
}
