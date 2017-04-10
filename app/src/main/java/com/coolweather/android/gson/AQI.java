package com.coolweather.android.gson;

/**
 * Database for Aqi
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
