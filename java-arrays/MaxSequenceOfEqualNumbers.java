import java.util.Scanner;

public class MaxSequenceOfEqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        String currentSymbol = " ";
        int count = 1;
        int currentBiggestStreak = Integer.MIN_VALUE;

        for (int i = 0; i < input.length - 1; i++) {

            if (input[i].equals(input[i +1])) {
                count++;
                if (count > currentBiggestStreak) {
                    currentSymbol = input[i];
                    currentBiggestStreak = count;

                }
            } else {
                count = 1;
            }
        }



        for (int j = 0; j < currentBiggestStreak; j++) {
            System.out.print(currentSymbol + " ");
        }
    }
}