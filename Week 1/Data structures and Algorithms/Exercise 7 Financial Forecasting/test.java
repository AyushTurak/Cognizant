public class test {
    public static void main(String[] args) {
        double initialValue = 500000;
        double growthRate = 0.05; // or 5%
        int yearsLeft = 15;
        double futureValue = FinancialForecaster.forecast(initialValue, growthRate, yearsLeft);
        System.out.printf("The future value with growth rate of %.2f is Rs %.2f", growthRate, futureValue);
    }
}