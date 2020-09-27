import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double incomePerMonth = Double.parseDouble(scan.nextLine());
        int monthLeft = Integer.parseInt(scan.nextLine());
        double personalExpenses = Double.parseDouble(scan.nextLine());

     double unexpectedExpenses = incomePerMonth * 0.3;
     double totalSavedPerMonth = incomePerMonth - personalExpenses - unexpectedExpenses;
     double percentageSaved = totalSavedPerMonth / incomePerMonth * 100;
     double totalSaved = totalSavedPerMonth * monthLeft;

        System.out.printf("She can save %.2f%%%n",percentageSaved );
        System.out.printf("%.2f", totalSaved);


    }
}
