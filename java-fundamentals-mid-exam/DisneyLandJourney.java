import java.util.Scanner;

public class DisneyLandJourney {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scan.nextLine());
        int monthsAvailable = Integer.parseInt(scan.nextLine());
        double amountSavedPerMonth = moneyNeeded * 0.25;
        double totalSaved  = 0;

        for (int i = 1; i <= monthsAvailable; i++) {


            if(i != 1 && i % 2 != 0) {
                double moneySpent = totalSaved * 0.16;
                totalSaved -= moneySpent;
            }

            if (i % 4 == 0) {
                double bonus = totalSaved * 0.25;
                totalSaved += bonus;
            }
            totalSaved += amountSavedPerMonth;

        }

        if (totalSaved >= moneyNeeded) {
            double souvenirMoney = totalSaved - moneyNeeded;

            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", souvenirMoney);
        } else {
            double diff = moneyNeeded - totalSaved;
            System.out.printf("Sorry. You need %.2flv. more.", diff);
        }


    }
}
