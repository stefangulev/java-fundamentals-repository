import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CompanyInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Map<String, Integer>> companyList = new TreeMap<>();

        String input = scan.nextLine();

        while (!input.equals("End")) {
            String[] commands = input.split(" -> ");
            String companyName = commands[0];
            String id = commands[1];

            companyList.putIfAbsent(companyName, new LinkedHashMap<>());
            Map<String, Integer> currentMap = companyList.get(companyName);
            currentMap.put(id, 0);


            input= scan.nextLine();
        }


        companyList.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey());
            e.getValue().keySet().forEach(k -> System.out.printf("-- %s%n" ,k ));
        });

    }
}
