public class test {

    public static void main(String[] args) {
        ThirdPartyPaymentProcessor thirdPartyPaymentProcessor = new ThirdPartyPaymentProcessor();

        PaymentProcessor paymentProcessor = new PaymentAdapter(thirdPartyPaymentProcessor);

        String transaction = paymentProcessor.processPayment(500000);

        System.out.println(transaction);
    }
}

// test cases