import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groupBudget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fisherman = Integer.parseInt(scan.nextLine());

        double shipPrice = 0;
        double moneyLeft = 0;
        double moneyNeeded = 0;

        switch (season) {
            case "Spring":
                shipPrice = 3000;
                if (fisherman % 2 == 0) {
                    shipPrice = shipPrice * 0.95;
                } break;
            case "Summer":
                shipPrice = 4200;
                if (fisherman % 2 == 0) {
                    shipPrice = shipPrice * 0.95;
                } break;
            case "Autumn":
                shipPrice = 4200;
                break;
            case "Winter":
                shipPrice = 2600;
                if (fisherman % 2 == 0) {
                    shipPrice = shipPrice * 0.95;
                } break;
         } if (fisherman <= 6) {
            shipPrice = shipPrice * 0.9;
        } else if (fisherman >= 7 && fisherman <= 11) {
            shipPrice = shipPrice * 0.85;
        } else if (fisherman >= 12) {
            shipPrice = shipPrice * 0.75;
        }
        if(groupBudget >= shipPrice) {
            moneyLeft = groupBudget - shipPrice;
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);

        } else {
            moneyNeeded = shipPrice - groupBudget;
            System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
        }


    }
}
