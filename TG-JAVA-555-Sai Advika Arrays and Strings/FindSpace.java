import java.util.Scanner;

public class FindSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = sc.nextLine();

        int spaceIndex = fullName.indexOf(' ');
        if (spaceIndex != -1) {
            System.out.println("The space is at index: " + spaceIndex);
        } else {
            System.out.println("No space found in the name.");
        }
    }
}
