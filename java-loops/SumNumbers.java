import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int currentNumber = 0;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            currentNumber = Integer.parseInt(scan.nextLine());
            totalSum = totalSum + currentNumber;


        }
        System.out.println(totalSum);
    }
}
