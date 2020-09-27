import java.util.*;

public class MessagesManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int messageLimit = Integer.parseInt(scan.nextLine());

        Map<String, List<Integer>> contactList = new TreeMap<>();

        String input = scan.nextLine();

        while (!input.equals("Statistics")) {
            String[] temp = input.split("=");
            String command = temp[0];

            switch (command) {
                case "Add":
                    String username = temp[1];
                    int sentNumber = Integer.parseInt(temp[2]);
                    int receivedNumber =Integer.parseInt(temp[3]);
                    List<Integer> info = new ArrayList<>();
                    info.add(sentNumber);
                    info.add(receivedNumber);
                    contactList.putIfAbsent(username, info);
                    break;
                case "Message":
                    String sender = temp[1];
                    String receiver = temp[2];
                    if (contactList.containsKey(sender) && contactList.containsKey(receiver)) {
                        int newSend = contactList.get(sender).get(0) + 1;
                        if (newSend + contactList.get(sender).get(1) < messageLimit) {
                            List<Integer> afterSend = contactList.get(sender);
                            afterSend.remove(0);
                            afterSend.add(0, newSend);
                            contactList.put(sender, afterSend);
                        } else {
                            contactList.remove(sender);
                            System.out.println(String.format("%s reached the capacity!", sender));
                        }

                        int newReceive = contactList.get(receiver).get(1) + 1;
                        if (newReceive + contactList.get(receiver).get(0) <messageLimit) {
                            List<Integer> afterReceive= contactList.get(receiver);
                            afterReceive.remove(1);
                            afterReceive.add(newReceive);
                            contactList.put(receiver, afterReceive);
                        } else {
                            contactList.remove(receiver);
                            System.out.println(String.format("%s reached the capacity!", receiver));
                        }
                    }

                    break;
                case "Empty":
                    String usernameToEmpty = temp[1];
                    if (usernameToEmpty.equals("All")) {
                        contactList.entrySet().clear();
                    }
                    if (contactList.containsKey(usernameToEmpty)) {
                        contactList.remove(usernameToEmpty);
                    }
                    break;
            }

            input = scan.nextLine();
        }
        System.out.println(String.format("Users count: %d", contactList.size()));
        contactList.entrySet().stream().sorted((l,r) -> r.getValue().get(1).compareTo(l.getValue().get(1))).
                forEach(e -> System.out.println(String.format("%s - %d", e.getKey(), e.getValue().get(0) + e.getValue().get(1))));
    }
}
