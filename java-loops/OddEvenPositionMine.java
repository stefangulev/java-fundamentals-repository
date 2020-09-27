import java.util.Scanner;

public class OddEvenPositionMine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
double max = -1000000000.0;
double min = 1000000000.0;
        double evenSum = 0;
        double evenMax = -1000000000.0;
        double evenMin = 1000000000.0;
        double oddSum = 0;
        double oddMax = -1000000000.0;
        double oddMin = 1000000000.0;

        for (int i = 1; i <=n; i++) {
            double currentNumber = Double.parseDouble(scan.nextLine());

            if (i % 2 == 0) {
                evenSum = evenSum + currentNumber;
                if (currentNumber > evenMax) {
                    evenMax = currentNumber;
                } if (currentNumber < evenMin) {
                    evenMin = currentNumber;
                }

            } else {
                oddSum = oddSum + currentNumber;
                if (currentNumber > oddMax) {
                    oddMax = currentNumber;
                } if (currentNumber < oddMin) {
                    oddMin = currentNumber;
                }

            }

        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddMin == min) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", oddMin);
        } if (oddMax == max) {
            System.out.println("OddMax=No,");
        } else {

            System.out.printf("OddMax=%.2f,%n", oddMax);
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenMin == min) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
        } if (evenMax == max) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.2f%n", evenMax);
        }
    }
}
