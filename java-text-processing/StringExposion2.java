import java.util.Scanner;

public class StringExposion2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder sb = new StringBuilder();

        int power =0;

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if(current == '>') {
                sb.append(current);
                power += Integer.parseInt(String.valueOf(input.charAt(i +1)));
            } else if (power == 0) {
                sb.append(current);
            } else {
                power --;
            }


        }
        System.out.println(sb);
    }
}
