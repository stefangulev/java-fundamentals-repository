import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        boolean isNumberValid = number >= 100 && number <= 200 || number == 0;

        if (!isNumberValid) {
            System.out.println("invalid");
        }

        }


    }
