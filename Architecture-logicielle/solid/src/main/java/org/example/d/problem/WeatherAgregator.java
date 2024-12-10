package org.example.d.problem;

public class WeatherAgregator {

    private CelciusWeatherApi celciusWeatherApi = new CelciusWeatherApi();
    private FarhWeatherApi farhWeatherApi = new FarhWeatherApi();

    public double getTemperature() {
        return (celciusWeatherApi.getTemperatureCelcius()
                + toCelcius(farhWeatherApi.getTemperatureFahr()))/2;
    }

    private double toCelcius(double temp) {
        return (farhWeatherApi.getTemperatureFahr()- 32)/1.8f;

    }


}
