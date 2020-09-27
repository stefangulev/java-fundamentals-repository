import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());

        int result = calculateArea(width, length);
        System.out.println(result);

    }
    private static int calculateArea (int width, int length) {

        return width * length;
    }
}
