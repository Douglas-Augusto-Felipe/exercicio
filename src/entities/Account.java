package entities;

public class Account {
    
    private int NumberAccount;
    private String Name;
    private double Deposit;

    
    public Account(int numberAccount, String name, double initialDeposit) {
        this.NumberAccount = numberAccount;
        this.Name = name;
        deposit(initialDeposit);
    }
    
    public Account(int numberAccount, String name){
        this.NumberAccount = numberAccount;
        this.Name = name;
    }


    public int getNumberAccount() {
        return NumberAccount;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public double getDeposit() {
        return Deposit;
    }

    public void deposit(double amount){
        this.Deposit += amount;
    }

    public void withdraw(double amount){
        this.Deposit -= amount + 5.00;
    }
    
   public String toString(){
    return Name
    + ", " 
    + NumberAccount
    + ", R$ "
    + String.format("%.2f", Deposit);
   }
}
