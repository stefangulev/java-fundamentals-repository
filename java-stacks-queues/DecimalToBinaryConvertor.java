import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DecimalToBinaryConvertor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        if (n == 0) {
            System.out.println(0);
            return;
        }
        Deque <Integer> stack = new ArrayDeque<>();

        while (n != 0) {
            int numberToAdd = n % 2;
            stack.push(numberToAdd);
            n /= 2;
        }

        String result = stack.toString().replaceAll("[\\[\\],\\s+]", "");
        System.out.println(result);

    }
}
