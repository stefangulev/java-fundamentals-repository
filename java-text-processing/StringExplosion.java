import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current != '>') {
                sb.append(current);
            } else {
                sb.append(current);
                int power = Integer.parseInt(String.valueOf(input.charAt(i + 1)));
                i += 1;
                for (int j = 1; j < power; j++) {

                    if (input.charAt(i +1) == '>') {
                        sb.append(input.charAt(i +1));
                        i+=1;
                        int additionalPower = Integer.parseInt(String.valueOf(input.charAt(i + 1)));
                        i+=1;
                        power += additionalPower;
                    } else {
                        i++;
                    }
                }
            }

        }
        System.out.println(sb);


    }
}
