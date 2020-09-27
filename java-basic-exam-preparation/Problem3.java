import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int hoursSpent = Integer.parseInt(scan.nextLine());
        int studentsCount = Integer.parseInt(scan.nextLine());
        String dayTime = scan.nextLine();
        double pricePerPerson = 0;


        if (month.equals("march") || month.equals("april") || month.equals("may")) {

            if (dayTime.equals("day")) {
                pricePerPerson = 10.5;

            } else if (dayTime.equals("night")) {
                pricePerPerson = 8.4;
            }
        } else if (month.equals("june") || month.equals("july") || month.equals("august")) {
            if (dayTime.equals("day")) {
                pricePerPerson = 12.6;

            } else if (dayTime.equals("night")) {
                pricePerPerson = 10.2;
            }

        }


        if (studentsCount >= 4) {
            pricePerPerson = pricePerPerson * 0.9;
        }

        if (hoursSpent >= 5) {
            pricePerPerson = pricePerPerson / 2;
        }

        double totalPrice = (pricePerPerson * studentsCount) * hoursSpent;

        System.out.printf("Price per person for one hour: %.2f%n", pricePerPerson);
        System.out.printf("Total cost of the visit: %.2f", totalPrice);

    }
}
//•	На първия ред: "Price per person for one hour: {цена на човек на час}"
  //      •	На втория ред: "Total cost of the visit: {общата сума}"

