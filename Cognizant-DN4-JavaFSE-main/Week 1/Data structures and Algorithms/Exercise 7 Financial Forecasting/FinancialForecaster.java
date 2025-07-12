public class FinancialForecaster {

    public static double forecast(double initialValue, double growthRate, int yearsLeft) {
        if (yearsLeft <= 0) {
            return initialValue;
        }

        return forecast(initialValue * (1 + growthRate), growthRate, yearsLeft - 1);
    }
}