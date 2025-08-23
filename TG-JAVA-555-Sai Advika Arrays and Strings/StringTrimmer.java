import java.util.Scanner;

public class StringTrimmer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message:");
        String message = sc.nextLine();

        String trimmed = message.trim();
        System.out.println("Trimmed message: \"" + trimmed + "\"");
    }
}
