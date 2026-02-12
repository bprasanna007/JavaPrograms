interface Payment {
    void pay(double amount);
}

// ABSTRACT CLASS
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
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }

        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
            System.out.println("Remaining balance: " + balance);
        }
    }
}

// SAVINGS ACCOUNT
class SavingsAccount extends Account {

    @Override
    void calculateInterest() {
        double interest = getBalance() * 0.05;
        System.out.println("Savings Interest: " + interest);
    }
}

// CURRENT ACCOUNT
class CurrentAccount extends Account {

    @Override
    void calculateInterest() {
        double interest = getBalance() * 0.10;
        System.out.println("Current Interest: " + interest);
    }
}

// UPI PAYMENT
class UPI implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }
}

// CREDIT CARD PAYMENT
class Credit implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid using Credit Card: " + amount);
    }
}

// MAIN CLASS
public class Banking {

    public static void main(String[] args) {

        Account acc;

        acc = new SavingsAccount();
        acc.setBalance(100000);
        acc.deposit(2000);
        acc.withdraw(5000);
        acc.calculateInterest();

        acc = new CurrentAccount();
        acc.setBalance(10000);
        acc.deposit(3000);
        acc.withdraw(15000); // insufficient
        acc.calculateInterest();

        Payment p;

        p = new UPI();
        p.pay(500);

        p = new Credit();
        p.pay(1000);
    }
}
