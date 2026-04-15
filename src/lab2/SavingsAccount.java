package lab2;

public class SavingsAccount extends Account {
    private final double minimumBalance = 500;

    public SavingsAccount(Person accHolder, double balance) {
        super(accHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= minimumBalance) {
            balance -= amount;
        }
    }
}

