package ArticlesTwo;

import ArticlesTwo.ArticlesTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticlesTwoMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<ArticlesTwo> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(", ");

            String title = input[0];
            String content = input[1];
            String author = input[2];

            ArticlesTwo article = new ArticlesTwo(title, content, author);

            list.add(article);

        }
        String command = scan.nextLine();

        switch (command) {
            case "title":
                list.stream().sorted((a1, a2) -> a1.getTitle().compareTo(a2.getTitle())).forEach(System.out::println);
                break;
            case "content":
                list.stream().sorted((a1, a2) -> a1.getContent().compareTo(a2.getContent())).forEach(System.out::println);
                break;
            case "author":
                list.stream().sorted((a1, a2) -> a1.getAuthor().compareTo(a2.getAuthor())).forEach(System.out::println);
                break;

        }


    }

}

