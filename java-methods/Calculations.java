import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());

        if (command.equals("add")) {
            addNumbers(firstNumber, secondNumber);
        } else if (command.equals("multiply")) {
            multiplyNumbers(firstNumber, secondNumber);
        } else if (command.equals("subtract")) {
            subtractNumbers(firstNumber,secondNumber);
        } else if (command.equals("divide")) {
            divideNumbers(firstNumber,secondNumber);
        }
    }

    private static void addNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println(result);
    }
    private static void multiplyNumbers (int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        System.out.println(result);
    }
    private static void subtractNumbers (int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        System.out.println(result);
    }
    private static void divideNumbers (int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        System.out.println(result);
    }
}
