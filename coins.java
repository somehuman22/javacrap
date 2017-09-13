package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int quarters = (int)input / 25;
        input -= 25 * quarters;
        int dimes = (int)input / 10;
        input -= 10 * dimes;
        int nickels = (int)input / 5;
        input -= 5 * nickels;
        int pennies = (int)input/1;

        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: "+ nickels);
        System.out.println("Pennies: " + pennies);
    }
}
