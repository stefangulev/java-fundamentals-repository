import java.util.Scanner;

public class AlcoholStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double whiskeyPrice = Double.parseDouble(scan.nextLine());
        double beerLitres = Double.parseDouble(scan.nextLine());
        double wineLitres = Double.parseDouble(scan.nextLine());
        double rakiaLitres = Double.parseDouble(scan.nextLine());
        double whiskeyLitres = Double.parseDouble(scan.nextLine());

        double rakiaPrice = whiskeyPrice * 0.5;
        double winePrice = rakiaPrice * 0.6;
        double beerPrice = rakiaPrice * 0.2;

        double whiskeyTotal = whiskeyLitres * whiskeyPrice;
        double beerTotal = beerLitres * beerPrice;
        double wineTotal = wineLitres * winePrice;
        double rakiaTotal = rakiaLitres * rakiaPrice;
        double totalPrice = whiskeyTotal + beerTotal + wineTotal + rakiaTotal;
        System.out.printf("%.2f", totalPrice);


    }
}
