import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int sum = 0;
        int totalSum = 0;

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);

            switch (letter) {
                case 'a':
                    totalSum = totalSum + 1;
                    break;

                case 'e':
                    totalSum = totalSum + 2;
                    break;

                case 'i':
                    totalSum = totalSum + 3;
                    break;

                case 'o':
                    totalSum = totalSum + 4;
                    break;

                case 'u':
                    totalSum = totalSum + 5;
                    break;

            }

        }
        System.out.println(totalSum);
    }


}


