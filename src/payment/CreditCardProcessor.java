package payment;

// 8. CreditCard Processor Class
public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("Processing Credit Card Payment of $" + amount);
    }
}
