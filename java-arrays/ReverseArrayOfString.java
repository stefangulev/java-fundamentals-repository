import java.util.Scanner;

public class ReverseArrayOfString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] parts = scan.nextLine().split(" ");

        for (int i = 0; i < parts.length /2 ; i++) {
            String current = parts[i];
            parts[i] = parts[parts.length - 1 - i];
            parts[parts.length - 1 - i] = current;
        }

        for (String part : parts) {
            System.out.print(part + " ");
        }
    }
}
