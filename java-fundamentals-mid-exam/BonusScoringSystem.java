import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countOfStudents = Integer.parseInt(scan.nextLine());
        int countOfLectures = Integer.parseInt(scan.nextLine());
        int additionalBones = Integer.parseInt(scan.nextLine());

        double totalBonus = Double.MIN_VALUE;
        int attendances = 0;

        for (int i = 0; i < countOfStudents ; i++) {
            int countOfAttendance = Integer.parseInt(scan.nextLine());

            double currentTotalBonus = Math.round(1.0 *countOfAttendance / countOfLectures * (5 + additionalBones));
            if (currentTotalBonus > totalBonus) {
                totalBonus = currentTotalBonus;
                attendances = countOfAttendance;

            }


        }
        System.out.printf("Max Bonus: %.0f.%n", totalBonus);
        System.out.printf("The student has attended %d lectures.", attendances);
    }
}
