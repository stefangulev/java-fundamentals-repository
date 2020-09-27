import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    int sum = 0;
for (int i = 1; i <= n; i++){
           int currentNumber = i;
            while (i > 0){
                sum += i % 10;
                i = i / 10;
            }
           boolean isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecial) {
                System.out.printf("%d -> True%n", currentNumber);
            } else {
                System.out.printf("%d -> False%n", currentNumber);
            }
            sum = 0;
            i = currentNumber;
        }
    }
}
