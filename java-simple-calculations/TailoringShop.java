import java.util.Scanner;

public class TailoringShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tablesCnt = Integer.parseInt(scan.nextLine());
        double tablesLength = Double.parseDouble(scan.nextLine());
        double tablesWidth = Double.parseDouble(scan.nextLine());
        double clothSize = (tablesLength + 2 * 0.30) * (tablesWidth + 2 * 0.30);
        double squareSize = (tablesLength * 0.5) * (tablesLength * 0.5);
        double priceCloth = tablesCnt * (clothSize * 7);
        double priceSquare = tablesCnt * (squareSize * 9);
        double priceUSD = priceCloth + priceSquare;
        double priceBGN = priceUSD * 1.85;
        System.out.printf("%.2f USD%n" , priceUSD);
        System.out.printf("%.2f BGN" , priceBGN);




    }
}
