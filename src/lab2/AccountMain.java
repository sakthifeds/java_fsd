package lab2;

public class AccountMain {
    public static void main(String[] args) {
        Person smith = new Person("Smith", 30, "9876543210", Person.Gender.M);
        Person kathy = new Person("Kathy", 25, "9123456780", Person.Gender.F);

        SavingsAccount savingsAcc = new SavingsAccount(smith, 2000);
        CurrentAccount currentAcc = new CurrentAccount(kathy, 3000, 1000);

        savingsAcc.deposit(2000);
        System.out.println("Savings Account after deposit: " + savingsAcc);

        currentAcc.withdraw(2000);
        System.out.println("Current Account after withdraw: " + currentAcc);

        savingsAcc.withdraw(3400);
        System.out.println("Savings Account after invalid withdraw: " + savingsAcc);

        boolean result = currentAcc.withdrawWithLimit(3500);
        System.out.println("Current Account withdraw success: " + result);
        System.out.println("Current Account final balance: " + currentAcc);
    }
}
