import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String season = scan.nextLine();
        String groupType = scan.nextLine();
        int studentCount = Integer.parseInt(scan.nextLine());
        int nightsCount = Integer.parseInt(scan.nextLine());
        double pricePerNight = 0;
        String sport = "";

        if (season.equals("Winter")) {
            if (groupType.equals("boys")) {
                pricePerNight = 9.60;
                sport = "Judo";


            } else if (groupType.equals("girls")) {
                pricePerNight = 9.60;
                sport = "Gymnastics";
            } else if (groupType.equals("mixed")) {
                pricePerNight = 10;
                sport = "Ski";
            }
        } else if (season.equals("Spring")) {
            if (groupType.equals("boys")) {
                pricePerNight = 7.20;
                sport = "Tennis";
            } else if (groupType.equals("girls")) {
                pricePerNight = 7.20;
                sport = "Athletics";

            } else if (groupType.equals("mixed")) {
                pricePerNight = 9.50;
                sport = "Cycling";
            }

        } else if (season.equals("Summer")) {
            if (groupType.equals("boys")) {
                pricePerNight = 15;
                sport = "Football";
            } else if (groupType.equals("girls")) {
                pricePerNight = 15;
                sport = "Volleyball";
            } else if (groupType.equals("mixed")) {
                pricePerNight = 20;
                sport = "Swimming";
            }
        } double totalPrice = pricePerNight * studentCount *nightsCount;

        if (studentCount >= 50) {
            totalPrice = totalPrice /2;
        } else if (studentCount >= 20 && studentCount < 50) {
            totalPrice = totalPrice * 0.85;
        } else if (studentCount >= 10 && studentCount < 20) {
            totalPrice = totalPrice * 0.95;

        }
        System.out.printf("%s %.2f lv.", sport , totalPrice);
    }
}
