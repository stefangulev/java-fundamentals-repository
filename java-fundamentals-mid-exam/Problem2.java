import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scan.nextLine();

        while (!input.equals("end")) {
            String[] commands = input.split(" ");
            String instruction = commands[0];

            switch (instruction) {
                case "swap":
                    int index1 = Integer.parseInt(commands[1]);
                    int index2 = Integer.parseInt(commands[2]);
                    int temp1 = arr[index2];
                    int temp2 = arr[index1];
                    arr[index2] = temp2;
                    arr[index1] = temp1;

                    break;
                case "multiply":
                    int multiplyFirstIndex = Integer.parseInt(commands[1]);
                    int multiplySecondIndex = Integer.parseInt(commands[2]);
                    int firstIndexValue = arr[multiplyFirstIndex];
                    int secondIndexValue = arr[multiplySecondIndex];
                    int multiplied = firstIndexValue * secondIndexValue;
                    arr[multiplyFirstIndex] = multiplied;
                    break;
                case "decrease":
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] -= 1;
                    }
                    break;
            }

            input = scan.nextLine();
        }

        for (int i = 0; i < arr.length ; i++) {
            if (i + 1 == arr.length) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }


    }
}
