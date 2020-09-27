import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scan.nextLine());
        String groupType = scan.nextLine();
        String day = scan.nextLine();
        double pricePerPerson = 0;
        double totalPrice = 0;

        switch (groupType) {
            case "Students":
                if (day.equals("Friday")) {
                    pricePerPerson = 8.45;
                } else if (day.equals("Saturday")) {
                    pricePerPerson = 9.80;
                } else if (day.equals("Sunday")) {
                    pricePerPerson = 10.46;
            }
                totalPrice = pricePerPerson * peopleCount;
                if (peopleCount >= 30) {
                    totalPrice *= 0.85;
                }
                break;
            case "Business":
                if (day.equals("Friday")) {
                    pricePerPerson = 10.90;
                } else if (day.equals("Saturday")) {
                    pricePerPerson = 15.60;
                } else if (day.equals("Sunday")) {
                    pricePerPerson = 16.0;
                }
                totalPrice = pricePerPerson * peopleCount;
                if (peopleCount >= 100) {
                    totalPrice -= (pricePerPerson * 10);
                }
                break;
            case "Regular":
                if (day.equals("Friday")) {
                    pricePerPerson = 15.0;
                } else if (day.equals("Saturday")) {
                    pricePerPerson = 20.0;
                } else if (day.equals("Sunday")) {
                    pricePerPerson = 22.50;
                }
                totalPrice = pricePerPerson * peopleCount;
                if (peopleCount >= 10 && peopleCount <= 20) {
                    totalPrice -= (totalPrice * 0.05);
                }
                break;
        }
        String result = String.format("Total price: %.2f", totalPrice);
        System.out.println(result);
    }
}
