class PizzaParty {
    int pizzas;
    int slicesPerPizza;
    int people;

    PizzaParty(int pizzas, int slicesPerPizza, int people) {
        this.pizzas = pizzas;
        this.slicesPerPizza = slicesPerPizza;
        this.people = people;
    }

    void calculateSlices() {
        int totalSlices = pizzas * slicesPerPizza;
        int slicesEach = totalSlices / people;
        int leftover = totalSlices % people;
        System.out.println("Each person gets " + slicesEach + " slices");
        System.out.println("Leftover slices: " + leftover);
    }
}

public class PizzaSliceCounter {
    public static void main(String[] args) {
        PizzaParty party = new PizzaParty(3, 8, 4);
        party.calculateSlices();
    }
}
