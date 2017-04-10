package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * According to weather API data, create the database
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public  Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
