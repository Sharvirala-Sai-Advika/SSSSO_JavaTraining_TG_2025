public class ParkingMeterCoins {
    public static void main(String[] args) {
        int[] meters = {120, 90, 300, 150, 200, 75, 400, 50, 180, 220, 310, 95};

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        int firstIndex = -1, secondIndex = -1, thirdIndex = -1;

        for (int i = 0; i < meters.length; i++) {
            if (meters[i] > first) {
                third = second; thirdIndex = secondIndex;
                second = first; secondIndex = firstIndex;
                first = meters[i]; firstIndex = i;
            } else if (meters[i] > second) {
                third = second; thirdIndex = secondIndex;
                second = meters[i]; secondIndex = i;
            } else if (meters[i] > third) {
                third = meters[i]; thirdIndex = i;
            }
        }

        System.out.println("Top 3 meters with most coins:");
        System.out.println("1. Meter " + (firstIndex + 1) + " with " + first + " coins");
        System.out.println("2. Meter " + (secondIndex + 1) + " with " + second + " coins");
        System.out.println("3. Meter " + (thirdIndex + 1) + " with " + third + " coins");
    }
}
