import java.util.Scanner;

public class OperationsWithNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int calculation = 0;
        String leftOver = "";
        double calculation2 = 0;
        double number3 = number1;
        double number4 = number2;

        if (operator.equals("+")) {
            calculation = number1 + number2;
            if (calculation % 2 == 0) {
                leftOver = "even";
            } else {
                leftOver = "odd";
            }
            System.out.printf("%d + %d = %d - %s", number1, number2, calculation, leftOver);

        } else if (operator.equals("*")) {
            calculation = number1 * number2;
            if (calculation % 2 == 0) {
                leftOver = "even";
            } else {
                leftOver = "odd";
            }
            System.out.printf("%d * %d = %d - %s", number1, number2, calculation, leftOver);
        } else if (operator.equals("-")) {
            calculation = number1 - number2;
            if (calculation % 2 == 0) {
                leftOver = "even";
            } else {
                leftOver = "odd";
            }
            System.out.printf("%d - %d = %d - %s", number1, number2, calculation, leftOver);
        } else if (operator.equals("/")) {
            if (number4 == 0) {
                System.out.printf("Cannot divide %d by zero", number1);
            } else {
                calculation2 = number3 / number4;
                System.out.printf("%.0f / %.0f = %.2f", number3, number4, calculation2);

            }
        } else if (operator.equals("%")) {
            if (number2 == 0) {
                System.out.printf("Cannot divide %d by zero", number1);
            } else {
                calculation = number1 % number2;
                System.out.printf("%d %% %d = %d", number1, number2, calculation);
            }
        }
    }
}