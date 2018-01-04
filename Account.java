package com.company;

public class Account {
    private double balance;
    private String name;
    private long acctNum;

    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
    }
    public void withdraw(double amount){
        if (this.balance >= amount){
            this.balance -= amount;
        }
        else{
            System.out.println("Insufficient funds.");
        }
    }
    public String toString(){
        return "Name: " + this.name + ", Account Number: " + this.acctNum + ", balance: " + this.balance;
    }
}
