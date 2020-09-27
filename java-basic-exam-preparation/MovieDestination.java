import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String destination = scan.nextLine();
        String season = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        double pricePerDay = 0;

        switch (season) {
            case "Winter":
                if (destination.equals("Dubai")) {
                    pricePerDay = 45000;
                } else if (destination.equals("Sofia")) {
                    pricePerDay = 17000;
                }else if (destination.equals("London")) {
                    pricePerDay = 24000;
                }
                break;
            case "Summer":
                if (destination.equals("Dubai")) {
                    pricePerDay = 40000;
                } else if (destination.equals("Sofia")) {
                    pricePerDay = 12500;
                }else if (destination.equals("London")) {
                    pricePerDay = 20250;
                }
                break;
        }
        double totalPrice = pricePerDay * days;

        if (destination.equals("Dubai")) {
            totalPrice = totalPrice * 0.7;
        } else if (destination.equals("Sofia")) {
            totalPrice = totalPrice * 1.25;
        }

        if (budget >= totalPrice) {
            double moneyLeft = budget - totalPrice;
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", moneyLeft);

        } else {
            double moneyNeeded = totalPrice - budget;
            System.out.printf("The director needs %.2f leva more!", moneyNeeded);
        }
    }
}


