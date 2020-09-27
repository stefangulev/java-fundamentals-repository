import java.util.Scanner;

public class NationalCourt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstEmployeePerHour = Integer.parseInt(scan.nextLine());
        int secondEmployeePerHour = Integer.parseInt(scan.nextLine());
        int thirdEmployeePerHour = Integer.parseInt(scan.nextLine());

        int totalClients = Integer.parseInt(scan.nextLine());
        int totalPerHour = firstEmployeePerHour + secondEmployeePerHour + thirdEmployeePerHour;
        int peopleHandled =0;
        int countHours = 0;

        while (totalClients > peopleHandled) {
            countHours++;
            if (countHours % 4 == 0) {
                countHours++;
            }
            peopleHandled += totalPerHour;

            }

        System.out.printf("Time needed: %dh.", countHours);




        }
    }

