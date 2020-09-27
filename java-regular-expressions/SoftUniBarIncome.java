import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "%(?<name>[A-Z][a-z]+)%[^\\|\\$\\%\\.]*?<(?<product>\\w+)>[^\\|\\$\\%\\.]*?\\|(?<quantity>\\d+)\\|[^\\|\\$\\%\\.]*?(?<price>\\d+\\.?\\d+)\\$";
        Pattern pattern = Pattern.compile(regex);

        String input = scan.nextLine();
        double totalIncome = 0;
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);


            if (matcher.find()) {
                String client = matcher.group("name");
                String product = matcher.group("product");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));
                double totalPrice = quantity *price;
                totalIncome+= totalPrice;
                System.out.printf("%s: %s - %.2f%n", client, product, totalPrice);
            }
            input = scan.nextLine();
        }
        System.out.printf("Total income: %.2f%n", totalIncome);

    }
}
