import java.util.Scanner;

public class ExamPreperationMine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int badGradeLimit = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int gradeCount = 0;
        int gradeSum = 0;
        int badGradeCount = 0;
        String lastProblem = "";

        while (!input.equals("Enough")) {
            int grade = Integer.parseInt(scan.nextLine());
            gradeCount++;
            gradeSum = gradeSum + grade;


            if (grade <= 4) {
                badGradeCount++;

            } if (badGradeCount == badGradeLimit) {
                break;
            }

            input = scan.nextLine();
            if (!input.equals("Enough")) {
                lastProblem = input;
            }

        }
        double averageGrade = 1.0 * gradeSum / gradeCount;

        if (badGradeCount == badGradeLimit) {
            System.out.printf("You need a break, %d poor grades.", badGradeCount);
        } else {
            System.out.printf("Average score: %.2f%n", averageGrade);
            System.out.printf("Number of problems: %d%n", gradeCount);
            System.out.printf("Last problem: %s", lastProblem);
        }

    }
}
