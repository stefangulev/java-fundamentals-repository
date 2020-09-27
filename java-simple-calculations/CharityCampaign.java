import java.util.Scanner;
public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int daysCnt = Integer.parseInt(scan.nextLine());
        int cooksCnt = Integer.parseInt(scan.nextLine());
        int cakesCnt = Integer.parseInt(scan.nextLine());
        int wafflesCnt = Integer.parseInt(scan.nextLine());
        int pancakesCnt = Integer.parseInt(scan.nextLine());

        int cakesPrice = 45;
        double wafflesPrice = 5.80;
        double pankcakesPrice = 3.20;
        double cakesTotal = cakesPrice * cakesCnt;
        double wafflesTotal = wafflesCnt * wafflesPrice;
        double pancakesTotal = pancakesCnt * pankcakesPrice;
        double totalPrice = daysCnt * cooksCnt * (cakesTotal + wafflesTotal + pancakesTotal);
        double reducedPrice = totalPrice - (totalPrice * 1/8);
        System.out.printf("%.2f" , reducedPrice);
    }
}
