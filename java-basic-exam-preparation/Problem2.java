import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int actorsCount = Integer.parseInt(scan.nextLine());
        double uniformPerActorPrice = Double.parseDouble(scan.nextLine());

        double stagePrice = budget * 0.1;
        double totalClothes = actorsCount * uniformPerActorPrice;

        if (actorsCount > 150) {
            totalClothes = totalClothes * 0.9;
        }
        double totalCost = totalClothes + stagePrice;

        if (budget >= totalCost) {
            double moneyLeft = budget - totalCost;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        } else {
            double moneyNeeded = totalCost - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyNeeded);

        }




    }
}

