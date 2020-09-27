import java.util.Scanner;

public class BiscuitsFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int biscuitsProducedPerDayPerWorker = Integer.parseInt(scan.nextLine());
        int totalWorkers = Integer.parseInt(scan.nextLine());
        int productionOfTheOtherCompany = Integer.parseInt(scan.nextLine());

        double totalProductionPerDay = Math.floor(totalWorkers * biscuitsProducedPerDayPerWorker);
        double totalProduced = 0.0;

        for (int i = 1; i <= 30 ; i++) {

            if (i % 3 ==0) {
                totalProduced += Math.floor(totalProductionPerDay * 0.75);
            } else {
                totalProduced += totalProductionPerDay;
            }
        }
        System.out.printf("You have produced %.0f biscuits for the past month.%n", totalProduced);

        if (totalProduced > productionOfTheOtherCompany) {
            double diff = totalProduced - productionOfTheOtherCompany;
            double percentage = (diff/productionOfTheOtherCompany) * 100;
            System.out.printf("You produce %.2f percent more biscuits.", percentage);
        } else {
            double diff = productionOfTheOtherCompany - totalProduced;
            double percentage = (diff/productionOfTheOtherCompany) * 100;
            System.out.printf("You produce %.2f percent less biscuits.", Math.abs(percentage));
        }
    }


}
