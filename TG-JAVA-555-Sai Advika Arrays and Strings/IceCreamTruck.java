public class IceCreamTruck {
    public static void main(String[] args) {
        String[] flavors = {"Vanilla", "Chocolate", "Strawberry", "Mint", "Cookies & Cream"};
        int[] sales = {25, 40, 15, 30, 20};

        for (int i = 0; i < sales.length; i++) {
            int maxIndex = 0;
            for (int j = 1; j < sales.length; j++) {
                if (sales[j] > sales[maxIndex]) {
                    maxIndex = j;
                }
            }
            System.out.println(flavors[maxIndex] + ": " + sales[maxIndex] + " scoops");
            sales[maxIndex] = -1; 
        }
    }
}
