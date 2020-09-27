import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        int count = 0;
        int totalSum = 0;

        while (count < input) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            totalSum = totalSum + currentNumber;
            count++;

        } double result = totalSum / (1.0 * count);
        System.out.printf("%.2f", result);
    }
}
