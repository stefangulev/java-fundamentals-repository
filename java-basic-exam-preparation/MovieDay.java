import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int time = Integer.parseInt(scan.nextLine());
        int scenesNumber = Integer.parseInt(scan.nextLine());
        int timePerScene = Integer.parseInt(scan.nextLine());
        double setPreparation = time * 0.15;

        double scenesTotalTime = scenesNumber * timePerScene;
        double totalTaken = setPreparation + scenesTotalTime;

        double finalTime = time - totalTaken;

        if (finalTime >= 0) {
            double timeLeft = Math.round(time - totalTaken);
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", timeLeft);
        } else {
            double timeNeeded = totalTaken - time;
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", timeNeeded);
        }




    }
}
