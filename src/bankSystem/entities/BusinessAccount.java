package bankSystem.entities;

public class BusinessAccount extends Account{
    
    private double loanLimit;
    
    public BusinessAccount(){
        super();
    }

    public BusinessAccount(int number, String holder, double balance, double loanLimit){
        super(holder, balance, number);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit){
        this.loanLimit = loanLimit;
    }

    public String toString(){
        return getHolder() + getBalance() + getNumber() + getLoanLimit();
    }

    public void loan(double amount){
        if(amount <= loanLimit){
            deposit(amount - 10.0);
        }
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }
}
