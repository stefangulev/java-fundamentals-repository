import java.util.Scanner;

public class BacherlorParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int singerCost = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int totalGuests = 0;
        double totalEarning = 0;
        double pricePerPerson =0;

        while (!input.equals("The restaurant is full")) {

            int guestsCount = Integer.parseInt(input);
            totalGuests = totalGuests + guestsCount;

            if (guestsCount < 5) {
                pricePerPerson = 100;

            } else {
                pricePerPerson = 70;
            }
            totalEarning = totalEarning + (pricePerPerson * guestsCount);

            input = scan.nextLine();

        }
        if (totalEarning >= singerCost) {
            double moneyLeft = totalEarning - singerCost;
            System.out.printf("You have %d guests and %.0f leva left.", totalGuests, moneyLeft);
        } else {
            System.out.printf("You have %d guests and %.0f leva income, but no singer.", totalGuests, totalEarning);

        }
    }
}
