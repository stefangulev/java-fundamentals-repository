import java.util.Scanner;

public class LuggageTax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bagWidth = Integer.parseInt(scan.nextLine());
        int bagHeight = Integer.parseInt(scan.nextLine());
        int bagDepth = Integer.parseInt(scan.nextLine());
        String IsPriority = scan.nextLine();

        double tax = 0;
        double totalBagSize = bagDepth * bagHeight * bagWidth;

        switch (IsPriority) {

            case "true":
                if (totalBagSize <= 50) {
                    tax = 0;
                } else if (totalBagSize > 50 && totalBagSize <= 100) {
                    tax = 0;
            } else if (totalBagSize > 100 && totalBagSize <= 200) {
                    tax = 10;
                } else if (totalBagSize > 200 && totalBagSize <= 300) {
                    tax = 20;
                }
                break;
            case "false":
                if (totalBagSize <= 50) {
                    tax = 0;
                } else if (totalBagSize > 50 && totalBagSize <= 100) {
                    tax = 25;
                } else if (totalBagSize > 100 && totalBagSize <= 200) {
                    tax = 50;
                } else if (totalBagSize > 200 && totalBagSize <= 300) {
                    tax = 100;
                }
                break;

        }
        System.out.printf("Luggage tax: %.2f", tax);


    }
}
