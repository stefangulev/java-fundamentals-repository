import javax.swing.*;
import java.util.Scanner;

public class SpringVacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int daysOfTrip = Integer.parseInt(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());
        int numberOfPeople = Integer.parseInt(scan.nextLine());
        double fuelPricePerKm = Double.parseDouble(scan.nextLine());
        double foodExpensesPerDay = Double.parseDouble(scan.nextLine());
        double priceHotelPerNight = Double.parseDouble(scan.nextLine());
        double totalHotel = (priceHotelPerNight * daysOfTrip) * numberOfPeople;
        if (numberOfPeople > 10) {
totalHotel = totalHotel * 0.75;

        }
        double totalFood = (foodExpensesPerDay *daysOfTrip) * numberOfPeople;
        double totalExpenses = totalHotel + totalFood;


        for (int i = 1; i <= daysOfTrip ; i++) {
            double travelledDistanceInKm = Double.parseDouble(scan.nextLine());
            double fuelCostPerDay = travelledDistanceInKm * fuelPricePerKm;
            totalExpenses +=fuelCostPerDay;


            if (i % 3 == 0 || i % 5 == 0 ) {
                totalExpenses += totalExpenses * 0.4;
            } else if (i % 7 == 0) {
                totalExpenses -= totalExpenses/numberOfPeople;
            }
            if (budget < totalExpenses) {
                break;
            }
        }

        if (budget < totalExpenses) {
            double diff = totalExpenses - budget;
            System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", diff);
        } else {
            double diff  = budget - totalExpenses;
            System.out.printf("You have reached the destination. You have %.2f$ budget left.",diff);
        }
    }
}
