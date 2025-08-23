public class BusRoutePassengers {
    public static void main(String[] args) {
        int[] passengers = {5, 8, 3, 6, 7, 4, 9, 2};
        int total = 0;

        for (int i = 0; i < passengers.length; i++) {
            total += passengers[i];
        }

        System.out.println("Total passengers who boarded: " + total);
    }
}
