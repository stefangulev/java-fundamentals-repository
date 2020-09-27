import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int currentNumber = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for (int i = 0; i < n; i++) {
            currentNumber = Integer.parseInt(scan.nextLine());

            if(currentNumber >= max) {
                max = currentNumber;

            }
            if (currentNumber <= min) {
                min = currentNumber;
            }



        }
        System.out.printf("Max number: %d", max);
        System.out.println();
        System.out.printf("Min number: %d", min);
    }
}
