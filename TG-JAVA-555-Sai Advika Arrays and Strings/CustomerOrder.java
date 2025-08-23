import java.util.Scanner;

public class CustomerOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your order:");
        String order = sc.nextLine();
        
        if (order.toLowerCase().contains("vanilla")) {
            System.out.println("You ordered a Vanilla Latte!");
        } else {
            System.out.println("No Vanilla Latte in your order.");
        }
    }
}
