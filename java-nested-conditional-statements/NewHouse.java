import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flowerType = scan.nextLine();
        int flowerNumber = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double flowerPrice = 0;
        double totalPrice = 0;
        double moneyLeft = 0;
        double moneyNeeded = 0;

        switch(flowerType) {

            case "Roses":
                flowerPrice = 5;
                totalPrice = flowerPrice * flowerNumber;
                if (flowerNumber > 80) {
                    totalPrice = totalPrice * 0.9;
                }
                break;
            case "Dahlias":
                flowerPrice = 3.80;
                totalPrice = flowerPrice * flowerNumber;
                if (flowerNumber > 90) {
                    totalPrice = totalPrice * 0.85;
                }
                break;
            case "Tulips":
                flowerPrice = 2.80;
                totalPrice = flowerPrice * flowerNumber;
                if (flowerNumber > 80) {
                    totalPrice = totalPrice * 0.85;
                }
                break;
            case "Narcissus":
                flowerPrice = 3;
                totalPrice = flowerPrice * flowerNumber;
                if (flowerNumber < 120) {
                    totalPrice = totalPrice * 1.15;
                }
                break;
            case "Gladiolus":
                flowerPrice = 2.50;
                totalPrice = flowerPrice * flowerNumber;
                if (flowerNumber < 80) {
                    totalPrice = totalPrice * 1.20;
                }
                break;
        } if (budget >= totalPrice) {
            moneyLeft = budget - totalPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left." , flowerNumber , flowerType , moneyLeft);
        } else {
            moneyNeeded = totalPrice - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
        }


    }
}
