import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String movieName = scan.nextLine();
        int countTicketType = 0;
        int countStandard = 0;
        int countKid = 0;
        int countStudent = 0;

        while (!movieName.equals("Finish")) {
            int capacity = Integer.parseInt(scan.nextLine());
            String ticketType = scan.nextLine();

            while (!ticketType.equals("End")) {
                countTicketType++;
                switch (ticketType) {
                    case "standard":
                        countStandard++;
                        break;
                    case "kid":
                        countKid++;
                        break;
                    case "student":
                        countStudent++;
                        break;

                }
                if (countTicketType >= capacity) {
                    break;
                }

                ticketType = scan.nextLine();
            }
            double percentage = countTicketType * 1.0 / capacity * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, percentage);
            movieName = scan.nextLine();
            countTicketType = 0;


        } int totalTickets = countKid + countStandard + countStudent;
        double percentageKids = countKid * 1.0 / totalTickets * 100;
        double percentageStudent = countStudent * 1.0 / totalTickets * 100;
        double percentageStandard = countStandard * 1.0 / totalTickets * 100;
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", percentageStudent);
        System.out.printf("%.2f%% standard tickets.%n", percentageStandard);
        System.out.printf("%.2f%% kids tickets.%n", percentageKids);

    }
}
