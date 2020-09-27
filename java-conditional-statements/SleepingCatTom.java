import java.util.Scanner;

public class SleepingCatTom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int holidays = Integer.parseInt(scan.nextLine());
        int normForPlayInMinutesPerYear = 30000;
        int playTimeOnWorkingDayInMinutes = 63;
        int playTimeOnHolidayInMinutes = 127;
        int actualWorkingDays = 365 - holidays;
        int actualPlayTime = (actualWorkingDays * playTimeOnWorkingDayInMinutes) + (holidays * playTimeOnHolidayInMinutes);
        double differenceFromNorm = 0;
        double differenceFromNormInHours = 0;
        double differenceFromNormInMinutes = 0;

        if (actualPlayTime > normForPlayInMinutesPerYear) {
            differenceFromNorm = actualPlayTime - normForPlayInMinutesPerYear;
            differenceFromNormInHours = Math.floor(differenceFromNorm / 60);
            differenceFromNormInMinutes = differenceFromNorm % 60;
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", differenceFromNormInHours, differenceFromNormInMinutes);
        } else {
            differenceFromNorm = normForPlayInMinutesPerYear - actualPlayTime;
            differenceFromNormInHours = Math.floor(differenceFromNorm / 60);
            differenceFromNormInMinutes = differenceFromNorm % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", differenceFromNormInHours, differenceFromNormInMinutes);
        }
    }

}
