package com.company;

import java.util.Scanner;

public class CarRental {
    public static void run(){
        //variable declarations
        String make, model, letters, code;
        int nums, sum;
        char l;
        Scanner sc = new Scanner(System.in);


        //the alphabet array
        final char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        //get inputs
        System.out.print("Input the make: ");
        make = sc.next();
        System.out.print("Input the model: ");
        model = sc.next();
        System.out.print("Input the letters of the license plate: ");
        letters = sc.next().toUpperCase();
        System.out.print("Enter the numbers of the license plate: ");
        nums = sc.nextInt();

        //generate key
        sum = ((int)letters.charAt(0) + (int)letters.charAt(1) + (int)letters.charAt(2) + nums);
        l = alphabet[sum % 26];
        code = l + String.valueOf(sum);

        //output data
        System.out.println("Make = " + make);
        System.out.println("Model = " + model);
        System.out.println(letters + nums + " = " + code);
    }
}

