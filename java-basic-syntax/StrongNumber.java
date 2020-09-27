import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        int currentSum = 0;
        int totalSum = 0;

        for (int i = 0; i < input.length() ; i++) {
            totalSum += currentSum;
            currentSum = 1;
           char currentChar = input.charAt(i);
           int currentNumber = Character.getNumericValue(currentChar);
            for (int j = currentNumber; j > 0 ; j--) {
                currentSum *= j;
            }
        }
        if (totalSum + currentSum == Integer.parseInt(input)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
