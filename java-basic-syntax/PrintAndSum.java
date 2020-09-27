import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int finish = Integer.parseInt(scan.nextLine());
        int totalSum = 0;

        for (int i = start; i <= finish; i++) {
            if (i != finish) {
                System.out.print(i + " ");
            } else {
                System.out.println(i);
            }
            totalSum +=i;
        }
        String result = String.format("Sum: %d", totalSum);
        System.out.println(result);

    }
}
