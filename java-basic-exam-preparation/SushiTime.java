import java.util.Scanner;

public class SushiTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sushiType = scan.nextLine();
        String restaurantName = scan.nextLine();
        int sushiCount = Integer.parseInt(scan.nextLine());
        String symbol = scan.nextLine();
        double sushiPrice = 0;

        switch (sushiType) {
            case "sashimi":
                if (restaurantName.equals("Sushi Zone")) {
                    sushiPrice = 4.99;
                } else if (restaurantName.equals("Sushi Time")) {
                    sushiPrice = 5.49;
                } else if (restaurantName.equals("Sushi Bar")) {
                    sushiPrice = 5.25;
                } else if (restaurantName.equals("Asian Pub")) {
                    sushiPrice = 4.50;
                }
                break;
            case "maki":
                if (restaurantName.equals("Sushi Zone")) {
                    sushiPrice = 5.29;
                } else if (restaurantName.equals("Sushi Time")) {
                    sushiPrice = 4.69;
                } else if (restaurantName.equals("Sushi Bar")) {
                    sushiPrice = 5.55;
                } else if (restaurantName.equals("Asian Pub")) {
                    sushiPrice = 4.80;
                }
                break;
            case "uramaki":
                if (restaurantName.equals("Sushi Zone")) {
                    sushiPrice = 5.99;
                } else if (restaurantName.equals("Sushi Time")) {
                    sushiPrice = 4.49;
                } else if (restaurantName.equals("Sushi Bar")) {
                    sushiPrice = 6.25;
                } else if (restaurantName.equals("Asian Pub")) {
                    sushiPrice = 5.50;
                }
                break;
            case "temaki":
                if (restaurantName.equals("Sushi Zone")) {
                    sushiPrice = 4.29;
                } else if (restaurantName.equals("Sushi Time")) {
                    sushiPrice = 5.19;
                } else if (restaurantName.equals("Sushi Bar")) {
                    sushiPrice = 4.75;
                } else if (restaurantName.equals("Asian Pub")) {
                    sushiPrice = 5.50;
                }
                break;
        }
        double totalPrice = sushiPrice * sushiCount;

        if (symbol.equals("Y")) {
            totalPrice = totalPrice * 1.20;
        }
        //if (!restaurantName.equals("Sushi Zone") && !restaurantName.equals("Sushi Time") && !restaurantName.equals("Sushi Bar") && !restaurantName.equals("Asian Pub") {
        if (sushiPrice == 0) {
            System.out.printf("%s is invalid restaurant!", restaurantName);
        } else {
            System.out.printf("Total price: %.0f lv.", Math.ceil(totalPrice));


        }

    }
}
