import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OrdesTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> quantityMap = new LinkedHashMap<>();
        Map<String, Double> priceMap = new LinkedHashMap<>();

        String input = scan.nextLine();

        while (!"buy".equals(input)) {
            String[] commands = input.split(" ");
            String product = commands[0];
            Double price = Double.parseDouble(commands[1]);
            int quantity = Integer.parseInt(commands[2]);

            priceMap.put(product,price);
            quantityMap.putIfAbsent(product, 0);
            int newQuantity = quantityMap.get(product) + quantity;
            quantityMap.put(product,newQuantity);

            input = scan.nextLine();
        }
        quantityMap.forEach((l, r) -> System.out.println(String.format("%s -> %.2f", l, r * priceMap.get(l))));
    }
}
