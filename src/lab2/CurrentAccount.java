package lab2;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(Person accHolder, double balance, double overdraftLimit) {
        super(accHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public boolean withdrawWithLimit(double amount) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public void withdraw(double amount) {
        withdrawWithLimit(amount);
    }
}

