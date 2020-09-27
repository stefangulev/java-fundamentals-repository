import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class SimpleCalculatorTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] expression = input.split("\\s+");

        Deque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack,expression);
        int result = 0;

        while (stack.size() > 1) {
            int firstNumber = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondNumber = Integer.parseInt(stack.pop());

            if ("+".equals(operator)) {
                result = firstNumber + secondNumber;
                stack.push(String.valueOf(result));
            } else if ("-".equals(operator)) {
                result = firstNumber - secondNumber;
                stack.push(String.valueOf(result));
            }

        }
        System.out.println(stack.peek());




    }
}
