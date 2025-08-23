import java.util.Scanner;

public class UnderscoreReplacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the recipe name:");
        String recipe = sc.nextLine();
        
        String formatted = recipe.replace('_', ' ');
        System.out.println("Formatted recipe name: " + formatted);
    }
}
