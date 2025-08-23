import java.util.ArrayList;

public class GardenPlots {
    public static void main(String[] args) {
        int[] plots = {30, 45, 50, 25, 60, 55, 35, 40, 70, 20, 65, 75, 80, 28, 32};

        int total = 0;
        for (int size : plots) {
            total += size;
        }

        double average = (double) total / plots.length;

        ArrayList<Integer> largerPlots = new ArrayList<>();
        for (int size : plots) {
            if (size > average) {
                largerPlots.add(size);
            }
        }

        System.out.println("Average plot size: " + average);
        System.out.println("Plots larger than average: " + largerPlots);
    }
}
