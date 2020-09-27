import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int kidsCount = 0;
        int adultsCount = 0;
        int toysCount = 0;
        int sweaterCount = 0;

        while(!input.equals("Christmas")) {
            int age = Integer.parseInt(input);

            if (age <= 16) {
                kidsCount++;
                toysCount++;

            } else if (age > 16) {
                adultsCount++;
                sweaterCount++;
            }
            input = scan.nextLine();
        }
        double totalPriceToys = toysCount * 5;
        double totalPriceSweaters = sweaterCount * 15;

        System.out.printf("Number of adults: %d%n", adultsCount);
        System.out.printf("Number of kids: %d%n", kidsCount);
        System.out.printf("Money for toys: %.0f%n", totalPriceToys);
        System.out.printf("Money for sweaters: %.0f%n", totalPriceSweaters);
    }
}
