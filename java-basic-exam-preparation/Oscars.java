import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String actorName = scan.nextLine();
        double startingPoints = Double.parseDouble(scan.nextLine());
        int judgesNumber = Integer.parseInt(scan.nextLine());
        double totalPointsPerJudge = 0;
        double actorPoints = startingPoints;
        boolean isNominated = false;

        for (int i = 0; i < judgesNumber; i++) {
            String judgeName = scan.nextLine();
            double pointsGiven = Double.parseDouble(scan.nextLine());

            totalPointsPerJudge = (judgeName.length() * pointsGiven) / 2;
            actorPoints = actorPoints + totalPointsPerJudge;

            if(actorPoints >= 1250.5) {
                isNominated = true;
                break;
            }

        }
        if (isNominated) {
        System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, actorPoints);
    } else {
            double pointsNeeded = 1250.5 - actorPoints;
            System.out.printf("Sorry, %s you need %.1f more!", actorName, pointsNeeded);
        }

    }
}
