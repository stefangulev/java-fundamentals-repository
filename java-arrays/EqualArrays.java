import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] first = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int [] second = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i < first.length ; i++) {
            if (first[i] != second [i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }

        }
        int sum = 0;
        for (int k : first) {
            sum += k;
        }
        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}
