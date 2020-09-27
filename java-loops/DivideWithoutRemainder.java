import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double countP1 = 0;
        double countP2 = 0;
        double countP3 = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());

            if (currentNumber % 2 == 0) {
                countP1 = countP1 + 1;

            } if (currentNumber % 3 == 0) {
                countP2 = countP2 + 1;

            } if (currentNumber % 4 == 0) {
                countP3 = countP3 + 1;

            }

        } p1 = countP1 / n * 100;
        p2 = countP2 / n * 100;
        p3 = countP3 / n * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
    }
}
