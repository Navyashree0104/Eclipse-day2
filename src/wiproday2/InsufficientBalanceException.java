package wiproday2;


class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}


class BankAccount {
 private double balance;


 public BankAccount(double balance) {
     this.balance = balance;
 }

 
 public void withdraw(double amount) throws InsufficientBalanceException {
     if (amount > balance) {
         throw new InsufficientBalanceException("Withdrawal failed! Insufficient balance.");
     }
     balance -= amount;
     System.out.println("Withdrawal successful! Remaining Balance: " + balance);
 }
}


