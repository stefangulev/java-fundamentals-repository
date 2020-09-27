import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> products = new ArrayList<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n ; i++) {
            String product = scan.nextLine();
            products.add(product);
        }
        Collections.sort(products);

        for (int i = 0; i < products.size() ; i++) {
            System.out.printf("%d.%s%n", i +1, products.get(i));
        }


    }
}
