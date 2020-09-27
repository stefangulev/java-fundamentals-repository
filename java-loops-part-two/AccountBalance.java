import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int count = 0;
        double totalSum = 0;

        while (count < n) {
            double input = Double.parseDouble(scan.nextLine());
            if (input < 0) {
                System.out.println("Invalid operation!");
                break;
            } totalSum = totalSum + input;
            System.out.printf("Increase: %.2f%n", input);
            count++;
        }
        System.out.printf("Total: %.2f%n", totalSum);
    }
}
