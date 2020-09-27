import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double USD = Double.parseDouble(scan.nextLine());
        double BGN = USD * 1.79549;
        System.out.printf( "%.2f" , BGN);
    }
}
