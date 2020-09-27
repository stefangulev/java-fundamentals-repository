import java.util.Scanner;

public class OldLibraryMine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String favouriteBook = scan.nextLine();
        int librarySize = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int count = 0;

        while (!favouriteBook.equals(input)) {
            count++;

            if (count >= librarySize) {
                break;
            }
            input = scan.nextLine();

        } if (count >= librarySize) {
            System.out.printf("The book you search is not here!%nYou checked %d books.", count);
        } else {
            System.out.printf("You checked %d books and found it.", count);
        }


    }
}
