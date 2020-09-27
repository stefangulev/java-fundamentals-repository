import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int centimeters = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
       double percentage = Double.parseDouble(scan.nextLine());
       double volume = centimeters * width * length;
       double liters = volume * 0.001;
       double stuff = liters * percentage / 100;
       double totalLiters = liters - stuff;
               System.out.printf("%.3f", totalLiters);



    }
}
