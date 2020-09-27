import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();

        if (type.equals("string")) {
            String firstInput = scan.nextLine();
            String secondInput = scan.nextLine();
            String result = compareString(firstInput, secondInput);
            System.out.println(result);

        } else if (type.equals("int")) {
            int firstInput = Integer.parseInt(scan.nextLine());
            int secondInput = Integer.parseInt(scan.nextLine());
            int result = compareInt(firstInput, secondInput);
            System.out.println(result);

        } else if (type.equals("char")) {
            char firstInput = scan.nextLine().charAt(0);
            char secondInput = scan.nextLine().charAt(0);
            char result = compareChar(firstInput, secondInput);
            System.out.println(result);
        }

    }

    public static int compareInt(int firstInput, int secondInput) {
        return Math.max(firstInput, secondInput);

    }

    public static char compareChar(char firstInput, char secondInput) {
        char biggestChar = secondInput;
        if (firstInput > secondInput) {
            biggestChar = firstInput;
        }
        return biggestChar;
    }

    public static String compareString(String firstInput, String secondInput) {
        String biggerString = secondInput;
        if (firstInput.compareTo(secondInput) > 0) {
            biggerString = firstInput;


        }
        return biggerString;
    }

}
