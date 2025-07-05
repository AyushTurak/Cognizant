public class PaymentAdapter implements PaymentProcessor {
    private ThirdPartyPaymentProcessor thirdPartyPaymentProcessor;

    public PaymentAdapter(ThirdPartyPaymentProcessor thirdPartyPaymentProcessor) {
        this.thirdPartyPaymentProcessor = thirdPartyPaymentProcessor;
    }

    @Override
    public String processPayment(double amount) {
        return thirdPartyPaymentProcessor.initiateTransaction("INR", amount);
    }
}
