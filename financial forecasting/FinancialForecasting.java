public class FinancialForecasting {

    public static void main(String[] args) {

        double presentValue = 1000;
        double growthRate = 0.10;
        int years = 3;

        double futureValue = predictFutureValue(presentValue, growthRate, years);

System.out.println("Future Value: " + futureValue);
    }
    public static double predictFutureValue(double value, double growthRate, int years) {

    if (years == 0) {
        return value;
    }

    return predictFutureValue(value * (1 + growthRate), growthRate, years - 1);
}
}