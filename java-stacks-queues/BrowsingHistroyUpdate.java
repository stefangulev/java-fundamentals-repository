import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowsingHistroyUpdate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> stack2 = new ArrayDeque<>();

        while (!command.equals("Home")) {

            if (command.equals("back")) {
                if (stack.size() <= 1) {
                    System.out.println("no previous URLs");
                    command = scan.nextLine();
                    continue;
                } else {
                    stack2.push(stack.pop());
                }

            } else if (command.equals("forward")) {
                if (!stack2.isEmpty()) {
                    String current = stack2.pop();
                    stack.push(current);
                } else {
                    System.out.println("no next URLs");
                    command = scan.nextLine();
                    continue;
                }

            } else {
                stack.push(command);
                stack2.clear();
            }

            System.out.println(stack.peek());
            command = scan.nextLine();
        }

    }
}
