import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message:");
        String message = sc.nextLine();
        
        int length = message.length();
        System.out.println("Total number of characters (including spaces): " + length);
    }
}
