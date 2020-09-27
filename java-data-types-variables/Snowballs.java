import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int bestBall = Integer.MIN_VALUE;
        int bestSnowballSnow = 0;
        int bestSnowBallTime = 0;
        int bestSnowBallQuality = 0;

        for (int i = 0; i < n ; i++) {
            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());
            int division = snowballSnow / snowballTime;

            int snowballValue = (int) Math.pow(division, snowballQuality);
            if (snowballValue > bestBall) {
                bestBall = snowballValue;
                bestSnowballSnow = snowballSnow;
                bestSnowBallTime = snowballTime;
                bestSnowBallQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %d (%d)", bestSnowballSnow, bestSnowBallTime, bestBall, bestSnowBallQuality);
    }
}
