import java.util.Scanner;

public class RecursiveFibonacci {
    public static long[] fibonacciMemory;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = Integer.parseInt(scan.nextLine());
        fibonacciMemory = new long[n + 1];

        System.out.println(getFibonacci(n));

    }

    private static long getFibonacci(int n) {

        if (n <= 1) {
            return 1;
        }

        if(fibonacciMemory[n] != 0) {
            return fibonacciMemory[n];
        }

        return fibonacciMemory[n] = getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
