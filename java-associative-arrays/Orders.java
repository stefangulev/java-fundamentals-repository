import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<Double>> productsList = new LinkedHashMap<>();

        String input = scan.nextLine();

        while (!input.equals("buy")) {
            String[] commands = input.split(" ");
            String product = commands[0];
            double price = Double.parseDouble(commands[1]);
            double quantity = Double.parseDouble(commands[2]);

            if(!productsList.containsKey(product)) {
                List<Double> currentPriceAndQuntity = new ArrayList<>();
                currentPriceAndQuntity.add(price);
                currentPriceAndQuntity.add(quantity);
                productsList.put(product, currentPriceAndQuntity);
            } else {
                List<Double> newPriceAndQuantity = new ArrayList<>();
                newPriceAndQuantity.add(price);
                double newQuantity = productsList.get(product).get(1) + quantity;
                newPriceAndQuantity.add(newQuantity);
                productsList.put(product, newPriceAndQuantity);
            }



            input = scan.nextLine();
        }

        for (Map.Entry<String, List<Double>> entry : productsList.entrySet()) {
            double total = entry.getValue().get(0) * entry.getValue().get(1);
            List<Double> newList = new ArrayList<>();
            newList.add(total);
            productsList.put(entry.getKey(), newList);
        }

        for (Map.Entry<String, List<Double>> entry : productsList.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue().get(0));

        }

    }
}
//String.join(entry.getValue().toString().replaceAll("[\\[\\], ]", "")))
