import java.util.Scanner;

public class RestMine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scan.nextLine());
        double moneyAvailable = Double.parseDouble(scan.nextLine());
        int daysCount = 0;
        int spendDaysCount = 0;

        while (moneyNeeded > moneyAvailable) {
            String action = scan.nextLine();
            double input = Double.parseDouble(scan.nextLine());
            daysCount++;

            if (action.equals("spend")) {
                moneyAvailable = moneyAvailable - input;
                spendDaysCount++;
                if (moneyAvailable < 0) {
                    moneyAvailable = 0;
                }
            } else if (action.equals("save")) {
                moneyAvailable = moneyAvailable + input;
                spendDaysCount = 0;
            }

            if (spendDaysCount >= 5) {
                break;
            }
        }
        if (spendDaysCount >= 5) {
            System.out.printf("You can't save the money.%n" + daysCount);
        } else {
            System.out.printf("You saved the money for %d days.", daysCount);
        }
    }
}
