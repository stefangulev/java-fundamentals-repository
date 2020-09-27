import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParenthases {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sequence = scan.nextLine();

        ArrayDeque<String> openingStack = new ArrayDeque<>();
        ArrayDeque<String> closingQueue = new ArrayDeque<>();

        for (int i = 0; i < sequence.length(); i++) {
            String current = sequence.charAt(i) + "";

            if (current.equals("(") || current.equals("{") || current.equals("[")) {
                openingStack.push(current);
            } else {
                closingQueue.offer(current);
            }
        }

        if (openingStack.isEmpty() || closingQueue.isEmpty()) {
            System.out.println("NO");
            return;
        }

        while (!openingStack.isEmpty() && !closingQueue.isEmpty()) {
            String currentOpening = openingStack.pop();
            String currentClosing = closingQueue.poll();

            if (currentOpening.equals("(")) {
                if (!currentClosing.equals(")")) {
                    System.out.println("NO");
                    return;
                }
            } else if (currentOpening.equals("{")) {
                if (!currentClosing.equals("}")) {
                    System.out.println("NO");
                    return;
                }
            } else if (currentOpening.equals("[")) {
                if (!currentClosing.equals("]")) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");

    }
}
