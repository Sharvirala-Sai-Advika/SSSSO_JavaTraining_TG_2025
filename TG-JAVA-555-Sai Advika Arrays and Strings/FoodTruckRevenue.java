public class FoodTruckRevenue {
    public static void main(String[] args) {
        int[] revenue = {250, 320, 280, 400, 150, 500, 310, 330, 290, 270, 350, 305, 410, 295};
        int target = 300;
        int count = 0;

        for (int i = 0; i < revenue.length; i++) {
            if (revenue[i] > target) {
                count++;
            }
        }

        System.out.println("Number of days with revenue above $" + target + ": " + count);
    }
}
