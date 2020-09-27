import java.util.Scanner;

public class InchToCentimeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double inch = Double.parseDouble(input);
        double centimeters = inch * 2.54;
        System.out.println(centimeters);
    }
}
