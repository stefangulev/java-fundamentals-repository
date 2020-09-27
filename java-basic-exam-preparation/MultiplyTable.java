import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        char ch1 = input.charAt(0);
        char ch2 = input.charAt(1);
        char ch3 = input.charAt(2);

        int num1 = Character.getNumericValue(ch1);
        int num2 = Character.getNumericValue(ch2);
        int num3 = Character.getNumericValue(ch3);
        int totalSum = 0;


        for (int i = 1; i <= num3; i++) {
            for (int j = 1; j <=num2; j++) {
                for (int k = 1; k <=num1; k++) {
                    totalSum = i * j *k;
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, totalSum);

                }

            }
        }
    }
}


