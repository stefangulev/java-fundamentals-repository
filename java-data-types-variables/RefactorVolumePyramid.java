import java.util.Scanner;

public class RefactorVolumePyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Length: ");
       double length = Double.parseDouble(scan.nextLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(scan.nextLine());
        System.out.print("Height: ");
        double height = Double.parseDouble(scan.nextLine());
        System.out.printf("Pyramid Volume: %.2f", (length * height * width) / 3);
    }
}
