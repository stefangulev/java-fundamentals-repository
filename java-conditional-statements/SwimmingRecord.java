import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scan.nextLine());
        double distanceInMeters = Double.parseDouble(scan.nextLine());
        double timeFor1MeterInSeconds = Double.parseDouble(scan.nextLine());

        double ivanTime = distanceInMeters * timeFor1MeterInSeconds;
        double slowDownTimes = Math.floor (distanceInMeters / 15);
        double actualIvanTime = ivanTime + (slowDownTimes * 12.5);
        double difference = 0;

        if (recordInSeconds > actualIvanTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", actualIvanTime);
        } else {
            difference = actualIvanTime - recordInSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }
    }
}
