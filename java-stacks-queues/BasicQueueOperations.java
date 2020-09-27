import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] metrics = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int countElementsToEnqueue = metrics[0];
        int countElementsToDequeue = metrics[1];
        int elementToBeCheckedIfPresent = metrics[2];

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i < countElementsToEnqueue; i++) {
            queue.offer(numbers[i]);
        }
        for (int i = 0; i <countElementsToDequeue; i++) {
            queue.poll();
        }

        if (queue.isEmpty()) {
            System.out.println(0);
            return;
        }
        if (queue.contains(elementToBeCheckedIfPresent)) {
            System.out.println("true");
            return;
        }

        int min = Collections.min(queue);
        System.out.println(min);

    }
}
