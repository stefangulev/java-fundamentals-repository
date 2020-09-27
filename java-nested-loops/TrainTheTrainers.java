import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int juryCount = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        double totalGrade = 0;
        double averageGrade = 0;
        double finalTotalGrade = 0;
        double totalAverageGrade = 0;
        int averageGradeCount = 0;

        while (!input.equals("Finish")) {
            for (int i = 0; i < juryCount; i++) {
                double grade = Double.parseDouble(scan.nextLine());
                totalGrade = totalGrade + grade;

            }
            averageGrade = totalGrade / juryCount;
            averageGradeCount++;
            totalAverageGrade = averageGrade + totalAverageGrade;

            System.out.printf("%s - %.2f.%n", input, averageGrade);
            totalGrade = 0;


            input = scan.nextLine();

        }
        finalTotalGrade = totalAverageGrade / averageGradeCount;
        System.out.printf("Student's final assessment is %.2f.", finalTotalGrade);

    }
}
