import java.util.Scanner;

public class ExperienceGaining {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double neededExperience = Double.parseDouble(scan.nextLine());
        int countOfBattles = Integer.parseInt(scan.nextLine());

        double collectExperience = 0.0;

        for (int i = 1; i <= countOfBattles ; i++) {
            double experienceEarnerPerBattle = Double.parseDouble(scan.nextLine());

            if (i % 3 ==0) {
                collectExperience += experienceEarnerPerBattle * 1.15;
            }
            if (i % 5 ==0) {
                collectExperience += experienceEarnerPerBattle * 0.9;
            }

            if (i % 3 != 0 && i % 5 != 0) {
                collectExperience += experienceEarnerPerBattle;
            }
            if (collectExperience >= neededExperience) {
                System.out.printf("Player successfully collected his needed experience for %d battles.", i);
                return;
            }
        }

        double diff = neededExperience - collectExperience;

        System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", diff);

        }

    }

