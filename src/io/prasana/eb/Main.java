package io.prasana.eb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("welcome to eb");

        ElectricityBill electricityBill = ElectricityBill.getInputs();
        electricityBill.calculate();
        electricityBill.display();

    }

}
