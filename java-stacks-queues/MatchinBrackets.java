import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MatchinBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String expression = scan.nextLine();

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i <expression.length(); i++) {
            char current = expression.charAt(i);
            if ('(' == current) {
                stack.push(i);
            } else if (')' == current) {
                String matchingCase = expression.substring(stack.pop(), i+1);
                System.out.println(matchingCase);
            }
        }
    }
}
