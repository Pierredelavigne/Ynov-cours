package org.example.d.solution;

import java.util.Arrays;

public class WeatherAgregator {

    private WeatherSource[] weatherSources;

    public WeatherAgregator(WeatherSource[] weatherSources) {
        this.weatherSources = weatherSources;
    }

    public double getTemperature() {
        return Arrays.
                stream(weatherSources)
                .mapToDouble(WeatherSource::getTemperatureCelcius)
                .average()
                .getAsDouble();
    }




}
