import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        double washingMachinePrice = Double.parseDouble(scan.nextLine());
        int pricePerToy = Integer.parseInt(scan.nextLine());
        int birthDayMoney = 0;
        int totalBirthDayMoney = 0;
        int toysCnt = 0;
        int totalToysMoney = 0;
        double totalCollectedMoney = 0;


        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                birthDayMoney = birthDayMoney + (5*i) - 1;
            } else {
                toysCnt = toysCnt + 1;

            }


        } totalToysMoney = toysCnt * pricePerToy;
        totalCollectedMoney = birthDayMoney + totalToysMoney;
        if (totalCollectedMoney >= washingMachinePrice) {
            double moneyLeft = totalCollectedMoney - washingMachinePrice;
            System.out.printf("Yes! %.2f", moneyLeft);

        } else {
            double moneyNeeded = washingMachinePrice - totalCollectedMoney;
            System.out.printf("No! %.2f ", moneyNeeded);

        }
    }
}
