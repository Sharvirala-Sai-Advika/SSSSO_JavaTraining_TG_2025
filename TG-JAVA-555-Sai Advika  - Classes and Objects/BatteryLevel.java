class Phone {
    int battery;

    Phone(int b) {
        battery = b;
    }

    void use(int x) {
        battery -= x;
        if (battery < 0) battery = 0;
    }

    void charge(int x) {
        battery += x;
        if (battery > 100) battery = 100;
    }

    void show() {
        System.out.println("Battery: " + battery + "%");
    }
}

public class BatteryLevel {
    public static void main(String[] args) {
        Phone p = new Phone(80);
        p.use(30);
        p.use(20);
        p.charge(50);
        p.show();
    }
}
