import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] first = scan.nextLine().split(" ");
        String[] second = scan.nextLine().split(" ");

        int commonCount = 0;

        for (int i = 0; i < second.length ; i++) {
            for (int j = 0; j < first.length ; j++) {
                if (second[i].equals(first[j])) {
                    System.out.print(second[i] + " ");
                }
            }
        }


    }
}
