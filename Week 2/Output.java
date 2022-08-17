public class Output {
    public String getDetails(double firstNumber, double secondNumber) {
        Sum sum = new Sum();
        double totalSum = sum.getSum(firstNumber, secondNumber);
        return "The sum of " + firstNumber + " and " + secondNumber + " is " + totalSum;
    }

    public static String getMyName() {
        return "";
    }
}
