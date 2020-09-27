import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, String> database = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] commands = scan.nextLine().split(" ");
            String instruction = commands[0];
            String name = commands[1];

            switch (instruction) {
                case "register":
                    String licensePlate = commands[2];
                    if (!database.containsKey(name)) {
                        database.put(name, licensePlate);
                        System.out.printf("%s registered %s successfully%n", name,licensePlate);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", database.get(name));
                    }
                    break;
                case "unregister":
                    if (!database.containsKey(name)) {
                        System.out.printf("ERROR: user %s not found%n", name);
                    } else {
                        database.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    }
                    break;

            }
        }

        database.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " => " + e.getValue()));
    }
}
