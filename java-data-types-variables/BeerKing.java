import java.util.Scanner;

public class BeerKing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double biggestVolume = Double.MIN_VALUE;
        String biggestName = " ";

        for (int i = 0; i < n ; i++) {
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());
            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > biggestVolume) {
                biggestVolume = volume;
                biggestName = model;
            }
        }
        System.out.println(biggestName);
    }
}
