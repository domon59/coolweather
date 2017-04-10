package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**Create a instance to include all the database
 * */

public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
