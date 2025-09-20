class Coffee {
    double price;

    Coffee(double base) {
        price = base;
    }

    void addShot() {
        price += 30;
    }

    void addSyrup() {
        price += 20;
    }

    void addCream() {
        price += 15;
    }

    double getTotal() {
        return price;
    }
}

public class CoffeeOrder {
    public static void main(String[] args) {
        Coffee c = new Coffee(100);
        c.addShot();
        c.addSyrup();
        c.addCream();
        System.out.println("Total: " + c.getTotal());
    }
}

