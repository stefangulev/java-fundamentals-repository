import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hoursNeeded = Integer.parseInt(scan.nextLine());
        int daysAvailable = Integer.parseInt(scan.nextLine());
        int overTimeEmployeesCnt = Integer.parseInt(scan.nextLine());

       double actualDays = daysAvailable * 0.9;
       double workingHours = actualDays * 8;
       double overtimeHours = overTimeEmployeesCnt * (2 * daysAvailable);
       double actualHoursAvailable = workingHours + overtimeHours;

        if (hoursNeeded <= actualHoursAvailable) {
            double hoursLeft = Math.ceil(actualHoursAvailable - hoursNeeded);
            System.out.printf("Yes!%.0f hours left.", Math.ceil(hoursLeft));
        } else {
            double hoursNotLeft = Math.ceil(hoursNeeded - actualHoursAvailable);
            System.out.printf("Not enough time!%.0f hours needed.", hoursNotLeft);
        }


    }
}
