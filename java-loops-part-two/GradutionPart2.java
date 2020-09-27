import java.util.Scanner;

public class GradutionPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int gradeCount = 0;
        double totalGrade = 0.0;
        int badGradeCount = 0;

        while (gradeCount < 12) {
            double grade = Double.parseDouble(scan.nextLine());
            if (grade >= 4){
                gradeCount++;
                totalGrade = totalGrade + grade;

            } else {
                badGradeCount++;
            }
            if (badGradeCount > 1) {
                break;
            }

        } if (badGradeCount > 1) {
            System.out.printf("%s has been excluded at %d grade", name, gradeCount + 1);
        } else {
            double averageGrade = totalGrade / gradeCount;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }
    }
}
