import java.util.*;

public class InboxManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> userList = new TreeMap<>();

        String input = scan.nextLine();

        while (!input.equals("Statistics")) {
            String[] temp = input.split("->");
            String command = temp[0];
            String username = temp[1];

            switch (command) {
                case "Add":
                    if (userList.containsKey(username)) {
                        System.out.println(String.format("%s is already registered", username));
                    } else {
                        userList.put(username, new ArrayList<>());
                    }
                    break;
                case "Send":
                    String email = temp[2];
                    userList.get(username).add(email);
                    break;
                case "Delete":
                    if (!userList.containsKey(username)) {
                        System.out.println(String.format("%s not found!", username));
                    } else {
                        userList.remove(username);
                    }
                    break;
            }

            input = scan.nextLine();
        }
        System.out.println(String.format("Users count: %d", userList.size()));

        userList.entrySet().stream().sorted((l,r) -> Integer.compare(r.getValue().size(), l.getValue().size())).forEach(e -> {
            System.out.println(e.getKey());
            for (int i = 0; i < e.getValue().size(); i++) {
                System.out.println(String.format(" - %s", e.getValue().get(i)));
            }
        });
    }
}
