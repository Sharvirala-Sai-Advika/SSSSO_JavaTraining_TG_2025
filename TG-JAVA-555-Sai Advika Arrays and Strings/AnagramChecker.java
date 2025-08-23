import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word:");
        String word1 = sc.nextLine().toLowerCase();
        System.out.println("Enter second word:");
        String word2 = sc.nextLine().toLowerCase();

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The words are anagrams!");
        } else {
            System.out.println("The words are not anagrams.");
        }
    }
}
