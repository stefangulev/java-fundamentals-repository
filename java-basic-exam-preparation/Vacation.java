import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String stay = "";
        String location = "";
        double price = 0;

        if (budget <= 1000) {
            stay = "Camp";

            if (season.equals("Summer")) {
                location = "Alaska";
                price = budget * 0.65;


            } else if (season.equals("Winter")) {
                location = "Morocco";
                price = budget * 0.45;


            }

        } else if (budget > 1000 && budget <= 3000) {
            stay = "Hut";
            if (season.equals("Summer")) {
                location = "Alaska";
                price = budget * 0.8;
            } else if (season.equals("Winter")) {
                location = "Morocco";
                price = budget * 0.6;

            }
                } else if (budget > 3000) {
            stay = "Hotel";
            if (season.equals("Summer")) {
                location = "Alaska";
                price = budget * 0.9;


            } else if (season.equals("Winter")) {
                location = "Morocco";
                price = budget * 0.9;
            }
        }
        System.out.printf("%s - %s - %.2f", location, stay, price);
    }
}
