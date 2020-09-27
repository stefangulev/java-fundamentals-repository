import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double hallLength = Double.parseDouble(scan.nextLine());
        double hallWidth = Double.parseDouble(scan.nextLine());
        double wardrobeSide = Double.parseDouble(scan.nextLine());

        double hallArea = hallLength * hallWidth;
        double wardrobeArea = wardrobeSide * wardrobeSide;
        double benchArea = hallArea / 10;
        double freeArea = hallArea - wardrobeArea - benchArea;
        double dancersArea = 0.704 ;
        double dancersCount = freeArea / dancersArea;
        System.out.printf("%.0f" , Math.floor(dancersCount));
    }
}
