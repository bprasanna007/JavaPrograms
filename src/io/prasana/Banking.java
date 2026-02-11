interface Payment {
    void pay(double amount);
}

abstract class Account {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    abstract void calculateInterest();

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount);
    }
}

class SavingsAccount extends Account {
    void calculateInterest() {
        double interest = getBalance() * 0.05;
        System.out.println("Savings " + interest);
    }
}

class CurrentAccount extends Account {
    void calculateInterest() {
        double interest = getBalance() * 0.1;
        System.out.println("Savings " + interest);

    }
}

class upi implements Payment {
    public void pay(double amount) {
        System.out.println("Paying " + amount);

    }


}

class credit implements Payment {
    public void pay(double amount) {
        System.out.println("Credit " + amount);
    }
}


public class Banking {
    public static void main(String[] args) {
        Account acc;
        acc = new SavingsAccount();
        acc.setBalance(100000);

        acc.deposit(2000);
        acc.calculateInterest();

        acc = new CurrentAccount();
        acc.setBalance(10000);

        acc.deposit(3000);
        acc.calculateInterest();


        Payment p;
        p = new upi();
        p.pay(500);
        p = new credit();
        p.pay(500);

    }
}
