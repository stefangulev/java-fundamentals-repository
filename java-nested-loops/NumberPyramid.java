import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int currentNumber = 1;
        boolean isBreak = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= rows; col++) {


                System.out.print(currentNumber + " ");
                currentNumber++;

                if (currentNumber > n) {
                    isBreak = true;
                    break;
                }

            }
            if (isBreak) {
                break;
            }
            System.out.println();


        }
    }

}
