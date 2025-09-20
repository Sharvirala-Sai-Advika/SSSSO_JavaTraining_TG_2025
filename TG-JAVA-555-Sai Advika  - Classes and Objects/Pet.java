class Pet {
    String name;
    int age;
    String breed;

    Pet(String n, int a, String b) {
        name = n;
        age = a;
        breed = b;
    }

    void feedReminder() {
        System.out.println("Time to feed " + name + "!");
    }
}

class Main {
    public static void main(String[] args) {
        Pet p = new Pet("Buddy", 3, "German Shepherd");
        p.feedReminder();
    }
}
