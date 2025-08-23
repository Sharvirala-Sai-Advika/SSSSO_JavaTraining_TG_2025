public class PetStoreSales {
    public static void main(String[] args) {
        String[] animals = {"Dogs", "Cats", "Birds", "Fish"};
        int[] sales = {5, 3, 7, 10};
        
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i] + ": " + sales[i] + " sold");
        }
    }
}
