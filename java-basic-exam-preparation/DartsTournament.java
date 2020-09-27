import java.util.Scanner;

public class DartsTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int points = Integer.parseInt(scan.nextLine());
        String sector = scan.nextLine();
       boolean isBullsEye = false;
       int movesCount = 1;

        while (points > 0) {

            if (sector.equals("bullseye")){
                isBullsEye = true;
                break;
            }


            int pointsHit = Integer.parseInt(scan.nextLine());

            if (sector.equals("number section")) {
                points = points - pointsHit;
            } else if (sector.equals("double ring")) {
                points = points - (pointsHit * 2);
            } else if (sector.equals("triple ring")) {
                points = points - (pointsHit * 3);
            }
            if (points <= 0) {
                break;
            }
            sector = scan.nextLine();
            movesCount++;
        }
        if (points == 0) {
            System.out.printf("Congratulations! You won the game in %d moves!", movesCount);
        } else if (isBullsEye) {
            System.out.printf("Congratulations! You won the game with a bullseye in %d moves!", movesCount);
        } else if (points < 0) {
            System.out.printf("Sorry, you lost. Score difference: %d.", Math.abs(points));
        }

    }
}
