import java.util.Arrays;

public class ParkingMeterCoinsSimple {
    public static void main(String[] args) {
        int[] meters = {120, 90, 300, 150, 200, 75, 400, 50, 180, 220, 310, 95};

        Arrays.sort(meters); 
        int n = meters.length;
        System.out.println("Top 3 meters with most coins:");
        System.out.println(meters[n - 1]); 
        System.out.println(meters[n - 2]); 
        System.out.println(meters[n - 3]); 
    }
}
