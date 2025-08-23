public class GardenTemperature {
    public static void main(String[] args) {
        int[] temps = {20, 25, 23, 18, 22, 27, 19};
        int ideal = 22;
        int closestDay = 0;
        int smallestDiff = Math.abs(temps[0] - ideal);

        for (int i = 1; i < temps.length; i++) {
            int diff = Math.abs(temps[i] - ideal);
            if (diff < smallestDiff) {
                smallestDiff = diff;
                closestDay = i;
            }
        }

        System.out.println("Day " + (closestDay + 1) + " was closest to 22°C with " + temps[closestDay] + "°C");
    }
}
