import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FurniteExtra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = ">{2}(?<name>\\w+)\\<{2}(?<price>\\d+\\.?\\d+)\\!(?<quantity>\\d+)";

        Pattern pattern = Pattern.compile(regex);
        List<String> furniture = new LinkedList<>();
        double totalPrice = 0.0;

        String input = scan.nextLine();
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furniture.add(name);
                totalPrice += price *quantity;
            }

            input = scan.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String furnitureItem : furniture) {
            System.out.println(furnitureItem);
        }
        System.out.printf("Total money spend: %.2f", totalPrice);

    }
}
