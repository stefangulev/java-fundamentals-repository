import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WeaponSmith {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> particles = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("Done")) {
            String[] commands = input.split(" ");
            String instruction = commands[1];
            switch (instruction) {
                case "Left":
                    int leftIndex = Integer.parseInt(commands[2]);
                    int newLeftIndex = leftIndex - 1;
                    if (leftIndex >= 0 && leftIndex < particles.size() && newLeftIndex >= 0) {
                        particles.add(newLeftIndex, particles.get(leftIndex));
                        particles.remove(leftIndex + 1);
                    }
                    break;
                case "Right":
                    int rightIndex = Integer.parseInt(commands[2]);
                    int newRightIndex = rightIndex + 2;
                    if (rightIndex >= 0 && rightIndex < particles.size() && newRightIndex <= particles.size()) {
                        particles.add(newRightIndex, particles.get(rightIndex));
                        particles.remove(rightIndex);
                    }
                    break;
                case "Even":
                    for (int i = 0; i < particles.size() ; i = i +2) {
                        System.out.print(particles.get(i) + " ");
                    }
                    System.out.println();
                    break;
                case "Odd":
                    for (int i = 1; i < particles.size(); i = i +2) {
                        System.out.print(particles.get(i) + " ");
                    }
                    System.out.println();
                    break;

            }

            input = scan.nextLine();
        }

        String weapon = particles.toString().replaceAll("[\\[\\],]", "");
        String weapon2 = weapon.replaceAll("\\s+", "");

        System.out.printf("You crafted %s!", weapon2);
    }
}
