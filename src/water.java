import java.util.Scanner;

public class water {
    public static void main(String[] args) {
        System.out.println("Welcome to the water calculator");
        Scanner water = new Scanner(System.in);
        System.out.println("enter customer name");
        String name = water.nextLine();
        System.out.println("enter customer id");
        int id = water.nextInt();
        System.out.println("enter usage of water by litere");
        double usage = water.nextInt();
        double servicetax = 50;
        double Finalamount;
        if (usage < 5000) {
            Finalamount = (((usage / 1000) * 5) + servicetax);
            System.out.println("the price for your usage is " + Finalamount);
        } else if (usage < 10000) {
            Finalamount = (((usage / 1000) * 5) + (((usage - 5000) / 1000) * 8) + servicetax);
            System.out.println("the price for your usage is " + Finalamount);
        } else if (usage < 15000) {
            Finalamount = (((usage / 1000) * 5) + (((usage - 10000) / 1000) * 15) + servicetax);
            System.out.println("the price for your usage is " + Finalamount);
        } else {

            Finalamount = ((5000 / 1000) * 5 + (10000 / 1000) * 8 + ((usage - 15000) / 1000) * 10 + servicetax);
            System.out.println("the price for your usage is " + Finalamount);
        }
    }
}