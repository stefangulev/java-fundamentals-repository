import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String filmName = scan.nextLine();
        int daysCount = Integer.parseInt(scan.nextLine());
        int ticketsCount = Integer.parseInt(scan.nextLine());
        double ticketsPrice = Double.parseDouble(scan.nextLine());
        int cinemaPercentage = Integer.parseInt(scan.nextLine());

        double totalTicketsSold = daysCount * ticketsCount;
        double totalEarned = totalTicketsSold * ticketsPrice;
        double percentageActual = 1.0 * cinemaPercentage / 100;
        double actualEarned = totalEarned - (totalEarned * percentageActual);

        System.out.printf("The profit from the movie %s is %.2f lv.", filmName, actualEarned);

    }
}
