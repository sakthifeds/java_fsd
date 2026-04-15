package lab2;

public class Account {
    private static long accNumSeed = 1000000000L;
    private long accNum;
    protected double balance;
    private Person accHolder;

    public Account(Person accHolder, double balance) {
        this.accNum = accNumSeed++;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public long getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public Person getAccHolder() {
        return accHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= 500) {
            balance -= amount;
        }
    }

    public String toString() {
        return accNum + " " + accHolder + " " + balance;
    }
}

