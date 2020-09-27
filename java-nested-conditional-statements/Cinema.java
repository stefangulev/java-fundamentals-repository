import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String projection = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());
        double ticketPrice = 0;

        if(projection.equals("Premiere")) {
            ticketPrice = 12.00;

        } else if(projection.equals("Normal")) {
            ticketPrice = 7.50;

        } else if (projection.equals("Discount")) {
            ticketPrice = 5.00;
        }
double totalPrice = ticketPrice * rows * columns;

        System.out.printf("%.2f leva" , totalPrice);

    }
}
