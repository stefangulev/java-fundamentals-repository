import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] input = scan.nextLine().split(" ");
        while (!input[0].equals("end")) {


            switch (input[0]) {
                case "Contains":
                    doesItContain(input, numbers);
                    break;
                case "Print":
                    if (input[1].equals("even")) {
                        printEven(numbers);

                    } else if (input[1].equals("odd")) {
                        printOdd(numbers);

                    }

                    break;
                case "Get":
                    getSum(numbers);

                    break;
                case "Filter":
                    int number = Integer.parseInt(input[2]);
                    String sign = input[1];
                    filter(number,sign, numbers);


                    break;
            }


            input = scan.nextLine().split(" ");
        }


    }

    private static void doesItContain(String[] input, List<Integer> numbers) {
        int number = Integer.parseInt(input[1]);
        boolean doesContain = numbers.contains(number);
        if (doesContain) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }

    }

    private static void printEven(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void printOdd(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }

        }
        System.out.println();
    }

    private static void getSum(List<Integer> numbers) {
        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    private static void filter(int number, String sign, List<Integer> numbers) {

        switch (sign) {
            case ">":
                for (Integer num : numbers) {
                    if (num > number) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
            case "<":
                for (Integer num : numbers) {
                    if (num < number) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
            case ">=":
                for (Integer num : numbers) {
                    if (num >= number) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
            case "<=":
                for (Integer num : numbers) {
                    if (num <= number) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
        }
    }
}
