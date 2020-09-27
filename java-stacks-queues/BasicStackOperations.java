import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] metrics = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int countElementsToPush = metrics[0];
        int countElementsToPop = metrics[1];
        int elementToCheckIfPresent = metrics[2];

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < countElementsToPush; i++) {
            stack.push(numbers[i]);
        }

        for (int i = 0; i < countElementsToPop; i++) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            System.out.println(0);
            return;
        }

        if (stack.contains(elementToCheckIfPresent)) {
            System.out.println("true");
            return;
        }

        System.out.println(Collections.min(stack));


    }
}
