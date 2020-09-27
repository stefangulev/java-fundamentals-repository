import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int secondNumber = Integer.parseInt(scan.nextLine());

        int result = calculateNumbers(firstNumber,operator,secondNumber);

        System.out.println(result);
    }

    private static int calculateNumbers(int firstNumber, String operator, int secondNumber) {
int calculatino = 0;
        switch (operator) {
            case "+":
                calculatino = firstNumber + secondNumber;
                break;
            case "-":
                calculatino = firstNumber - secondNumber;
                break;
            case "*":
                calculatino = firstNumber * secondNumber;
                break;
            case "/":
                calculatino = firstNumber / secondNumber;
                break;
        }
        return calculatino;
    }

}
