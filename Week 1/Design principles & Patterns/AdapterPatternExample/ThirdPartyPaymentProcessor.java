public class ThirdPartyPaymentProcessor {

    public String initiateTransaction(String currency, double amount) {
        return "Transaction initiated with amount " + amount + " " + currency + " from Google UPI India.";
    }
}
