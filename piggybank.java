public class PiggyBank {
    private int pennies, nickels, dimes, quarters;

    public PiggyBank(){
        this.quarters = 0;
        this.dimes = 0;
        this.nickels = 0;
        this.pennies = 0;
    }
    public PiggyBank(int quarters, int dimes, int nickels, int pennies){
        this.quarters = quarters;
        this.dimes = dimes;
        this.nickels = nickels;
        this.pennies = pennies;
    }

    public int getQuarters(){
        return this.quarters;
    }
    public int getDimes(){
        return this.dimes;
    }
    public int getNickels(){
        return this.nickels;
    }
    public int getPennies() {
        return this.pennies;
    }
    public int getTotal() {
        return (this.quarters * 25) + (this.dimes * 10) + (this.nickels * 5) + (this.pennies);
    }

    public void addQuarters(int q){
        this.quarters += q;
    }
    public void addDimes(int d){
        this.dimes += d;
    }
    public void addNickels(int n){
        this.nickels += n;
    }
    public void addPennies(int p){
        this.pennies += p;
    }
}

