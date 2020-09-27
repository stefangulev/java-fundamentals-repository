import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String filmName = scan.nextLine();
        int countStandard = 0;
        int countStudent = 0;
        int countKid = 0;
        int ticketsCount = 0;
        double percentageFull = 0;
        boolean flag = false;

        while (!filmName.equals("Finish")) {
            int freeSeats = Integer.parseInt(scan.nextLine());
            String input = scan.nextLine();
            while (!input.equals("End")) {
                ticketsCount++;

                if (input.equals("standard")) {
                    countStandard++;

                } else if (input.equals("student")) {
                    countStudent++;
                } else if (input.equals("kid")) {
                    countKid++;
                }
                if (ticketsCount >= freeSeats) {
                    flag = true;
                    break;
                }
                input = scan.nextLine();

            }
            percentageFull = 1.0 * ticketsCount / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", filmName, percentageFull);
            filmName = scan.nextLine();
            ticketsCount = 0;
        }
        int totalTickets = countKid + countStandard + countStudent;
        double percentageStandard = 1.0 * countStandard / totalTickets * 100;
        double percentageKid = 1.0 * countKid / totalTickets * 100;
        double percentageStudent = 1.0 * countStudent / totalTickets * 100;

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", percentageStudent);
        System.out.printf("%.2f%% standard tickets.%n", percentageStandard);
        System.out.printf("%.2f%% kids tickets.", percentageKid);
    }
}
