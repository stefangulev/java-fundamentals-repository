import java.util.Scanner;

public class PaintingOfAHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double houseHeight = Double.parseDouble(scan.nextLine());
        double sideWallLength = Double.parseDouble(scan.nextLine());
        double heightTriangleSideRoof = Double.parseDouble(scan.nextLine());

        double frontWallArea = houseHeight * houseHeight - (1.2 *2);
        double backWallArea = houseHeight * houseHeight;
        double sideWallOneArea = houseHeight * sideWallLength - (1.5 * 1.5);
        double sideWallTwoArea = houseHeight * sideWallLength - (1.5 * 1.5);

        double roofAreaRectangleSideOne = houseHeight * sideWallLength;
        double roofAreaRectangleSideTwo = houseHeight * sideWallLength;
        double roofAreaTriangleSideOne =  (houseHeight * heightTriangleSideRoof) / 2;
        double roofAreaTriangleSideTwo =  (houseHeight * heightTriangleSideRoof) / 2;

        double totalHouseArea = frontWallArea + backWallArea + sideWallOneArea + sideWallTwoArea;
        double totalRoofArea = roofAreaRectangleSideOne + roofAreaRectangleSideTwo + roofAreaTriangleSideOne + roofAreaTriangleSideTwo;

        double greenPaint = totalHouseArea / 3.4;
        double redPaint = totalRoofArea / 4.3;

        System.out.printf("%.2f%n", greenPaint);
        System.out.printf("%.2f", redPaint);




    }
}
