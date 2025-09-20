import java.util.Scanner;

class Recipe {
    String name;
    int servings;
    double ingredient;

    Recipe(String n, int s, double i) {
        name = n;
        servings = s;
        ingredient = i;
    }

    double calc(int newServings) {
        return (ingredient / servings) * newServings;
    }
}
class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Recipe r = new Recipe("Pasta", 4, 200);
        System.out.print("Enter servings: ");
        int s = sc.nextInt();
        System.out.println("Ingredient needed: " + r.calc(s));
    }
}
