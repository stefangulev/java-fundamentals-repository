import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int totalArea = width * length * height;
        int takenArea = 0;

        while (!input.equals("Done")) {
            int inputNumbers = Integer.parseInt(input);
            takenArea = takenArea + inputNumbers;

            if (takenArea >= totalArea) {
                break;
            } else {
                input = scan.nextLine();

            }

        }
        if (takenArea < totalArea) {
            double areaLeft = totalArea - takenArea;
            System.out.printf("%.0f Cubic meters left.", areaLeft);
        } else {
            double areaNeeded = takenArea - totalArea;
            System.out.printf("No more free space! You need %.0f Cubic meters more.",areaNeeded );
        }
    }
}
