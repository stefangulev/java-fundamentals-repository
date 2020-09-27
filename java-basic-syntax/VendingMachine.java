import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        double totalEntered = 0.0;
        double currentEntered = 0.0;

        while (!input.equals("Start")) {

            switch (input) {
                case "0.1":
                case "0.2":
                case "0.5":
                case "1":
                case "2":
                    currentEntered = Double.parseDouble(input);
                    totalEntered += currentEntered;
                    break;
                default:
                    currentEntered = Double.parseDouble(input);
                    System.out.printf("Cannot accept %.2f%n", currentEntered);
            }

            input = scan.nextLine();

        }
        String input2 = scan.nextLine();
        double productPrice = 0.0;

        while (!input2.equals("End")) {
            switch (input2) {
                case "Nuts":
                    productPrice = 2.0;
                    break;
                case "Water":
                    productPrice = 0.7;
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    break;
                case "Soda":
                    productPrice = 0.8;
                    break;
                case "Coke":
                    productPrice = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                   input2 = scan.nextLine();
                    continue;
            }

            if (productPrice > totalEntered) {
                System.out.println("Sorry, not enough money");
            } else {
                System.out.printf("Purchased %s%n", input2);
                totalEntered -= productPrice;
            }
            input2 = scan.nextLine();
        }
        System.out.printf("Change: %.2f", totalEntered);

    }
}
