import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int totalMinutes = minutes + 15;

        if (totalMinutes <= 59) {
            hour = hour + 0;
            totalMinutes = totalMinutes + 0;

        } else if (totalMinutes > 59) {
            hour = hour + 1;
            totalMinutes = totalMinutes % 60;


            } if (hour > 23) {
             hour = hour % 24;

        } if (totalMinutes < 10) {
            System.out.println(hour + ":0" + totalMinutes);
        } else {
            System.out.println( hour + ":" + totalMinutes);
        }
    }
}

