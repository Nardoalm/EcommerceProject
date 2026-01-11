package bankSystem.application;

import bankSystem.model.entities.Account;
import bankSystem.model.entities.BusinessAccount;
import bankSystem.model.entities.SavingsAccount;
import bankSystem.model.exception.DomainException;

public class Program {
    public static void main(String[] args) {
        try {
            Account acc = new Account("Alessandra", 100.9, 1001);
            BusinessAccount bacc = new BusinessAccount(123, "Leonardo", 100.0, 200.0);

            Account acc1 = new Account("elber", 1000.0, 1003);
            acc1.withdraw(100.0);
            System.out.println(acc1.getBalance());

            Account acc2 = new SavingsAccount(1000.0, 1004, "Emanuel", 0.05);
            acc2.withdraw(100.0);
            System.out.println(acc2.getBalance());

            Account acc3 = new BusinessAccount(1005, "Valmara", 1000.0, 2000.0);
            acc3.withdraw(100.0);
            System.out.println(acc3.getBalance());

            Account x = new Account("Removido", 1000.0, 1006);
            Account y = new SavingsAccount(1000.0, 1007, "Luiz", 0.1);

            x.withdraw(500.0);
            y.withdraw(500.0);

            System.out.println(x.getBalance());
        } catch (DomainException e){
            System.out.println("error: " + e.getMessage());
        }
    }
}