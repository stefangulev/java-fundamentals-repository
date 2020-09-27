import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] expression = scan.nextLine().split("\\s+");

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int result = 0;

        int firstNumber = Integer.parseInt(expression[0]);
        String sign = expression[1];
        int secondNumber= Integer.parseInt(expression[2]);
        if (sign.equals("+")) {
            result = firstNumber + secondNumber;
            stack.push(result);
        } else if (sign.equals("-")) {
            result = firstNumber - secondNumber;
            stack.push(result);
        }

        for (int i = 3; i < expression.length; i+=2) {
            String operator = expression[i];
            int newNumber = Integer.parseInt(expression[i +1]);
            if (operator.equals("+")) {
                result = stack.pop() + newNumber;
                stack.push(result);
            } else if (operator.equals("-")) {
                result = stack.pop() - newNumber;
                stack.push(result);
            }
        }
        System.out.println(stack.peek());


    }
}
