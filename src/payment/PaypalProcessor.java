package payment;

// 9. PayPal Processor Class
public class PaypalProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("Processing PayPal Payment of $" + amount);
    }
}
