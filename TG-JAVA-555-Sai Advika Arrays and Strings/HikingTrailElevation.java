public class HikingTrailElevation {
    public static void main(String[] args) {
        int[] elevations = {100, 120, 135, 200, 210, 260, 310, 400, 405, 460};

        for (int i = 0; i < elevations.length - 1; i++) {
            int diff = Math.abs(elevations[i + 1] - elevations[i]);
            if (diff > 50) {
                System.out.println("Steep section between point " + (i + 1) + " (" + elevations[i] +
                                   "m) and point " + (i + 2) + " (" + elevations[i + 1] + "m), difference: " + diff + "m");
            }
        }
    }
}
