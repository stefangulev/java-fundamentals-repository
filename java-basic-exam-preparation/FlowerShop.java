import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int magnolii = Integer.parseInt(scan.nextLine());
        int ziumbiuli = Integer.parseInt(scan.nextLine());
        int rozi = Integer.parseInt(scan.nextLine());
        int kaktusi = Integer.parseInt(scan.nextLine());
        double giftPrice = Double.parseDouble(scan.nextLine());

        double priceMagnolii = 3.25;
        double priceZiumbiuli = 4;
        double priceRozi = 3.50;
        double priceKaktusi = 8;

        double totalMagnolii = magnolii * priceMagnolii;
        double totalZiumbiuli = ziumbiuli * priceZiumbiuli;
        double totalRozi = rozi * priceRozi;
        double totalKaktusi = kaktusi * priceKaktusi;

        double totalEarned = totalMagnolii + totalZiumbiuli + totalRozi + totalKaktusi;
        double totalAvailable = totalEarned * 0.95;

        if (totalAvailable < giftPrice) {
            double needed = giftPrice - totalAvailable;
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(needed));

        } else {
            double left = totalAvailable - giftPrice;
            System.out.printf("She is left with %.0f leva.", Math.floor(left));
        }

    }
}
