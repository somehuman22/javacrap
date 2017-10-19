package com.company;

public class Taxes{
    int hours;
    double hourlyRate;
    final double taxRate = .154;
    final double fica = 0.0775;
    final double stateTax = .04;
    double grossIncome;

    public Taxes(int h, double hr){
        hours = h;
        hourlyRate = hr;
        grossIncome = hourlyRate * hours;
    }
    public double getGrossIncome(){
        return grossIncome;
    }

    public double getNetIncome(){
        return grossIncome * (1 - (taxRate + fica + stateTax));
    }

    public double getFedTax(){
        return grossIncome * taxRate;
    }

    public double getStateTax(){
        return grossIncome * stateTax;
    }

    public double getFica(){
        return grossIncome * fica;
    }

}