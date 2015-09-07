package com.leftshift.weatherapp.model;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by divya jaisawal on 9/2/2015.
 */
public class WeatherForecast {

    private List<DayForecast> daysForecast = new ArrayList<DayForecast>();

    public void addForecast(DayForecast forecast) {
        daysForecast.add(forecast);
        Log.d("Forecast", "Add forecast [" + forecast + "]");
    }

    public DayForecast getForecast(int dayNum) {
        if (!daysForecast.isEmpty()) {
            return daysForecast.get(dayNum);
        } else {
            return null;
        }
    }
}
