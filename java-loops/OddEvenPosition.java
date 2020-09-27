import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double oddSum = 0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;

        double evenSum = 0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;


        for (int i = 1; i <= n; i++) {
            double current = Double.parseDouble(scan.nextLine());

            if (i % 2 == 0) {
                evenSum += current;
                if (current > evenMax) {
                    evenMax = current;
                }
                if (current < evenMin) {
                    evenMin = current;
                }
            } else {
                oddSum += current;
            }
            if (current > oddMax) {
                oddMax = current;
            }
            if (current < evenMin) {
                evenMin = current;
            }
        }
        //nedovurshena, izpusnah mu shemata.
    }
}
