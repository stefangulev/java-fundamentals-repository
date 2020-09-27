import java.util.Scanner;

public class AccountingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        double totalCollected = 0;
        double totalCollectedCC = 0;
        double totalCollectedCS = 0;
        int countPayment = 0;
        int countCS = 0;
        int countCC = 0;

        while (!input.equals("End")) {
            int price = Integer.parseInt(input);
            countPayment++;


            if (countPayment % 2 != 0) {
                if (price > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    totalCollected = totalCollected + price;
                    totalCollectedCS = totalCollectedCS + price;
                    countCS++;
                    System.out.println("Product sold!");
                }

            } else {
                if (price < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    totalCollected = totalCollected + price;
                    totalCollectedCC = totalCollectedCC + price;
                    countCC++;
                    System.out.println("Product sold!");

                }
            }
            if (totalCollected >= sum) {
                break;
            }
            input = scan.nextLine();

        } if (input.equals("End")) {
            System.out.println("Failed to collect required money for charity.");

        } else {
            double avgCS = totalCollectedCS / countCS;
            double avgCC = totalCollectedCC / countCC;
            System.out.printf("Average CS: %.2f%n ", avgCS);
            System.out.printf("Average CC: %.2f ", avgCC);
        }
    }
}
