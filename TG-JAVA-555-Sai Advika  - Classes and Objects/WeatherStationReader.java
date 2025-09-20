class Weather {
    double tempC;
    double humidity;

    Weather(double tempC, double humidity) {
        this.tempC = tempC;
        this.humidity = humidity;
    }

    double toFahrenheit() {
        return (tempC * 9/5) + 32;
    }

    void isComfortable() {
        if (tempC >= 20 && tempC <= 25 && humidity >= 40 && humidity <= 60) {
            System.out.println("Weather is comfortable");
        } else {
            System.out.println("Weather is not comfortable");
        }
    }
}

public class WeatherStationReader {
    public static void main(String[] args) {
        Weather reading = new Weather(22, 50);
        System.out.println("Temperature in Fahrenheit: " + reading.toFahrenheit());
        reading.isComfortable();
    }
}
