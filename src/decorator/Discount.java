package decorator;

import payment.PaymentProcessor;

// 11. Discount Abstract Decorator
abstract class Discount implements PaymentProcessor {
    protected PaymentProcessor processor;

    public Discount(PaymentProcessor processor) {
        this.processor = processor;
    }

    public abstract void process(double amount);
}