import java.util.Scanner;

public class ExcellentGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grade = Double.parseDouble(scan.nextLine());

        if (grade >= 5.50) {
            System.out.println("Excellent!");
        }
    }
}
