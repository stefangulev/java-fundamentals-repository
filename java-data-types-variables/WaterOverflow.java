import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int capacity = 255;
        int currentCapacity = 0;

        for (int i = 0; i <n ; i++) {
            int input = Integer.parseInt(scan.nextLine());
            currentCapacity += input;

            if (currentCapacity > capacity) {
                System.out.println("Insufficient capacity!");
                currentCapacity -= input;
            }

        }
        System.out.println(currentCapacity);
    }
}
