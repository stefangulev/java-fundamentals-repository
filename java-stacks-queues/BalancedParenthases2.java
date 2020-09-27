import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedParenthases2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String expression = scan.nextLine();

        Deque<String> openingStack = new ArrayDeque<>();

        String topOfTheStack = "";
        for (int i = 0; i < expression.length(); i++) {
            String current = expression.charAt(i) +  "";

            if (current.equals("(") || current.equals("{") || current.equals("[")) {
                openingStack.push(current);
            } else {
                if (openingStack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                if (current.equals(")")) {
                    topOfTheStack = openingStack.peek();
                    if (!topOfTheStack.equals("(")) {
                        System.out.println("NO");
                        return;
                    } else {
                        openingStack.pop();
                    }

                } else if (current.equals("}")) {
                    topOfTheStack = openingStack.peek();
                    if (!topOfTheStack.equals("{")) {
                        System.out.println("NO");
                        return;
                    } else {
                        openingStack.pop();
                    }
                } else if (current.equals("]")) {
                    topOfTheStack = openingStack.peek();
                    if (!topOfTheStack.equals("[")) {
                        System.out.println("NO");
                        return;
                    } else {
                        openingStack.pop();
                    }
                }
            }
        }


        System.out.println("YES");

    }
}
