import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistroy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        ArrayDeque<String> stack = new ArrayDeque<>();

        while (!command.equals("Home")) {

            if (command.equals("back")) {
                if (stack.size() <= 1) {
                    System.out.println("no previous URLs");
                    command = scan.nextLine();
                    continue;
                } else {
                    stack.pop();
                }

            } else {
                stack.push(command);
            }

            System.out.println(stack.peek());
            command = scan.nextLine();
        }

    }
}
