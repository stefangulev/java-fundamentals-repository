import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] kids = scan.nextLine().split("\\s+");
        int throwsLimit = Integer.parseInt(scan.nextLine());

        Deque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, kids);

        int throwsCount = 0;

        while (queue.size() > 1) {
            throwsCount++;
            String currentKid = queue.poll();
            if (throwsCount % throwsLimit != 0) {
                queue.offer(currentKid);
            } else {
                System.out.println(String.format("Removed %s", currentKid));
            }
        }

        System.out.println(String.format("Last is %s", queue.poll()));

    }
}
