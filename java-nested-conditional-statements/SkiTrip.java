import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        String roomType = scan.nextLine();
        String feedback = scan.nextLine();
        int nights = days - 1;
        double pricePerNight = 0;
        double totalPrice = 0;

        if (roomType.equals("room for one person")) {
            pricePerNight = 18.00;
            totalPrice = pricePerNight * nights;

        } else if (roomType.equals("apartment")) {
            pricePerNight = 25.00;
            totalPrice = pricePerNight * nights;
            if (nights < 10) {
                totalPrice = totalPrice * 0.70;

            } else if (nights >= 10 && nights <= 15) {
                totalPrice = totalPrice * 0.65;
            } else if (nights > 15) {
                totalPrice = totalPrice * 0.5;
            }

        } else if (roomType.equals("president apartment")) {
            pricePerNight = 35.00;
            totalPrice = pricePerNight * nights;

            if (nights < 10) {
                totalPrice = totalPrice * 0.90;

            } else if (nights >= 10 && nights <= 15) {
                totalPrice = totalPrice * 0.85;
            } else if (nights > 15) {
                totalPrice = totalPrice * 0.8;
            }
        } if (feedback.equals("positive")) {
            totalPrice = totalPrice * 1.25;
        } else if (feedback.equals("negative")) {
            totalPrice = totalPrice * 0.9;
        }

        System.out.printf("%.2f", totalPrice);
    }
}
