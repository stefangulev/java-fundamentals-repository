import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double meters = Double.parseDouble(scan.nextLine());
        double Sum = meters * 7.61;
        double discount = Sum * 0.18;
        double totalSum = Sum - discount;
        System.out.printf("The final price is: %.2f lv." , totalSum);
        System.out.println();
        System.out.printf("The discount is: %.2f lv." , discount);
    }
}
