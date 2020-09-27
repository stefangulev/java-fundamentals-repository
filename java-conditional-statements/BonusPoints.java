import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int points = Integer.parseInt(scan.nextLine());
        double bonusPoints = 0;
        double totalPoints = points;

        if (points <= 100) {
            bonusPoints = 5;
            totalPoints = totalPoints + bonusPoints;

        } else if (points <= 1000) {
            bonusPoints = points * 0.2;
            totalPoints = totalPoints + bonusPoints;
        } else {
            bonusPoints = points * 0.1;
            totalPoints = totalPoints + bonusPoints;
        } if (points % 2 == 0) {
            bonusPoints = bonusPoints + 1;
            totalPoints = totalPoints + 1;
        } else if (points % 10 == 5) {
            bonusPoints = bonusPoints + 2;
            totalPoints = totalPoints + 2;
        }
        System.out.println(bonusPoints);
        System.out.println(totalPoints);
    }
}
