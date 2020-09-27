import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int passengerCountDeparture = Integer.parseInt(scan.nextLine());
        int stopsCount = Integer.parseInt(scan.nextLine());
        int currentPassengers = passengerCountDeparture;

        for (int i = 1; i <= stopsCount; i++ ) {
            int passengersLeaving = Integer.parseInt(scan.nextLine());
            int passengersComing = Integer.parseInt(scan.nextLine());

            currentPassengers = currentPassengers - passengersLeaving + passengersComing;

            if (i % 2 != 0) {
                currentPassengers += 2;
            } else {
                currentPassengers -= 2;
            }

        }
        System.out.printf("The final number of passengers is : %d", currentPassengers);

    }
}
