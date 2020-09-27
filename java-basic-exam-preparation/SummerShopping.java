import java.util.Scanner;

public class SummerShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        double towelPrice = Double.parseDouble(scan.nextLine());
        double discount = Integer.parseInt(scan.nextLine());

        double umbrellaPrice = towelPrice * 2 /3;
        double flipFlopsPrice = umbrellaPrice * 0.75;
        double beachBagPrice = (towelPrice + flipFlopsPrice) * 1 / 3;

        double totalCost = towelPrice + umbrellaPrice + flipFlopsPrice + beachBagPrice;
        double discountPercenage = discount / 100;
        double  totalPrice = totalCost * (1 - discountPercenage);

        if (totalPrice > budget) {
            double moneyNeeded = totalPrice - budget;
            System.out.printf("Annie's sum is %.2f lv. She needs %.2f lv. more.", totalPrice, moneyNeeded);
        } else if (budget >= totalPrice) {
            double moneyLeft = budget - totalPrice;
            System.out.printf("Annie's sum is %.2f lv. She has %.2f lv. left.", totalPrice, moneyLeft);
        }


    }
}
