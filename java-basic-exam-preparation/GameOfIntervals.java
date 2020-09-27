import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int movesCount = Integer.parseInt(scan.nextLine());
        double totalPoints = 0;

        int count0To9 = 0;
        int count10To19 = 0;
        int count20To29 = 0;
        int count30To39 = 0;
        int count40To50 = 0;
        int countInvalid = 0;

        for (int i = 0; i < movesCount; i++) {
        int currentNumber = Integer.parseInt(scan.nextLine());

          if (currentNumber >= 0 && currentNumber <= 9 ) {
              totalPoints = totalPoints + (currentNumber * 0.2);
              count0To9++;
          } else if (currentNumber >= 10 && currentNumber <= 19) {
              totalPoints = totalPoints + (currentNumber * 0.3);
              count10To19++;
          } else if (currentNumber >= 20 && currentNumber <= 29 ) {
              totalPoints = totalPoints + (currentNumber * 0.4);
              count20To29++;
            } else if (currentNumber >= 30 && currentNumber <= 39 ) {
              count30To39++;
              totalPoints = totalPoints + 50;
          } else if (currentNumber >= 40 && currentNumber <= 50) {
              totalPoints = totalPoints + 100;
              count40To50++;
          } else if (currentNumber < 0 || currentNumber > 50) {
              totalPoints = totalPoints / 2;
              countInvalid++;
          }
        }
        double percentage0to9 = 1.0 * count0To9 / movesCount * 100;
        double percentage10to19 = 1.0 * count10To19 / movesCount * 100;
        double percentage20to29 = 1.0 * count20To29 / movesCount * 100;
        double percentage30to39 = 1.0 * count30To39 / movesCount * 100;
        double percentage40to50 = 1.0 * count40To50 / movesCount * 100;
        double percentageInvalid = 1.0 * countInvalid / movesCount * 100;

        System.out.printf("%.2f%n", totalPoints);
        System.out.printf("From 0 to 9: %.2f%%%n", percentage0to9);
        System.out.printf("From 10 to 19: %.2f%%%n", percentage10to19);
        System.out.printf("From 20 to 29: %.2f%%%n", percentage20to29);
        System.out.printf("From 30 to 39: %.2f%%%n", percentage30to39);
        System.out.printf("From 40 to 50: %.2f%%%n", percentage40to50);
        System.out.printf("Invalid numbers: %.2f%%%n",percentageInvalid );


    }
}
