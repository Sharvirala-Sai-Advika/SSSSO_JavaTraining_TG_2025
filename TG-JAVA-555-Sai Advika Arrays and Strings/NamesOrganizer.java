import java.util.Scanner;

public class NamesOrganizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = sc.nextLine();
        
        String tagName = firstName.toUpperCase();
        System.out.println("Name tag: " + tagName);
    }
}
