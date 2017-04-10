package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Database for Now
 */

public class Now {
    @SerializedName("tmp")
    public String tempearature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
