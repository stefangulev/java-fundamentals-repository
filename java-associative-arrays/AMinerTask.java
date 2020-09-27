import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String resource = scan.nextLine();

        Map<String, Integer> table = new LinkedHashMap<>();
        while (!resource.equals("stop")) {

            int quantity = Integer.parseInt(scan.nextLine());
            if (!table.containsKey(resource)) {
                table.put(resource, quantity);
            } else {
                int newValue = table.get(resource) + quantity;
                table.put(resource, newValue);
            }

            resource = scan.nextLine();
        }

        for (Map.Entry<String, Integer> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
