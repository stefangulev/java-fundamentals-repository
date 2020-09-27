import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int count = 0;
        int min = Integer.MAX_VALUE;

        while (count < n) {
            int input = Integer.parseInt(scan.nextLine());
            if (input < min) {
                min = input;
            } count++;
        }
        System.out.println(min);
    }
}
