import java.util.Scanner;

public class SeaTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double foodPricePerDay = Double.parseDouble(scan.nextLine());
        double giftsPricePerDay = Double.parseDouble(scan.nextLine());
        double hotelPricePerDay = Double.parseDouble(scan.nextLine());

        double fuelLiters = 420 / 100.0 * 7.0;
        double totalPriceFuel = fuelLiters * 1.85;

        double totalGiftCost = giftsPricePerDay * 3;
        double totalFoodCost = foodPricePerDay * 3;
        double hotelPriceDay1 = hotelPricePerDay * 0.9;
        double hotelPriceDay2 = hotelPricePerDay * 0.85;
        double hotelPriceDay3 = hotelPricePerDay * 0.80;

        double totalHotelPrice = hotelPriceDay1 + hotelPriceDay2 + hotelPriceDay3;
        double totalPrice = totalGiftCost + totalFoodCost + totalPriceFuel + totalHotelPrice;
        System.out.printf("Money needed: %.2f", totalPrice);

    }
}
