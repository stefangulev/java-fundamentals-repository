import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = scan.nextLine().split(" ");
        int rotationsCount = Integer.parseInt(scan.nextLine());
        String[] temp = new String[arr.length];

        for (int i = 0; i < rotationsCount ; i++) {
            temp[temp.length - 1] = arr [0];
            for (int j = 0; j < temp.length - 1 ; j++) {
                temp[j] = arr[j+ 1];
                arr[j] = temp[j];
                if ((temp.length -1) - j == 1){
                    arr[arr.length - 1] = temp[temp.length - 1];
                }

            }

            }
        System.out.println(String.join(" ", temp));



        }

    }

