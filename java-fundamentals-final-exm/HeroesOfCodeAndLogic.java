import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.*;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<Integer>> heroList = new HashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            String heroName = input[0];
            int hp = Integer.parseInt(input[1]);
            int mp = Integer.parseInt(input[2]);
            List<Integer> heroInfo = Arrays.asList(hp, mp);
            heroList.put(heroName, heroInfo);
        }

        String input = scan.nextLine();

        while (!input.equals("End")) {
            String[] temp = input.split(" - ");
            String command = temp[0];
            String heroName = temp[1];
            switch (command) {
                case "CastSpell":
                    int currentMP = heroList.get(heroName).get(1);
                    int mpNeeded = Integer.parseInt(temp[2]);
                    String spellName = temp[3];

                    if (mpNeeded > currentMP ) {
                        System.out.println(String.format("%s does not have enough MP to cast %s!", heroName, spellName));
                    } else {
                        currentMP = currentMP - mpNeeded;
                        System.out.println(String.format("%s has successfully cast %s and now has %d MP!", heroName, spellName, currentMP));

                        List<Integer> afterCast = Arrays.asList(heroList.get(heroName).get(0), currentMP);
                        heroList.put(heroName, afterCast);

                    }

                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(temp[2]);
                    String attacker = temp[3];
                    int currentHP = heroList.get(heroName).get(0);
                    int newHealth = currentHP - damage;
                    if (newHealth <= 0) {
                        System.out.println(String.format("%s has been killed by %s!", heroName, attacker));
                        heroList.remove(heroName);
                    } else {
                        System.out.println(String.format("%s was hit for %d HP by %s and now has %d HP left!", heroName, damage, attacker, newHealth));
                        List<Integer> afterAttack = Arrays.asList(newHealth, heroList.get(heroName).get(1));
                        heroList.put(heroName, afterAttack);
                    }
                    break;
                case "Recharge":
                    int rechargeAmount = Integer.parseInt(temp[2]);
                    int currentMPofHero = heroList.get(heroName).get(1);
                    int newMP = rechargeAmount + currentMPofHero;
                    if (newMP > 200) {
                        newMP = 200;
                        int diff = 200 - currentMPofHero;
                        System.out.println(String.format("%s recharged for %d MP!", heroName, diff));

                    } else {
                        System.out.println(String.format("%s recharged for %d MP!", heroName, rechargeAmount));

                    }
                    List<Integer> afterRecharge = Arrays.asList(heroList.get(heroName).get(0), newMP);
                    heroList.put(heroName, afterRecharge);
                    break;
                case "Heal":
                    int healAmount = Integer.parseInt(temp[2]);
                    int currentHealthOfHero = heroList.get(heroName).get(0);
                    int newHealthOfHero = healAmount + currentHealthOfHero;
                    if (newHealthOfHero > 100) {
                        newHealthOfHero = 100;
                        int diffHealth = 100 - currentHealthOfHero;
                        System.out.println(String.format("%s healed for %d HP!", heroName, diffHealth));
                    } else {
                        System.out.println(String.format("%s healed for %d HP!", heroName, healAmount));
                    }
                    List<Integer> afterHeal = Arrays.asList(newHealthOfHero, heroList.get(heroName).get(1));
                    heroList.put(heroName, afterHeal);

                    break;
            }

            input = scan.nextLine();
        }
        heroList.entrySet().stream().sorted((l,r) -> {
            int result = r.getValue().get(0).compareTo(l.getValue().get(0));
            if (result == 0) {
                result = l.getKey().compareTo(r.getKey());
            }
            return result;
        }).forEach(e -> {
            System.out.println(e.getKey());
            System.out.println(String.format("  HP: %d", e.getValue().get(0)));
            System.out.println(String.format("  MP: %d", e.getValue().get(1)));
        });

    }
}
