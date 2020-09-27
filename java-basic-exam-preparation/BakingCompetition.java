import java.util.Scanner;

public class BakingCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int participants = Integer.parseInt(scan.nextLine());
        double totalSum = 0;
        int cookiesCount = 0;
        int cakesCount = 0;
        int wafflesCount = 0;
        double totalSumCookies = 0;
        double totalSumCakes = 0;
        double totalSumWaffles = 0;
        int totalBakerySold = 0;

        for (int i = 0; i < participants; i++) {

            cookiesCount = 0;
            cakesCount = 0;
            wafflesCount = 0;

            String name = scan.nextLine();
            String sweetsType = scan.nextLine();

            while (!sweetsType.equals("Stop baking!")) {

                int preparedForType = Integer.parseInt(scan.nextLine());
                totalBakerySold+= preparedForType;
                switch (sweetsType) {
                    case "cookies":
                        cookiesCount += preparedForType;
                        totalSumCookies = totalSumCookies + (1.50 * preparedForType);
                        break;
                    case "cakes":
                        cakesCount += preparedForType;
                        totalSumCakes = totalSumCakes + (7.80 * preparedForType);
                        break;
                    case "waffles":
                        wafflesCount += preparedForType;
                        totalSumWaffles = totalSumWaffles + ( 2.30 * preparedForType);
                        break;
                }
                totalSum = totalSumCakes + totalSumWaffles + totalSumCookies;

                sweetsType = scan.nextLine();
            } System.out.printf("%s baked %d cookies, %d cakes and %d waffles.%n", name, cookiesCount, cakesCount, wafflesCount);
        }
        System.out.printf("All bakery sold: %d%n", totalBakerySold);

        System.out.printf("Total sum for charity: %.2f lv.", totalSum);


    }
}
