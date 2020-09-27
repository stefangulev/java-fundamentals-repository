import java.util.Scanner;

public class CruiseGames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int gamesCount = Integer.parseInt(scan.nextLine());
        double tennisPoints = 0;
        double volleyballPoints = 0;
        double badmintonPoints = 0;
        double totalPoints = 0;
        double tennisGameCount = 0;
        double volleyballGameCount = 0;
        double badmintonGameCount = 0;

        for (int i = 0; i < gamesCount; i++) {
            String gameName = scan.nextLine();

            int pointsCount = Integer.parseInt(scan.nextLine());

            switch (gameName) {
                case "tennis":
                    tennisPoints += pointsCount + (pointsCount * 0.05);
                    tennisGameCount++;
                    break;
                case "volleyball":
                    volleyballPoints += pointsCount + (pointsCount * 0.07);
                    volleyballGameCount++;
                    break;
                case "badminton":
                    badmintonPoints += pointsCount + (pointsCount * 0.02);
                    badmintonGameCount++;
                    break;
            }

        }
        double averageTennisPoint = tennisPoints / tennisGameCount;
        double averageVolleyballPoint = volleyballPoints / volleyballGameCount;
        double averageBadmintonPoint = badmintonPoints / badmintonGameCount;
        totalPoints = tennisPoints + volleyballPoints + badmintonPoints;
        if (averageTennisPoint >= 75 && averageBadmintonPoint >= 75 && averageVolleyballPoint >= 75) {
            System.out.printf("Congratulations, %s! You won the cruise games with %.0f points.", name, Math.floor(totalPoints));
        } else {
            System.out.printf("Sorry, %s, you lost. Your points are only %.0f.", name , Math.floor(totalPoints));
        }
    }
}
