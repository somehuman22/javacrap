public class Account {
    private double balance;
    private String name;
    private long acctNumber;

    public Account(double initBal, String owner, long number){
        this.balance = initBal;
        this.name = owner;
        this.acctNumber = number;
    }

    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient funds.");
        }
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public double getBalance(){
        return this.balance;
    }

    public String toString(){
        return "Owner: " + this.name + ", Acct num: " + this.acctNumber + ", Balance: " + this.balance;
    }

    public double chargeFee(){
        this.balance -= 10;
        return this.balance;
    }

    public void changeName(String newName){
        this.name = newName;
    }
}
