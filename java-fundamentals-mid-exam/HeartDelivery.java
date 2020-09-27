import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] neighborhood = Arrays.stream(scan.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();

        String input = scan.nextLine();
        int currentPosition = 0;

        while (!input.equals("Love!")) {
            String[] commands = input.split(" ");
            int range = Integer.parseInt(commands[1]);

            currentPosition += range;

            if (currentPosition < neighborhood.length) {
                if (neighborhood[currentPosition] > 0) {
                    neighborhood[currentPosition] = neighborhood[currentPosition] - 2;
                    if (neighborhood[currentPosition] == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", currentPosition);
                    }
                } else {
                    System.out.printf("Place %d already had Valentine's day.%n", currentPosition);
                }
            } else {
                currentPosition = 0;
                if (neighborhood[currentPosition] > 0) {
                    neighborhood[currentPosition] = neighborhood[currentPosition] - 2;
                    if (neighborhood[currentPosition] == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", currentPosition);
                    }

                    } else {
                    System.out.printf("Place %d already had Valentine's day.%n", currentPosition);

                }

            }
            input = scan.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", currentPosition);
        int countFailed = 0;
        for (int i : neighborhood) {
            if (i != 0) {
                countFailed++;
            }
        }
        if (countFailed == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", countFailed);
        }
    }
}