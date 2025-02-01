package wiproday2;

public class CustomExceptionExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000); // Initial Balance

        try {
            account.withdraw(6000); // Attempt to withdraw more than balance
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Transaction Completed.");
        }
    }
}
