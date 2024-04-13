package assignment2;


public class TestSavingsAccount {
    public static void main(String[] args) {
        SavingsAccount.modifyInterestRate(0.03); // Set annual interest rate to 3%

        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        System.out.println("Initial Balances:");
        System.out.println("Saver1: " + saver1.getSavingsBalance());
        System.out.println("Saver2: " + saver2.getSavingsBalance());

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("\nBalances after 1 month of 3% interest:");
        System.out.println("Saver1: " + saver1.getSavingsBalance());
        System.out.println("Saver2: " + saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.04); // Set annual interest rate to 4%

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("\nBalances after 1 month of 4% interest:");
        System.out.println("Saver1: " + saver1.getSavingsBalance());
        System.out.println("Saver2: " + saver2.getSavingsBalance());
    }
}
