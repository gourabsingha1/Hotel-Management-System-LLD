package decorator;

import payment.PaymentProcessor;

// 12. Seasonal Discount Class
public class SeasonalDiscount extends Discount {
    public SeasonalDiscount(PaymentProcessor processor) {
        super(processor);
    }

    @Override
    public void process(double amount) {
        double discountedAmount = amount * 0.9;
        processor.process(discountedAmount);
        System.out.println("Seasonal discount applied.");
    }
}
