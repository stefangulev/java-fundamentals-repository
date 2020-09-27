import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        String[] first = new String[size];
        String[] second = new String[size];

        for (int i =0; i < size ; i++) {

            if ( i % 2 ==0) {
                first[i] = scan.next();
                second[i] = scan.next();
            } else {
                second[i] = scan.next();
                first[i] = scan.next();
            }
        }
        System.out.println(String.join(" ", first));
        System.out.println(String.join(" ", second));
    }
}
