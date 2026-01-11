package bankSystem.model.entities;

import bankSystem.model.exception.DomainException;

public class Account {
    private String holder;
    protected Double balance;
    private Integer number;

    public Account(String holder, Double balance, Integer number){
        super();
        this.holder = holder;
        this.number = number;
        this.balance = balance;
    }

    public Account() {
        super();
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

    public void withdraw(double amount) throws DomainException{
        if (amount > balance){
            throw new DomainException("Balance is insufficient.");
        }
        balance -= amount + 5;
    }

    public void deposit(double amount){
        balance += amount;
    }
}
