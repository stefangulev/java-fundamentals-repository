import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogsCnt = Integer.parseInt(scan.nextLine());
        int otherCnt = Integer.parseInt(scan.nextLine());
        double dogsSum = dogsCnt * 2.50;
        int otherSum = otherCnt * 4;
        double totalPrice = dogsSum + otherSum;
        System.out.printf("%.2f lv." , totalPrice);
    }
}
