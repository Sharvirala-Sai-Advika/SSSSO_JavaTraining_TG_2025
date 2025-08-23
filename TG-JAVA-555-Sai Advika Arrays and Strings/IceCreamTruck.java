import java.util.Arrays;
import java.util.Comparator;

public class IceCreamTruck {
    public static void main(String[] args) {
        String[] flavors = {"Vanilla", "Chocolate", "Strawberry", "Mint", "Cookies & Cream"};
        Integer[] sales = {25, 40, 15, 30, 20};

        Integer[] indices = {0, 1, 2, 3, 4};

        Arrays.sort(indices, new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return sales[i2] - sales[i1];
            }
        });

        System.out.println("Flavors ranked by popularity:");
        for (int i : indices) {
            System.out.println(flavors[i] + ": " + sales[i] + " scoops");
        }
    }
}
