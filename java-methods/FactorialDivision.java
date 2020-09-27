import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());

        double factorialFirstNumber = factorialCalculation ( 1.0 *firstNumber);
        double factorialSecondNumber = factorialCalculation (1.0 *secondNumber);
        divideResult (factorialFirstNumber, factorialSecondNumber);

    }

    private static double factorialCalculation (double number) {
        double factorial = 1;

        for (double i = number; i > 0 ; i--) {
            factorial *= i;
        }
        return factorial;
    }
    private static void divideResult (double factorialFirstNumber, double factorialSecondNumber) {
        double result = factorialFirstNumber/factorialSecondNumber;
        System.out.printf("%.2f",result);

    }
}
