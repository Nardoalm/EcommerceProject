package bankSystem.entities;

public class Account {
    private String holder;
    protected Double balance;
    private Integer number;

    public Account(){
    }

    public Account(String holder, Double balance, Integer number){
        super();
        this.holder = holder;
        this.number = number;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void withdraw(double amount){
        balance -= amount + 5;
    }

    public void deposit(double amount){
        balance += amount;
    }
}
