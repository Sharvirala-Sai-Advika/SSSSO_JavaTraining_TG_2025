import java.util.Scanner;

public class ProductCodeGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product name:");
        String product = sc.nextLine();

        String code;
        if (product.length() >= 3) {
            code = product.substring(0, 3).toUpperCase();
        } else {
            code = product.toUpperCase();
        }

        System.out.println("Product code: " + code);
    }
}
