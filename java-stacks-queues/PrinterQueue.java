import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Deque<String> queue = new ArrayDeque<>();

        while (!"print".equals(input)) {

            if ("cancel".equals(input)) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                    input = scan.nextLine();
                    continue;
                } else {
                    System.out.println(String.format("Canceled %s", queue.poll()));
                }
            } else {
                queue.offer(input);
            }

            input = scan.nextLine();
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
