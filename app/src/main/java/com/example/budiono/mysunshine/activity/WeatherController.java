package com.example.budiono.mysunshine.activity;

import android.util.Log;

import com.example.budiono.mysunshine.App;
import com.example.budiono.mysunshine.WeatherApi;
import com.example.budiono.mysunshine.model.WeatherResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by budiono on 20/01/18.
 */

public class WeatherController {

    private static final String TAG = "WeatherController";

    public void getWeatherList() {
        Call<WeatherResponse> dailyForecast = App.getInstance().getWeatherApi().getDailyForecast("Jakarta", "json", "metric", 10, WeatherApi.API_KEY);
        dailyForecast.enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
                Log.d(TAG, "onResponse: Success");
                Log.d(TAG, "onResponse: JSON = " + App.getInstance().getGson().toJson(response.body()));
            }

            @Override
            public void onFailure(Call<WeatherResponse> call, Throwable t) {
                Log.e(TAG, "onFailure: Failed");
                Log.e(TAG, "onFailure: Message = " + t.getMessage());
            }
        });
    }
    
}
