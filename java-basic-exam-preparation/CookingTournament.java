import java.util.Scanner;

public class CookingTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int participants = Integer.parseInt(scan.nextLine());
        int totalSweetsCount = 0;
        int cookiesCount = 0;
        int cakesCount = 0;
        int wafflesCount = 0;
        double price =0;
        double totalPriceCookies = 0;
        double totalPriceCakes = 0;
        double totalPriceWaffles = 0;


        for (int i = 0; i < participants; i++) {
            String name = scan.nextLine();
            String sweetsType = scan.nextLine();
            cookiesCount = 0;
            cakesCount = 0;
            wafflesCount = 0;

            while (!sweetsType.equals("Stop baking!")) {

                int sweetsCount = Integer.parseInt(scan.nextLine());
                totalSweetsCount = totalSweetsCount + sweetsCount;

                if ("cookies".equals(sweetsType)) {
                    cookiesCount = cookiesCount + sweetsCount;
                    price = 1.50;
                    totalPriceCookies = totalPriceCookies + (price * sweetsCount);
                } else if ("cakes".equals(sweetsType)) {
                    cakesCount = cakesCount + sweetsCount;
                    price = 7.80;
                    totalPriceCakes = totalPriceCakes + (price * sweetsCount);
                } else if ("waffles".equals(sweetsType)) {
                    wafflesCount = wafflesCount + sweetsCount;
                    price = 2.30;
                    totalPriceWaffles = totalPriceWaffles + (price * sweetsCount);
                }


                sweetsType = scan.nextLine();
            } System.out.printf("%s baked %d cookies, %d cakes and %d waffles.%n", name, cookiesCount, cakesCount, wafflesCount);
        }
        System.out.printf("All bakery sold: %d%n", totalSweetsCount);
        double totalMoneyCollected = totalPriceWaffles + totalPriceCakes + totalPriceCookies;
        System.out.printf("Total sum for charity: %.2f lv.", totalMoneyCollected);
    }
}
