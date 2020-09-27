import java.util.Scanner;

public class SchoolRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double w = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double wInCm = w * 100;
        double hInCm = h * 100;

        double workPlaceSizeInCm = 8400;
        double doorSize = 8400;
        double deskSize = 8400 * 2;
        double pathSize = 100* wInCm;

        double hallArea = wInCm * hInCm;
        double hallAreaTotal = hallArea - (pathSize+deskSize+doorSize);
        double deskCount = hallAreaTotal / workPlaceSizeInCm;
        System.out.printf("%.0f", deskCount);

    }
}
