class Movie {
    String title;
    int duration;
    int rating;

    Movie(String t, int d, int r) {
        title = t;
        duration = d;
        rating = r;
    }

    void check() {
        if (duration < 120) {
            System.out.println(title + " is good for a short evening.");
        } else {
            System.out.println(title + " is not good for a short evening.");
        }
    }
}

class Main4 {
    public static void main(String[] args) {
        Movie m = new Movie("Inception", 148, 9);
        m.check();
    }
}
