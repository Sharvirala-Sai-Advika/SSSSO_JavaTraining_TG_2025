public class LibraryReturnTracker {
    public static void main(String[] args) {
        int[] lateDays = {2, 5, 0, 3, 7, 1};
        int total = 0;

        for (int i = 0; i < lateDays.length; i++) {
            total += lateDays[i];
        }

        double average = (double) total / lateDays.length;
        System.out.println("Average late days: " + average);
    }
}
