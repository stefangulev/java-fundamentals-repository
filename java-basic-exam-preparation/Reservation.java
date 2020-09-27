import java.util.Scanner;

public class Reservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int reservationDay = Integer.parseInt(scan.nextLine());
        int reservationMonth = Integer.parseInt(scan.nextLine());
        int checkInDay = Integer.parseInt(scan.nextLine());
        int checkInlMonth = Integer.parseInt(scan.nextLine());
        int checkOutDay = Integer.parseInt(scan.nextLine());
        int checkOutMonth = Integer.parseInt(scan.nextLine());

        int pricePerNight = 30;
        if (checkInDay - reservationDay >= 10) {
            pricePerNight = 25;
        }

            int daysCount = checkOutDay - checkInDay;
            double totalPrice = pricePerNight * daysCount;


            if (reservationMonth < checkInlMonth) {
                pricePerNight = 25;
                totalPrice = (pricePerNight * daysCount) * 0.8;


            }
        System.out.printf("Your stay from %d/%d to %d/%d will cost %.2f", checkInDay, checkInlMonth, checkOutDay, checkOutMonth, totalPrice);


    }
}
