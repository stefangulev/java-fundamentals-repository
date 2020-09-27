import java.util.Scanner;

public class Scolarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double incomeInLv = Double.parseDouble(scan.nextLine());
        double averageScore = Double.parseDouble(scan.nextLine());
        double minimumWage = Double.parseDouble(scan.nextLine());
        double socialScolarshipAmount = Math.floor(minimumWage * 0.35);
        double excellentScolarshipAmount = Math.floor(averageScore * 25);

        if (incomeInLv > minimumWage && averageScore < 5.50) {
            System.out.println("You cannot get a scholarship!");
        } if (incomeInLv < minimumWage && averageScore >= 5.50 && socialScolarshipAmount > excellentScolarshipAmount) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScolarshipAmount);
        } else if (incomeInLv < minimumWage && averageScore >= 5.50 && socialScolarshipAmount <= excellentScolarshipAmount) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScolarshipAmount);
        } else if (averageScore >= 5.50) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScolarshipAmount);
        } else if (incomeInLv < minimumWage && averageScore > 4.50) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScolarshipAmount);
        }
    }
}