import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "\\@\\#+(?<product>[A-Z][A-Za-z0-9]{4,}[A-Z])\\@\\#+";

        Pattern pattern = Pattern.compile(regex);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <n ; i++) {
            String tempBarCode = scan.nextLine();
            Matcher matcher = pattern.matcher(tempBarCode);

            if (matcher.find()) {
                String productCode = matcher.group("product");
                String productCodeSum = "";
                boolean hasNumeric = false;
                for (int j = 0; j <productCode.length(); j++) {
                    char current = productCode.charAt(j);
                    if (current >= 48 && current <= 57) {
                        hasNumeric = true;
                        productCodeSum += current;
                    }


                }
                if (hasNumeric) {
                    System.out.println(String.format("Product group: %s", productCodeSum));
                } else {
                    System.out.println("Product group: 00");
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
