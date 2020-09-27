import java.util.Scanner;

public class ExtractFiles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String path = scan.nextLine();

        int slashIndex = path.lastIndexOf("\\");
        int pointIndex  =path.lastIndexOf(".");

        String fileName = path.substring(slashIndex + 1, pointIndex);
        String format = path.substring(pointIndex + 1);

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s%n", format);

    }
}
