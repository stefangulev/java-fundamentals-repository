import java.util.Scanner;

public class ToyStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scan.nextLine());
        int puzzleCnt = Integer.parseInt(scan.nextLine());
        int dollsCnt = Integer.parseInt(scan.nextLine());
        int bearCnt = Integer.parseInt(scan.nextLine());
        int minionCnt = Integer.parseInt(scan.nextLine());
        int truckCnt = Integer.parseInt(scan.nextLine());

        double totalCount = puzzleCnt + dollsCnt + bearCnt + minionCnt + truckCnt;
        double puzzleTotal = puzzleCnt * 2.60;
        double dollsTotal = dollsCnt * 3;
        double bearTotal = bearCnt * 4.10;
        double minionTotal = minionCnt * 8.20;
        double truckTotal = truckCnt * 2;

        double totalEarning = puzzleTotal + dollsTotal + bearTotal + minionTotal + truckTotal;

        if (totalCount >= 50) {
            totalEarning = totalEarning - (totalEarning * 0.25);
        } double totalAvailable = totalEarning - (totalEarning * 0.1);

        if (totalAvailable >= tripPrice) {
            double moneyLeft = totalAvailable - tripPrice;
            System.out.printf("Yes! %.2f lv left." , moneyLeft);
        } else {
            double moneyLeft = tripPrice - totalAvailable;
            System.out.printf("Not enough money! %.2f lv needed.", moneyLeft);
        }


    }
}


