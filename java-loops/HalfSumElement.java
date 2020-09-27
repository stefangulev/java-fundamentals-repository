import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int currentNumber= 0;
        int diff = 0;

        for (int i = 0; i < n; i++) {
            currentNumber = Integer.parseInt(scan.nextLine());
            if (currentNumber >= max) {
                max = currentNumber;
            } sum = sum + currentNumber;

        } sum = sum - max;
        if(max == sum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", max);
        } else {
            diff = max - sum;
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(diff));
        }

    }
}
