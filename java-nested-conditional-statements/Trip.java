import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String destination = "";
        double price = 0;
        String stay = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                price = budget * 0.3;
                stay = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.7;
                stay = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                price = budget * 0.4;
                stay = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.8;
                stay = "Hotel";
            }

        } else if (budget > 1000) {
            destination = "Europe";
            stay = "Hotel";
            price = budget * 0.9;
        }
        System.out.printf("Somewhere in %s", destination);
        System.out.println();
        System.out.printf("%s - %.2f", stay , price);

    }
}
