import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int failCount = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int currentFailCount = 0;
        int totalGradeScore = 0;
        int gradeCount = 0;
        String lastProblem = "";

        while (!input.equals("Enough")) {
            int grade = Integer.parseInt(scan.nextLine());
            totalGradeScore +=grade;
            gradeCount++;
            lastProblem = input;
            if(grade <= 4) {
                currentFailCount++;
                if (currentFailCount == failCount) {
                    break;
                }
            }

            input = scan.nextLine();

        }
        double averageScore = 1.0 * totalGradeScore / gradeCount;
        if (input.equals("Enough")) {
            System.out.printf("Average score: %.2f%n" +
                    "Number of problems: %d%n" +
                    "Last problem: %s", averageScore, gradeCount, lastProblem);
        } else {
            System.out.printf("You need a break, %d poor grades.", currentFailCount);
        }
    }
}
