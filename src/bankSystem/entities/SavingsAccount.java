package bankSystem.entities;

public final class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(double balance, Integer number, String holder, double interestRate){
        super(holder, balance, number);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(double amount){
        balance -= amount;
    }
}
