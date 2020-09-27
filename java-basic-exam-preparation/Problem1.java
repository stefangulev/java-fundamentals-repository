import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double skumriqPrice = Double.parseDouble(scan.nextLine());
        double cacaPrice = Double.parseDouble(scan.nextLine());
        double palamudKilograms = Double.parseDouble(scan.nextLine());
        double safriddKilograms = Double.parseDouble(scan.nextLine());
        double midiKilograms = Double.parseDouble(scan.nextLine());

        double palamudPrice = skumriqPrice * 1.6;
        double safridPrice = cacaPrice * 1.8;
        double midiPrice = 7.50;

        double totalPalamud = palamudKilograms * palamudPrice;
        double totalSafrid = safriddKilograms * safridPrice;
        double totalMidi = midiKilograms * midiPrice;

        double totalPrice = totalMidi + totalPalamud + totalSafrid;

        System.out.printf("%.2f", totalPrice);






    }
}
