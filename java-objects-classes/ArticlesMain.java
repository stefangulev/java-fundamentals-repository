package Articles;

import java.util.Scanner;

public class ArticlesMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");

        String title = input[0];
        String content = input[1];
        String author = input[2];

        int n = Integer.parseInt(scan.nextLine());

        Articles articles = new Articles(title, content, author);

        for (int i = 0; i < n; i++) {
            String[] commands = scan.nextLine().split(": ");
            String command = commands[0];
            String newPart = commands[1];

            switch (command) {
                case "Edit":
                    articles.editArticle(newPart);
                    break;
                case "ChangeAuthor":
                    articles.changeAuthor(newPart);
                    break;
                case "Rename":
                    articles.rename(newPart);
                    break;
            }
        }
        System.out.println(articles);
    }
}
