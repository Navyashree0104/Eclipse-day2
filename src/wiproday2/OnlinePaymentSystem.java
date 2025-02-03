package wiproday2;


abstract class PaymentMethod {

    abstract void processPayment(double amount);
}


class CreditCard extends PaymentMethod {
 @Override
 void processPayment(double amount) {
     double fee = amount * 0.02; 
     System.out.println("Processing Credit Card payment of $" + amount);
     System.out.println("Transaction fee: $" + fee);
     System.out.println("Total amount charged: $" + (amount + fee));
     System.out.println("--------------------");
 }
}


class PayPal extends PaymentMethod {
 @Override
 void processPayment(double amount) {
     System.out.println("Processing PayPal payment of $" + amount);
     System.out.println("No additional transaction fee.");
     System.out.println("--------------------");
 }
}


public class OnlinePaymentSystem {

 public static void processTransaction(PaymentMethod paymentMethod, double amount) {
     paymentMethod.processPayment(amount); 
 }

 public static void main(String[] args) {
     PaymentMethod payment1 = new CreditCard();
     PaymentMethod payment2 = new PayPal();

     processTransaction(payment1, 100.0); 
     processTransaction(payment2, 200.0); 
 }
}

