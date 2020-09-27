import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade = Double.parseDouble(scan.nextLine());

        printGradeInWords(grade);
    }

    public static void printGradeInWords (double gradeInNumbers) {
        String grade = "";
        if (gradeInNumbers >= 2.00 && gradeInNumbers < 3.00) {
            grade = "Fail";

        } else if ( gradeInNumbers >= 3.00 && gradeInNumbers < 3.50) {
            grade = "Poor";
        } else if (gradeInNumbers >= 3.50 && gradeInNumbers < 4.50) {
            grade = "Good";
        } else if (gradeInNumbers >= 4.50 && gradeInNumbers < 5.50) {
            grade = "Very good";
        } else if (gradeInNumbers >= 5.50 && gradeInNumbers <= 6.00) {
            grade = "Excellent";
        }
        System.out.println(grade);
    }
}
