package com.company;
import java.util.Scanner;

public class Mail {
    static double dim1, dim2, dim3, weight;
    static boolean isHeavy, isBig;
    public static void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first dimension: ");
        dim1 = sc.nextDouble();
        System.out.print("Enter second dimension: ");
        dim2 = sc.nextDouble();
        System.out.print("Enter third dimension: ");
        dim3 = sc.nextDouble();
        System.out.print("Enter weight in lbs: ");
        weight = sc.nextDouble();

        if (dim3 > dim1){
            double x = dim1;
            dim1 = dim3;
            dim3 = x;
        }
        if(dim3 > dim2){
            double x = dim2;
            dim2 = dim3;
            dim3 = x;
        }
        if (dim2 > dim1){
            double x = dim1;
            dim1 = dim2;
            dim2 = x;
        }

        isHeavy = weight > 70;
        isBig =  ( (2*dim2) + (2*dim3) > 100) || (dim1 > 100);

        if (isBig && isHeavy){
            System.out.println("The package is too big and too heavy.");
        }
        else if(isBig && !isHeavy){
            System.out.println("The package is too big.");
        }
        else if(!isBig && isHeavy){
            System.out.println("The package is too heavy.");
        }
        else{
            System.out.println("The package is acceptable.");
        }
    }
}
