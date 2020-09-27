import java.util.*;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       String input = scan.nextLine();
       String[] numbers = input.split("\\s+");


        ArrayDeque<Integer> stack = new ArrayDeque<>();


        for (int i = 0; i < numbers.length; i++) {
            int current = Integer.parseInt(numbers[i]);
            stack.push(current);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
