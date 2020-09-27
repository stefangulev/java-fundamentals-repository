import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean isTop = false;
        int currentTop = 0;
        for (int i = 0; i < arr.length; i++) {
            if(isTop) {
                System.out.print(currentTop + " ");
            }
            for (int j = arr.length - 1; j > i ; j--) {
                if (arr[i] > arr[j]) {
                    isTop = true;
                    currentTop = arr[i];
                } else {
                    isTop = false;
                    break;
                }
            }
        }
        System.out.print(arr[arr.length - 1]);
    }
}
