import java.util.Scanner;

public class RestAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scan.nextLine());
        double moneyAvailable = Double.parseDouble(scan.nextLine());
        int spendCount = 0;
        int daysCount = 0;

        while (moneyNeeded > moneyAvailable) {
            String action = scan.nextLine();
            double sum = Double.parseDouble(scan.nextLine());
            daysCount++;


            if(action.equals("spend")) {
                moneyAvailable = moneyAvailable - sum;
                spendCount++;
                if (moneyAvailable < 0) {
                    moneyAvailable = 0;
                }

            } else if (action.equals("save")) {
                moneyAvailable = moneyAvailable + sum;
                spendCount = 0;
            }
            if (spendCount >= 5) {
                break;
            }

        } if (spendCount >= 5 || moneyNeeded > moneyAvailable) {
            System.out.println("You can't save the money.");
            System.out.println(daysCount);

        } else {
            System.out.printf("You saved the money for %d days.", daysCount);

        }

    }
}
