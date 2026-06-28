public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double futureValue(double currentValue,
                                     double growthRate,
                                     int years) {

        // Base condition
        if (years == 0) {
            return currentValue;
        }

        // Recursive call
        return futureValue(
                currentValue * (1 + growthRate),
                growthRate,
                years - 1);
    }

    public static void main(String[] args) {

        double currentValue = 1000.0;
        double growthRate = 0.10; // 10%
        int years = 5;

        double result = futureValue(
                currentValue,
                growthRate,
                years);

        System.out.println("Current Value = " + currentValue);
        System.out.println("Growth Rate = " + (growthRate * 100) + "%");
        System.out.println("Years = " + years);
        System.out.println("Future Value after "
                + years + " years = " + result);
    }
}