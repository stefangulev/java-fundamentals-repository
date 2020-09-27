import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstTime = Integer.parseInt(scan.nextLine());
        int secondTime = Integer.parseInt(scan.nextLine());
        int thirdTime = Integer.parseInt(scan.nextLine());

        int totalSeconds = firstTime + secondTime + thirdTime;
        int timeInMinutes = totalSeconds / 60;
        int timeInSeconds = totalSeconds % 60;

        if (timeInSeconds < 10) {
            System.out.println(timeInMinutes + ":0" + timeInSeconds);
        } else {
            System.out.println(timeInMinutes + ":" + timeInSeconds);
        }
    }
}
