import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while (!input.equals("END")) {

            palindometer(input);

            input = scan.nextLine();
        }
    }
    private static void palindometer (String input) {
        boolean isTrue = false;
        String reversedInput = "";
        for (int i = input.length() - 1; i >= 0 ; i--) {
            reversedInput += input.charAt(i);
        }
        if (reversedInput.equals(input)) {
            isTrue = true;
        }

        System.out.println(isTrue);

    }
}
