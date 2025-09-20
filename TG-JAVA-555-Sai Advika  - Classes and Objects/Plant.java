class Plant {
    String name;
    int height;
    int days;

    Plant(String name, int height, int days) {
        this.name = name;
        this.height = height;
        this.days = days;
    }

    void grow(int cm) {
        height += cm;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height + " cm");
        System.out.println("Days: " + days);
    }
}

class Main3 {
    public static void main(String[] args) {
        Plant p = new Plant("Rose", 10, 15);
        p.grow(3);
        p.show();
    }
}
