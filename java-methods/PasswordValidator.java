import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();
        boolean isValid = false;

        boolean validLength = validateLength(password);
        boolean validContent = validateContent(password);
        boolean validDigits = validateNumberOfDigits(password);
        if(validLength && validContent && validDigits) {
            System.out.println("Password is valid");
        }
    }


    private static boolean validateLength(String password) {
        boolean isValid = false;
        if (password.length() >= 6 & password.length() <= 10) {

            isValid = true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
        }
        return isValid;
    }

    private static boolean validateContent(String password) {
        boolean isValid = false;
        for (int i = 0; i < password.length(); i++) {
            int currentChar = password.charAt(i);
            if ((currentChar >= 48 && currentChar <= 57) || (currentChar >= 65 && currentChar <= 90) || (currentChar >= 97 && currentChar <= 122)) {
                isValid = true;

            } else {
                isValid = false;
                System.out.println("Password must consist only of letters and digits");
                break;
            }
        }
        return isValid;

    }

    private static boolean validateNumberOfDigits(String password) {
        boolean isValid = false;
        int digitsCount = 0;
        for (int i = 0; i < password.length(); i++) {
            int currentChar = password.charAt(i);
            if (currentChar >= 48 && currentChar <= 57) {
                digitsCount += 1;
            }
        }
        if (digitsCount >= 2) {
            isValid = true;

        } else {
            System.out.println("Password must have at least 2 digits");
        }
        return isValid;
    }

}
