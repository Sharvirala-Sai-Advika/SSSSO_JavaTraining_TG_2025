import java.util.Scanner;

public class BookTitleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book title:");
        String title = sc.nextLine();

        if (title.toLowerCase().startsWith("the")) {
            System.out.println("The title starts with 'The'.");
        } else {
            System.out.println("The title does not start with 'The'.");
        }
    }
}
