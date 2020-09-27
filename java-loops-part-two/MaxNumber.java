import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int count = 0;
        int max = Integer.MIN_VALUE;

        while (count < n) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            if (currentNumber > max) {
                max = currentNumber;
            }
            count++;
        }
        System.out.println(max);
    }
}
