import java.util.Scanner;

public class GodzillaKingKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int actorsCnt = Integer.parseInt(scan.nextLine());
        double pricePerUniform = Double.parseDouble(scan.nextLine());

        double setPrice = budget * 0.1;
        double priceUniform = actorsCnt * pricePerUniform;

        double difference = 0;

        if (actorsCnt > 150) {
            priceUniform = priceUniform * 0.9;


        } double expenses = setPrice + priceUniform;

        if (expenses <= budget) {
            difference = budget - expenses;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left." , difference);
        } else {
            difference = expenses - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        }
    }
}
