import java.util.Scanner;

public class MUOnline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] dungeon = scan.nextLine().split("\\|");
        int health = 100;
        int bitcoins = 0;

        for (int i = 0; i < dungeon.length; i++) {
            String[] temp = dungeon[i].split(" ");
            String room = temp[0];
            int number = Integer.parseInt(temp[1]);

            switch (room) {
                case "potion":
                    int healing = number;
                    if (health + healing <= 100) {
                        System.out.printf("You healed for %d hp.%n", healing);
                        health += healing;
                        System.out.printf("Current health: %d hp.%n", health);
                    } else if (health + healing > 100) {
                        int diff = (health + healing) - 100;
                        healing -= diff;
                        health += healing;
                        System.out.printf("You healed for %d hp.%n", healing);
                        System.out.printf("Current health: %d hp.%n", health);
                    }
                    break;
                case "chest":
                    int bitCoinsFound = number;
                    bitcoins += bitCoinsFound;
                    System.out.printf("You found %d bitcoins.%n", bitCoinsFound);
                    break;
                default:
                    String monster = room;
                    int attack = number;

                    if (health - attack > 0) {
                        health -= attack;
                        System.out.printf("You slayed %s.%n", monster);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", monster);
                        System.out.printf("Best room: %d", i + 1);
                        return;

                    }
                    break;

            }


        }
        System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d", bitcoins, health);
    }
}
