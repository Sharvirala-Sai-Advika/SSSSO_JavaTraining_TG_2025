
import java.util.Scanner;

class CarTrip {
    double fuelEfficiency; 
    double fuelPrice;     
    double tripDistance;   

    CarTrip(double fuelEfficiency, double fuelPrice, double tripDistance) {
        this.fuelEfficiency = fuelEfficiency;
        this.fuelPrice = fuelPrice;
        this.tripDistance = tripDistance;
    }


    double calculateFuelNeeded() {
        return tripDistance / fuelEfficiency;
    }

    double calculateFuelCost() {
        return calculateFuelNeeded() * fuelPrice;
    }
}

public class CarTripCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fuel efficiency (km per liter): ");
        double efficiency = sc.nextDouble();

        System.out.print("Enter fuel price per liter: ");
        double price = sc.nextDouble();

        System.out.print("Enter trip distance (km): ");
        double distance = sc.nextDouble();


        CarTrip trip = new CarTrip(efficiency, price, distance);

        
        double fuelNeeded = trip.calculateFuelNeeded();
        double fuelCost = trip.calculateFuelCost();

        System.out.println("Fuel needed for the trip: " + fuelNeeded + " liters");
        System.out.println("Estimated fuel cost: " + fuelCost + " currency units");

        sc.close();
    }
}
