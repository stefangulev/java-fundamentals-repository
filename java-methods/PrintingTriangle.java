import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int biggestNumber = Integer.parseInt(scan.nextLine());

        printTriangle(biggestNumber);

    }
    public static void printLine (int start, int end) {
        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
    public static void printFirstHalf (int biggestNumber) {
        for (int i = 1; i <= biggestNumber ; i++) {
            printLine(1, i);
        }
    }
    public static void printSecondHalf (int biggestNumber) {
        for (int i = biggestNumber - 1; i > 0 ; i--) {
            printLine(1, i);
        }
    }
    public static void printTriangle (int biggestNumber) {
        printFirstHalf(biggestNumber);
        printSecondHalf(biggestNumber);
    }
}
