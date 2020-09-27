import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "\\>{2}\\w+\\<{2}\\d+\\.?\\d+\\!\\d+";

        List<String> fits = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        String input = scan.nextLine();
        while (!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                fits.add(matcher.group());
            }
            input = scan.nextLine();
        }

        double totalSpend = 0.0;
        List<String> furnitureItems = new ArrayList<>();
        for (int i = 0; i <fits.size(); i++) {
            String replaced = fits.get(i).replaceAll(">>", "");
            replaced = replaced.replaceAll("<<"," ");
            replaced = replaced.replaceAll("!", " ");
            String[] temp = replaced.split("\\s+");
            String name = temp[0];
            double price = Double.parseDouble(temp[1]);
            int quantity = Integer.parseInt(temp[2]);
            furnitureItems.add(name);
            totalSpend += price * quantity;
        }

        System.out.println("Bought furniture:");
        for (String furnitureItem : furnitureItems) {
            System.out.println(furnitureItem);
        }
        System.out.printf("Total money spend: %.2f", totalSpend);

    }
}
