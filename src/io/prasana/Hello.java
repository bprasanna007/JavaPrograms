package io.prasana;

public class Hello {
    public static void main(String[] args) {
        int number=153;
        int sum = 0;
        int original,reminder;

        original = number;
        while(number>0){
            reminder=number%10;
            sum=sum+(reminder*reminder*reminder);
            number=number/10;
        }
        if(sum==original){
            System.out.println("Armstrong number is ");
        }
        else{
            System.out.println("Armstrong number is not ");
        }


    }
}