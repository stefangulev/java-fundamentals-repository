import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int multiplier = Integer.parseInt(scan.nextLine());

        if (multiplier <= 10) {
        for (int i = multiplier; i <= 10; i++) {
            int sum = number * i;
            System.out.printf("%d X %d = %d%n", number, i, sum);
        }
    } else {
            int sum = number * multiplier;
            System.out.printf("%d X %d = %d%n", number, multiplier, sum);
        }
        }
}
