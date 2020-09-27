import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sumOddNumber = 0;
        int summEvenNumber= 0;
        int diff = 0;
        int currentNumber = 0;

        for (int i =0; i < n;i++) {

            currentNumber = Integer.parseInt(scan.nextLine());

            if(i % 2 == 0 ) {
                summEvenNumber = summEvenNumber + currentNumber;

            } else {
                sumOddNumber = sumOddNumber + currentNumber;
            }

        } if (sumOddNumber == summEvenNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumOddNumber);

        } else {
            diff = summEvenNumber - sumOddNumber;
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(diff));
        }
    }
}
