package wiproday2;

public class BankingSystemException {
    public static void main(String[] args) {
        try {
            // **1. NullPointerException Example**
            String customerName = null; // Customer name is not assigned
            System.out.println("Customer Name: " + customerName.toLowerCase()); // Triggers NullPointerException

        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Customer name is missing!");
        } finally {
            System.out.println("Finally Block Executed for NullPointerException.");
        }

        System.out.println("----------------------");

        try {
            // **2. ArrayIndexOutOfBoundsException Example**
            int[] transactions = {500, 1000, 1500}; // Transaction history
            System.out.println("Last Transaction: " + transactions[5]); // Invalid index, triggers ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid transaction history access!");
        } finally {
            System.out.println("Finally Block Executed for ArrayIndexOutOfBoundsException.");
        }
    }
}

