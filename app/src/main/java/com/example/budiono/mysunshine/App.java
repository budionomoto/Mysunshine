package com.example.budiono.mysunshine;

import android.app.Application;
import com.google.gson.Gson;
import org.greenrobot.eventbus.EventBus;
import retrofit2.Retrofit;
import com.google.gson.GsonBuilder;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by budiono on 20/01/18.
 */

public class App extends Application {

    private static App instance;
    private EventBus eventBus;
    private Gson gson;
    private Retrofit retrofit;

    public App(){
        instance = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        createEventBus();
        createGson();
        createRetrofit();
    }

    private void createGson() {
        gson = new GsonBuilder().create();
    }

    private void createEventBus() {
        eventBus = EventBus.builder()
                .logNoSubscriberMessages(false)
                .sendNoSubscriberEvent(false)
                .build();
    }

    private void createRetrofit() {
        retrofit = new Retrofit.Builder()
                .baseUrl(WeatherApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Gson getGson() {
        return gson;
    }

    public EventBus getEventBus() {
        return eventBus;
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

    public WeatherApi getWeatherApi() {
        return getRetrofit().create(WeatherApi.class);
    }

    public static App getInstance() {
        return instance;
    }
}
