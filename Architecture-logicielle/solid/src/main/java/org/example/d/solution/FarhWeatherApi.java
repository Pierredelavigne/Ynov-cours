package org.example.d.solution;

public class FarhWeatherApi implements WeatherSource {

    private double getTemperatureFahr() {
        return 0;
    }

    private double toCelcius(double temp) {
        return (temp - 32)/1.8f;
    }

    @Override
    public double getTemperatureCelcius() {
        return toCelcius(getTemperatureFahr());
    }
}
