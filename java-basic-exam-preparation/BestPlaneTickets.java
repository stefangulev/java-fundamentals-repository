import java.util.Scanner;

public class BestPlaneTickets {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String ticketNumber = scan.nextLine();
        int leastWait = Integer.MAX_VALUE;
        String winnerFlight = "";
        double winnerFlightPrice = 0.0;


        while (!ticketNumber.equals("End")) {
            double ticketPrice = Double.parseDouble(scan.nextLine());
            int minutesStay = Integer.parseInt(scan.nextLine());

            if (minutesStay < leastWait) {
                leastWait = minutesStay;
                winnerFlight = ticketNumber;
                winnerFlightPrice = ticketPrice;


            }

            ticketNumber = scan.nextLine();
        }
        double hoursStay = 1.0 * leastWait / 60;
        double minutesStay = leastWait % 60;
        double priceInLeva = winnerFlightPrice * 1.96;

        System.out.printf("Ticket found for flight %s costs %.2f leva with %.0fh %.0fm stay",winnerFlight, priceInLeva, Math.floor(hoursStay), minutesStay);
    }
}
