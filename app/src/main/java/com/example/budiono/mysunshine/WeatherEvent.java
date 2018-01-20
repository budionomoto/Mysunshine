package com.example.budiono.mysunshine;

import com.example.budiono.mysunshine.model.Forecast;

import java.util.List;

/**
 * Created by budiono on 20/01/18.
 */

public class WeatherEvent {
    private boolean success;
    private String message;
    private List<Forecast> forecastList;

    public WeatherEvent(boolean success, List<Forecast> forecastList) {
        this.success = success;
        this.forecastList = forecastList;
    }

    public WeatherEvent(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public List<Forecast> getForecastList() {
        return forecastList;
    }



}
