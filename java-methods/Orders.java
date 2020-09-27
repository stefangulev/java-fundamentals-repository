import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());

        printPrice(product,quantity);
    }

    private static void printPrice(String product, int quantity) {
       double price = 0;
        switch (product) {
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00 ;
                break;
            case "coke":
                price = 1.40 ;
                break;
            case "snacks":
                price = 2.00 ;
                break;
        }
        System.out.printf("%.2f", price * quantity);
    }
}
