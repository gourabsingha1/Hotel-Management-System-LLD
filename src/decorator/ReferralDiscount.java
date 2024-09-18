package decorator;

import payment.PaymentProcessor;

// 13. Referral Discount Class
class ReferralDiscount extends Discount {
    public ReferralDiscount(PaymentProcessor processor) {
        super(processor);
    }

    @Override
    public void process(double amount) {
        double discountedAmount = amount * 0.85;
        processor.process(discountedAmount);
        System.out.println("Referral discount applied.");
    }
}