import java.util.Scanner;

public class MovieStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        double currentBudget = budget;
        String actorName = scan.nextLine();
        double totalCost = 0;
        boolean isOver = false;

        while (!actorName.equals("ACTION")) {


            if (actorName.length() <= 15) {
                double actorPay = Double.parseDouble(scan.nextLine());
                currentBudget = currentBudget - actorPay;

            } else {
                currentBudget = currentBudget - (currentBudget * 0.2);

            }


            if (currentBudget <= 0) {
                isOver = true;
                break;
            }

            actorName = scan.nextLine();
        }
        if (isOver) {
            //double moneyNeeded = Math.abs(currentBudget);
            System.out.printf("We need %.2f leva for our actors.", Math.abs(currentBudget));
        } else {
           // double moneyLeft = budget - totalCost;
            System.out.printf("We are left with %.2f leva.", currentBudget);

        }

    }
}
