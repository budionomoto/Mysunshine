package com.example.budiono.mysunshine.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by budiono on 20/01/18.
 */

public class WeatherResponse {
    @SerializedName("list")
    private List<Forecast> forecastList;

    public List<Forecast> getForecastList() {
        return forecastList;
    }
}
