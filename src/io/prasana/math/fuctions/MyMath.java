package io.prasana.math.fuctions;

public class MyMath {

    public static int powerTheNumberUsingRecursive(int base, int power) {
        if(0 ==base){
            throw new RuntimeException("Invalid base");
        }else if (0 == power){
            return 1;
        }else {
            return powerTheNumberUsingRecursive(base, power - 1) * base;
        }
    }

    public static int powerTheNumber(int base, int power) {
        if(0 ==base){
            throw new RuntimeException("Invalid base");
        }else if (0 == power){
            return 1;
        }else {
            int product=1;
            for (int i =1;i<=power;i++){
                product*=base;

            }
            return product;

        }
    }
}

