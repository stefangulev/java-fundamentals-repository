import java.util.Scanner;

public class BackIn30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        minutes += 30;

        if (minutes > 60) {
            hours +=1;
            minutes -= 60;
        }

        if (hours > 23) {
            hours -= 24;
        }

        if (minutes > 10) {
            System.out.printf("%d:%d", hours,minutes);
        } else {
            System.out.printf("%d:0%d", hours,minutes);
        }
    }
}
