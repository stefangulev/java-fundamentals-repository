import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> bookShelf = Arrays.stream(scan.nextLine().split("&")).collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("Done")) {
            String[] temp = input.split("\\|");
            String asd = String.join(" ", temp);
            String[] commands = asd.split("   ");
            String instruction = commands[0];

            switch (instruction) {
                case "Add Book":
                    String bookName = commands[1];
                    if (!bookShelf.contains(bookName)) {
                        bookShelf.add(0, bookName);
                    }
                    break;
                case "Take Book":
                    String removeBookName = commands[1];
                    if (bookShelf.contains(removeBookName)) {
                        bookShelf.remove(removeBookName);
                    }
                    break;
                case "Swap Books":
                    String firstBook = commands[1];
                    String secondBook = commands[2];
                    if (bookShelf.contains(firstBook) && bookShelf.contains(secondBook)) {
                       int indexOfFirst = bookShelf.indexOf(firstBook);
                       int indexOfSecond = bookShelf.indexOf(secondBook);
                        bookShelf.set(indexOfFirst, secondBook);
                        bookShelf.set(indexOfSecond, firstBook);
                    }
                    break;
                case "Insert Book":
                    String insertBookName = commands[1];
                    bookShelf.add(insertBookName);
                    break;
                case "Check Book":
                    int givenIndex = Integer.parseInt(commands[1]);
                    if (givenIndex < bookShelf.size()) {
                        System.out.println(bookShelf.get(givenIndex));
                    }
                    break;
            }

            input = scan.nextLine();
        }
        for (int i = 0; i < bookShelf.size() ; i++) {
            if (i + 1 == bookShelf.size()) {
                System.out.print(bookShelf.get(i));
            } else {
                System.out.print(bookShelf.get(i) +", ");
            }
        }

        }
    }

