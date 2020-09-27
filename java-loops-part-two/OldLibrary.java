import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String favouriteBook = scan.nextLine();
        int librarySize = Integer.parseInt(scan.nextLine());
        String currentBook = scan.nextLine();
        int bookCount = 0;
        boolean isFound = true;

        while (!currentBook.equals(favouriteBook)) {
            bookCount++;
            if (bookCount == librarySize) {
                isFound = false;
                break;
            }

            currentBook = scan.nextLine();
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", bookCount);
        } else  {
            System.out.printf("The book you search is not here!%n" +
                    "You checked %d books.", bookCount);
        }
    }
}
