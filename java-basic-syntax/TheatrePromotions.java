import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String typeOfDay = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String ticketPrice = "Error!";

        switch (typeOfDay) {
            case "Weekday":
                if ((0 <= age && age <= 18) || (64 < age && age <= 122)) {
                    ticketPrice = "12$";
                } else if (18 < age && age <= 64) {
                    ticketPrice = "18$";
                }
                break;
            case "Weekend":
                if ((0 <= age && age <= 18) || (64 < age && age <= 122)) {
                    ticketPrice = "15$";
                } else if (18 < age && age <= 64) {
                    ticketPrice = "20$";
                }
                break;
            case "Holiday":
                if (0 <= age && age <= 18) {
                    ticketPrice = "5$";

            } else if (18 < age && age <= 64) {
                    ticketPrice = "12$";
                } else if (64 < age && age <= 122) {
                    ticketPrice = "10$";
                }

                break;
        }
        System.out.println(ticketPrice);
    }
}
